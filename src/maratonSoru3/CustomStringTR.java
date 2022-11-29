package maratonSoru3;

public class CustomStringTR {



public static String degistir(char deger1,char deger2,String yazi) {
	String sonuc = yazi.replace(deger1, deger2);
	return sonuc;
}

public static String[] parcala(String yazi) {
	String[] sonuc = yazi.split(" ");
	return sonuc;
	
}
public static String buyukHarf(String yazi) {
	
	String sonuc = yazi.toUpperCase();
	
	return sonuc;
}
public static String kucukHarf(String yazi) {
	
	String sonuc = yazi.toLowerCase();
	
	return sonuc;
}
public static int uzunluk(String yazi) {
	
	int sonuc = yazi.length();
	
	return sonuc;
}

public static char karakterSecim(String yazi, int secim) {
	
	char sonuc = yazi.charAt(secim);
	return sonuc;
	
}
public static boolean varMi(String yazi,String kontrol) {
	
	boolean sonuc = yazi.contains(kontrol);
	
	return sonuc;
	
}
public static int endeks(String yazi, String kontrol) {
	
	int sonuc = yazi.indexOf(kontrol);
	
	return sonuc;
}
public static boolean bosMu(String yazi){
	
	boolean sonuc = yazi.isEmpty();
	
	return sonuc;
	
}

public static char[] karakterDizisi(String yazi) {
	
	char [] sonuc = yazi.toCharArray();
	
	return sonuc;
	
}
	














}