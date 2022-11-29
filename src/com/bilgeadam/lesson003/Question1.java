package com.bilgeadam.lesson003;
import java.util.Scanner;

public class Question1 {
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sayi;
		int i=0;
		boolean kontrol=true;
		System.out.println("Bir sayi giriniz");
		
		sayi = scan.nextInt();
		
		for(i=sayi-1;i>1;i--) {
			
			if(sayi%i==0) {
				i=1; kontrol=false;
			}
			else {kontrol=true;}
			
			
			
		}
		if(kontrol) {
			System.out.println("Sayı asaldır.");		
	}
		else {
			System.out.println("Sayı asal değildir.");		

		}
		
	
	}}
	
	

