package com.bilgeadam.lesson011;

import java.util.Scanner;



public class Uygulama {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int secim;
		menu();
        secim = secimyap();
        uygulamayiBaslat(secim);
	}
	


	public static Kullanici kayitOl() {
		
		Kullanici kullaniciadi = new Kullanici();
		System.out.println("Mail giriniz.");

		kullaniciadi.email = sc.next();;
		System.out.println("İsim giriniz.");

		kullaniciadi.isim = sc.next();
		System.out.println("Şifre giriniz.");

		kullaniciadi.password = sc.next();
		System.out.println("Başarıyla kayıt oldunuz.");

		kullaniciadi.id = Database.uzunluk + 1;
		Database.kullaniciListesi[Database.uzunluk] = kullaniciadi;
		Database.uzunluk++;
		Database.kullaniciEkle(kullaniciadi);
		return kullaniciadi;
	}
	
		public static int secimyap(){
		System.out.println("Seçim yapınız");

		return sc.nextInt();

	}
		public static void menu(){
		System.out.println("1-Kayıt Ol");
	    System.out.println("2-Giriş Yap");
	    System.out.println("3-Kullanıcıları göster");
	    System.out.println("4-Çıkış");
	    
		}
	
	
	public static int uygulamayiBaslat(int secim) {
		
		switch(secim) { 
		
		case 1: 
		kayitOl();
		break;
		
		case 2: 
		
	}
		return secim;

}
}