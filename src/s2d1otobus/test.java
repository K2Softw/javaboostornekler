package s2d1otobus;

public class test {
	
	public static void main(String[] args) {
		Durak durak1 = new Durak();
		Durak durak2 = new Durak();
		Durak durak3 = new Durak();
		Durak durak4 = new Durak();
		Guzergah guzergah1 = new Guzergah();
		Guzergah guzergah2 = new Guzergah();
		Otobus otobus1 = new Otobus();
		
		
		durak1.durakİsmi = "Taksim Meydanı";
		durak1.durakNo = 72;
		durak1.konum = "Taksim";
		guzergah1.hatNo = 40;
		guzergah1.durakListesi = new Durak[3];
		otobus1.guzergah = guzergah1;
		otobus1.guzergah.durakListesi[0] = durak1;
		
		
		durak2.durakİsmi = "Söğütlüçeşme";
		durak2.durakNo = 72;
		durak2.konum = "Taksim";
		guzergah1.hatNo = 40;
		guzergah1.durakListesi[1] = durak2;
		otobus1.guzergah=guzergah1;
		
		
		for(int i=0;i<otobus1.guzergah.durakListesi.length-1;i++) {
			System.out.println(otobus1.guzergah.durakListesi[i].durakİsmi);


		}
		

		


		
		
		

	}

}
