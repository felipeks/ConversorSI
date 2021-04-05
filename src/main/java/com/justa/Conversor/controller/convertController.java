package com.justa.Conversor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.justa.Conversor.service.ConvertService;

@RestController
@RequestMapping("/units")
public class convertController {
	@Autowired
	ConvertService ConvertService;

	@GetMapping(path = "/{unit_name}/{multiplication_factor}")
	public Double calculateUnits(@PathVariable ("unit_name") String unit_name, @PathVariable ("multiplication_factor") double multiplication_factor) {
		multiplication_factor = ConvertService.covertUnit(unit_name, multiplication_factor);
		return multiplication_factor;
	}
}
