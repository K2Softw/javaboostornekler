package maratonSoru2;

import java.util.Scanner;

public class maratonSoru2 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		sayiDizisiSinifi sayidizisi = new sayiDizisiSinifi();
		
		sayidizisi.dizi = new int[10];
		
		sayiDizisiSinifi.uzunluk = 5;
		
		int dizi[] = sayiDizisiSinifi.dizi;
		int secim = 1;
		System.out.println("Yapmak istediğiniz işlemi seçiniz.");

		do {
		System.out.println("\n\n");
		System.out.println("1-Ekle");
		System.out.println("2-Kaldır");
		System.out.println("3-Araya Ekle");
		System.out.println("4-Listeyi Göster");
		System.out.println("0-Çıkış yap. \n\n");
		secim = scan.nextInt();
		




	switch(secim) {
	case 1:
		System.out.println("Dizinin sonuna eklemek istediğiniz sayıyı giriniz.");
		int ekleneceksayi = scan.nextInt();
		sayiDizisiSinifi.Ekle(sayidizisi,ekleneceksayi);


		break;
	case 2:
		System.out.println("Dizinin kaçıncı elemanını silmek istiyorsunuz?.");
		int silineceksayi = scan.nextInt();
		sayiDizisiSinifi.Sil(sayidizisi,silineceksayi);
		break;
	case 3:
		System.out.println("Sırasıyla eklemek istediğiniz sayıyı ve ekleneceği indeksi giriniz.");
		int endeks = scan.nextInt();
		int arayaekleneceksayi = scan.nextInt();
		sayiDizisiSinifi.ArayaEkle(sayidizisi,arayaekleneceksayi,endeks);
		break;
	case 4:
		for(int i=0;i<sayidizisi.dizi.length;i++) {
			System.out.print(sayidizisi.dizi[i]+" ");
			}
		System.out.print("\n");
		break;
	} 
		}while (secim!=0);



	}

	
}



