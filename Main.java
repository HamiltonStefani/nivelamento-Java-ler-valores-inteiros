package exercicioparalerquatrovaloresinteiros;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		int d;
		int diferenca;
		
		System.out.println("Digite a:");
		a = sc.nextInt();
		System.out.println("Digite b:");
		b = sc.nextInt();
		System.out.println("Digite c:");
		c = sc.nextInt();
		System.out.println("Digite d:");
		d = sc.nextInt();
		
		diferenca = a * b - c * d;
		
		System.out.println("a DIFERENÇA é: " + diferenca);
		
		
		
		sc.close();

	}

}
