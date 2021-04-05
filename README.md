<h1 align="center">Nome do Projeto</h1>

<p align="center">🚀 API de conversão de valores para o sistema mundial de unidades</p>

<h4 align="center"> 
	🚧 Em construção...  🚧
</h4>

### Features

- [x] Conversor de minutos para segundos
- [x] Conversor de horas para segundos
- [x] Conversor de dias para segundos
- [x] Conversor de graus para ângulo sem unidade / plano
- [x] Conversor de arcminutes para ângulo sem unidade / plano
- [x] Conversor de arcsecundes para ângulo sem unidade / plano
- [x] Conversor de hectare para área
- [x] Conversor de litros para volume
- [x] Conversor de toneladas para massa


<h3>Como usar</h3>

1.Rode o comando no terminal:</p>
<b>docker build -t conversor-app .</b>

2.Depois rode o comando:</p>
<b>docker images</p></b>
Obs: você vera que  foi criado uma imagem docker do app com nome conversor-app.</p>

3.Por ultimo rode o comando:</p>
<b>docker run -p 8080:8080</p></b>
Obs: O mesmo ira executar a imagem docker na porta 8080 que é o mesmo do apache que ira rodar como seu localhost</p>

4. Com todos os comandos rodados você podera usar o <b>insominia</b> ou <b>postman</b> para executar os comandos:</p>
<b>localhost:8080/units/TipodeUnidade/Valor</b></p>
<b>Obs:</b>Você executarar como uma requisição <b>GET</b>, podera mudar os valores no link acima na parte TipodeUnidade você passara as unidades do tipo SI como EX: minute, hour,day e etc..., na parte valor irá passar o valor que sera convertidopara o fomato requisitado 
