package maratonSoru1;

import java.util.Scanner;

public class maratonSoru1 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int sayi1;
		int sayi2;
		int value;
		int sayilar[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,};
		int sayiSayisi = 0;
		double sonuc;
		System.out.println("Yapacağınız işlem türünü seçiniz.");
		System.out.println("1-Toplama");
		System.out.println("2-Çıkartma");
		System.out.println("3-Çarpma");
		System.out.println("4-Bölme");
		System.out.println("5-Üçgen Alan Hesabı");
		System.out.println("6-Dikdörtgen Alan Hesabı");
		System.out.println("7-Daire Alan Hesabı");
		value = scan.nextInt();

switch(value) {

case 1:
System.out.println("Toplama işlemini seçtiniz. Kaç sayı toplamak istediğinizi giriniz.");
	sayiSayisi = scan.nextInt();
	System.out.println("Sırasıyla "+sayiSayisi+" sayı giriniz." );
	for(int i=0;i<sayiSayisi;i++) {
		sayilar[i] = scan.nextInt();
	}
System.out.println("Seçtiğiniz işlemin sonucu = " + aritmetik.toplama(sayilar, sayiSayisi));
sonuc = aritmetik.toplama(sayilar,sayiSayisi);
break;


case 2:
	System.out.println("Çıkartma işlemini seçtiniz. Kaç sayı çıkartmak istediğinizi giriniz.");
	sayiSayisi = scan.nextInt();
	System.out.println("Sırasıyla "+sayiSayisi+" sayı giriniz." );
	for(int i=0;i<sayiSayisi;i++) {
		sayilar[i] = scan.nextInt();
	}
System.out.println("Seçtiğiniz işlemin sonucu = " + aritmetik.cikartma(sayilar, sayiSayisi));
sonuc = aritmetik.cikartma(sayilar,sayiSayisi);
break;

case 3:
	System.out.println("Çarpma işlemini seçtiniz. Kaç sayı çarpmak istediğinizi giriniz.");
	sayiSayisi = scan.nextInt();
	System.out.println("Sırasıyla "+sayiSayisi+" sayı giriniz." );
	for(int i=0;i<sayiSayisi;i++) {
		sayilar[i] = scan.nextInt();
	}
System.out.println("Seçtiğiniz işlemin sonucu = " + aritmetik.carpma(sayilar, sayiSayisi));
sonuc = aritmetik.carpma(sayilar,sayiSayisi);
break;


case 4:
	System.out.println("Bölme işlemini seçtiniz. Kaç sayı bölmek istediğinizi giriniz.");
	sayiSayisi = scan.nextInt();
	System.out.println("Sırasıyla "+sayiSayisi+" sayı giriniz." );
	for(int i=0;i<sayiSayisi;i++) {
		sayilar[i] = scan.nextInt();
	}
sonuc = aritmetik.bolme(sayilar,sayiSayisi);
System.out.println("Seçtiğiniz işlemin sonucu = " + sonuc);

break;



case 5:
	System.out.println("Üçgenin yüksekliğini ve taban kenar uzunluğunu giriniz.");
	sayi1 = scan.nextInt();
	sayi2 = scan.nextInt();
	sonuc = aritmetik.ucgenalanhesabi(sayi1, sayi2);
System.out.println("Seçtiğiniz işlemin sonucu = " + sonuc);
break;



case 6:
	System.out.println("Dikdörtgenin kenar uzunluklarını giriniz.");
	sayi1 = scan.nextInt();
	sayi2 = scan.nextInt();
	sonuc = aritmetik.dikdortgenalanhesabi(sayi1,sayi2);
	System.out.println("Seçtiğiniz işlemin sonucu = " + sonuc);
	break;
	
	
	
case 7:
	System.out.println("Dairenin yarıçapını giriniz.");
	sayi1 = scan.nextInt();
	sonuc = aritmetik.cemberalanhesabi(sayi1);
	System.out.println("Seçtiğiniz işlemin sonucu = " + sonuc);

}
	}}
