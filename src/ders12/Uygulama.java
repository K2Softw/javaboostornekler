package ders12;
import java.util.Random;

public class Uygulama {
	Kart kart = new Kart();
	Random rand = new Random();
	public static void main(String[] args) {
		
		Uygulama uygulama = new Uygulama();
		
		String[][] deste = uygulama.desteyiGoster();
		
		for(int i = 0;i<4;i++) {
			for(int j = 0;j<13;j++) {
		System.out.println(uygulama.desteyiKaristir(deste)[i][j]);

			}}
		
	}
	
	
public int[] desteyiOlustur() {
	int deste[] = new int[kart.kartNumaralari.length * kart.kartTurleri.length];
	for(int i=0;i<deste.length;i++) {
		
		deste[i]=i;
	}
	return deste;
	
}
public String[][] desteyiGoster() {
	String[][] deste = new String[kart.kartTurleri.length][kart.kartNumaralari.length];

	for(int i=0;i<kart.kartTurleri.length;i++) {
		for(int j=0;j<kart.kartNumaralari.length;j++) {
			deste[i][j] = kart.kartTurleri[i] + " " + kart.kartNumaralari[j];
			//System.out.println(deste[i][j]);
		}
	}
	return deste;
	
	
}
public String[][] desteyiKaristir(String deste[][]){
int y;
int z;
	for(int i=0;i<kart.kartTurleri.length;i++) {
		for(int j=0;j<kart.kartNumaralari.length;j++) {
			String x;
			String h;
			y = rand.nextInt(kart.kartTurleri.length);
			z = rand.nextInt(kart.kartNumaralari.length);
			x = deste[y][z];
			h = deste[i][j];
			
			deste[i][j] = x;
			deste[y][z] = h;
		}
		}
	return deste;
}
}

