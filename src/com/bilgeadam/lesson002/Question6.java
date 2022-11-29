package com.bilgeadam.lesson002;
import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Cemberin yaricapini giriniz.");
		int yaricap = scan.nextInt();
		System.out.println("Cemberin yaricapini giriniz.");
		double cevre = yaricap*2*3.14;
		double alan = yaricap*yaricap*3.14;
		System.out.println("Cemberin cevresi = " + cevre);
		System.out.println("Cemberin alani = " + alan);

		// TODO Auto-generated method stub

	}

}
