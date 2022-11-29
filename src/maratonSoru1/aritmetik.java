package maratonSoru1;

public class aritmetik {


public static int toplama(int[] sayilar,int sayiSayisi) {
	int sonuc = 0;
	for(int i=0;i<sayiSayisi;i++) {
		
		
		sonuc = sayilar[i]+sonuc;
		
	}
	return sonuc;

	}

public static int cikartma(int[] sayilar,int sayiSayisi) {
	int sonuc = 0;
	for(int i=0;i<sayiSayisi;i++) {
		
		
		sonuc = sonuc-sayilar[i];
		
	}
	return sonuc;

	}
public static int carpma(int[] sayilar,int sayiSayisi) {
	int sonuc = 1;
	for(int i=0;i<sayiSayisi;i++) {
		
		
		sonuc = sayilar[i]*sonuc;
		
	}
	return sonuc;

	}
public static float bolme(int[] sayilar,int sayiSayisi) {
	float sonuc = sayilar[0];
	for(int i=1;i<sayiSayisi;i++) {
		
		
		sonuc = sonuc/sayilar[i];
		
	}
	return sonuc;

	}
public static double ucgenalanhesabi(int sayi1, int sayi2) {
	
	
	
	double sonuc = (sayi1*sayi2/2);
	
	return sonuc;
}
public static float dikdortgenalanhesabi(int sayi1, int sayi2) {
	
	int sonuc = sayi1*sayi2;
	return sonuc;
	
}

public static double cemberalanhesabi(int yaricap) {
	double sonuc = yaricap*3.14*yaricap;
	return sonuc;
}
}