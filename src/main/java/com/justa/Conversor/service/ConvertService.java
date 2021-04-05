package com.justa.Conversor.service;

import java.lang.Math;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Component;

import com.justa.Conversor.ConversorApplication;
@Component
public class ConvertService {
	public Double covertUnit(String unit_name, double multiplication_factor) {
		switch (unit_name) {
		case "minute":
			return timeMinutesForSeconds(multiplication_factor);
			 
		case "hour":
			return timeHoursForSeconds(multiplication_factor);
			
		case "day":
			return timeDaysForSeconds(multiplication_factor);
			
		case "degree":
			return calculateDegree(multiplication_factor);
		
		case "arcminute":
			return arcMinute(multiplication_factor);
			
		case "arcsecond":
			return arcSecond(multiplication_factor);
			
		case "hectare":
			return 	hectareForMeters(multiplication_factor);
			
		case "litre":
			return 	literForVolume(multiplication_factor);
			
		case "tonne":
			return 	tonneForKilgram(multiplication_factor);
			
		}
		return multiplication_factor;
}

	public Double calculateDegree(double rad) {
		double grau = rad * (Math.PI / 180);
		return grau;
	}

	public Double arcMinute(double rad) {
		double grau = rad * (Math.PI / 10800);
		return grau;
	}

	public Double arcSecond(double rad) {
		double grau = rad * (Math.PI / 648000);
		return grau;
	}

	public Double timeMinutesForSeconds(double minute) {
		double seconds;
		seconds = (minute * 60);
		return seconds;
	}

	public Double timeHoursForSeconds(double hours) {
		double seconds = (hours * 3600);
		return seconds;
	}

	public Double timeDaysForSeconds(double days) {
		double seconds = (days * 86400);
		return seconds;
	}

	public Double hectareForMeters(double Hectare) {
		double meters = (Hectare * 10000);
		return meters;

	}

	public Double literForVolume(double liter) {
		double volume = liter / 1000;
		return volume;
	}

	public Double tonneForKilgram(double tonne) {
		double kilogram = tonne * 1000;
		return kilogram;
	}
}