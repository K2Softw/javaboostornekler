package com.bilgeadam.lesson004;
import java.util.Random;
import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Kaç sayı girişi yapılacak?");
		int x = scan.nextInt();
		
		if (x==2) {
			System.out.println("Toplanacak ilk sayiyi giriniz.");

			int sayi1 = scan.nextInt();
			System.out.println("Toplanacak ikinci sayiyi giriniz.");

			int sayi2 = scan.nextInt();
			
			int sonuc = topla(sayi1,sayi2);
			System.out.println("Sayilarin toplami = " + sonuc);
			

			
		}
		else {
			
			
			
		}
	}
	public static int topla(int x,int y) {
		
		int sonuc = x+y;
		
		
		return sonuc;
	}
	
	
	
}
		

		
