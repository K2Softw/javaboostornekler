package com.bilgeadam.lesson009;
import java.util.Scanner;

public class Odev1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Bir tek sayı giriniz.");
		int sayi = sc.nextInt();
		System.out.println("Sütun sayısı giriniz.");
		int sutun = sc.nextInt();
		System.out.println("Satır sayısı giriniz.");
		int satir = sc.nextInt();
		
		int ustsayi = sayi/2+1;
		
		for(int i=0;i<sutun;i++) {
			System.out.println("\n");
			for(int j=0;j<satir;j++) {
				if(i==j) {
					System.out.print(ustsayi + "  ");
				}
				else if(i<j) {
					System.out.print(sayi + "  ");
				}
				else {
					System.out.print("1  ");
				}

			}
		}

	}

}
