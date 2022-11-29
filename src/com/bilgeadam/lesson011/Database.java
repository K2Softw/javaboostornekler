package com.bilgeadam.lesson011;

public class Database {

	static Kullanici[] kullaniciListesi = new Kullanici[5];

	static int uzunluk = 0;

	public static void veriTabanıBaslangıcDegerleri() {

		Kullanici kullanici = new Kullanici();
		kullanici.email = "mustafa@gmail.com";
		kullanici.isim = "Mustafa";
		kullanici.password = "123";
		kullanici.id = uzunluk + 1;
		kullaniciListesi[0] = kullanici;
		uzunluk++;
		
		Kullanici kullanici2 = new Kullanici();
		kullanici2.email = "merve@gmail.com";
		kullanici2.isim = "Merve";
		kullanici2.password = "123";
		kullanici2.id = uzunluk + 1;
		kullaniciListesi[1] = kullanici2;	
		uzunluk++;
		
		Kullanici kullanici3 = new Kullanici();
		kullanici3.email = "yasin@gmail.com";
		kullanici3.isim = "Yasin";
		kullanici3.password = "123";
		kullanici3.id = uzunluk + 1;
		kullaniciListesi[2] = kullanici3;
		uzunluk++;
	}
	
	public static void kullaniciEkle(Kullanici kullanici) {
		kullaniciListesi[uzunluk] = kullanici;
		uzunluk +=1;
	}

}