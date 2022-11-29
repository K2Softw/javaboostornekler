package com.bilgeadam.lesson009;
import java.util.Scanner;
public class runner_Islemler {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Araç fiyatı......");
		double fiyat = sc.nextDouble();
		System.out.println("Motor gücü......");
		int guc = sc.nextInt();
		
		Islemler islem = new Islemler();
		System.out.println("Ötvli fiyat = " + islem.otv_hesapla(fiyat, guc));


		

	}

}
