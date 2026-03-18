package br.com.fiapride.model;

public class veiculos {
	
	private String proprietario;
	private String placa;
	private double gas;


	public veiculos(String placa, String proprietario, Double gas) {
		this.setPlaca(placa);
		this.setProprietario(proprietario);
		this.setGas(gas);
    }



public void adicionar(double volume) {
	System.out.println("Gasolina adicionada! Gasolina restante: " + gas + " L");
	gas = gas + volume; }

	


 public void gasta(double volume) {
	 if (volume > this.gas) {
		 System.out.println("Quantidade de gasolina insuficiente!");
	 }else {
		 gas = gas - volume;
		 System.out.println("Gasolina utilizada! Gasolina restante: " + gas + " L");
	 
	 	}
 
 }
 
 public String getPlaca() {
     return this.placa;
 }
 
 public String getProprietario() {
     return this.proprietario;
 }
 
 
 private void setPlaca(String placa) {
     this.placa = placa;
 }

 public void setProprietario(String proprietario) {
     this.proprietario = proprietario;
 }
 
 private void setGas(Double gas) {
     this.gas = gas;
 }

 public Double getGas() {
     return this.gas;
 }
 
 
 }
