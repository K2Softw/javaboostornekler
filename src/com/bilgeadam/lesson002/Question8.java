package com.bilgeadam.lesson002;
import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen faktoriyeli hesaplanacak sayiyi giriniz.");
		int sayi = scan.nextInt();
		int toplam = 1;
		int i;
		for(i=sayi;i>0;i--) {
			toplam=toplam*i;
		}
		System.out.println("toplam = " + toplam);

	}

}
