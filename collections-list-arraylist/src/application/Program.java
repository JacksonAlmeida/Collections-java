package application;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
//		System.out.println("Crie uma lista e adicione as sete notas: ");
		List<Double> notas = new ArrayList<>();
		notas.add(3d);
		notas.add(1d);
		notas.add(5d);
		notas.add(6d);
		notas.add(18d);
		notas.add(27d);
		notas.add(0d);
//		System.out.println(notas.toString());
//		
//		
//		System.out.println("Exiba a posi��o da nota 5.0: " + notas.indexOf(5d));
		
		System.out.println("Adicione o elemento na lista com a nota 8.0 na posi��o 4:");
		notas.add(4, 8d);
		System.out.println(notas.toString());
		
		System.out.println("Substitua a nota 5.0 pela a nota 7.0:");
		notas.set(notas.indexOf(5d), 7d);
		System.out.println(notas.toString());
		
		System.out.println("Confirir se a nota 5.0 est� na list: "+ notas.contains(5d));
	}

}