package maratonSoru2;

public class sayiDizisiSinifi {
	static int uzunluk;
	static int index = 0;
	static int[] dizi;
	public static void Ekle(sayiDizisiSinifi sayidizisi,int sayi) {
		if(sayidizisi.dizi.length<index) {

			
		}
		sayidizisi.dizi[sayiDizisiSinifi.index] = sayi;
		sayiDizisiSinifi.index++;
	}
	
	public static void Sil(sayiDizisiSinifi sayidizisi,int sayi) {
		
		sayidizisi.dizi[sayi-1] = 0;
		sayiDizisiSinifi.index--;
		
		
	}
	public static void ArayaEkle(sayiDizisiSinifi sayidizisi, int sayi,int endeks) {
		int gecici = sayidizisi.dizi[endeks-1];
		int[] gecicidizi = sayidizisi.dizi;
		
		for(int i=0;i<sayidizisi.dizi.length;i++) {
		gecicidizi[i] = sayidizisi.dizi[i];
		}
		
		sayidizisi.dizi[endeks-1] = sayi;
		sayidizisi.dizi[endeks] = gecici;
		
		for(int i=endeks;i<sayidizisi.dizi.length-1;i++) {
			
			sayidizisi.dizi[i] = gecicidizi[i];
			
		}
		for(int i=0;i<gecicidizi.length;i++) {
			
			System.out.print(" "+gecicidizi[i]);
			
		}
		sayiDizisiSinifi.index++;

	}
}
