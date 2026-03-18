package br.com.fiapride.main;
import br.com.fiapride.model.veiculos;


public class principal {

	public static void main(String[] args) {
		veiculos v1 = new veiculos("SFA-123","Henrique", 0.0);
		v1.adicionar(50);
		v1.gasta(100);
		System.out.println("Dono: " + v1.getProprietario() + " | Placa: " + v1.getPlaca() + " | Gasolina: " + v1.getGas());

		 }


	}


