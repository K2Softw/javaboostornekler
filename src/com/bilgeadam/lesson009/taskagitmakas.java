package com.bilgeadam.lesson009;
import java.util.Scanner;
import java.util.Random;


public class taskagitmakas {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int giris = 1;
		tkmArray tkm = new tkmArray();
		
		String[] dizi = tkm.strArray;
while (giris == 1) {
	
	System.out.println("Tas kagit makas oynamak icin 0 a basiniz");
	giris = scan.nextInt();

while (giris == 0) {
	
	
		System.out.println("\nTaş için 1, Kağıt için 2, Makas için 3 çıkmak için ise 4'e basınız.");
		int kullanici;
		int bilgisayar = randomSayi();
		kullanici = scan.nextInt();
		if(kullanici == 4) {
			giris = 1;
		}
		else {
		System.out.println("Seçiminiz = " + dizi[kullanici-1]);
		System.out.println("\nBilgisayarın seçimi = " + dizi[bilgisayar]);
		if(kullanici-1>bilgisayar && bilgisayar != 0) {
			System.out.println("\nTebrikler kazandınız!");
		}
		else if(bilgisayar == 0 && kullanici-1==2){
			System.out.println("\nTebrikler kazandınız!");
		}
		else if(kullanici-1==bilgisayar) {
			System.out.println("\nBerabere kaldınız!");
		}
		else {
			System.out.println("\nBilgisayar kazandı!");
		}
		}}
	}
	}

public static int randomSayi() {
	
	Random rand = new Random();
	
	int sayi = 2;
	
	return rand.nextInt(3);

	
}}