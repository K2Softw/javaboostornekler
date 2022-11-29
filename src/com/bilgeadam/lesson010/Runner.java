package com.bilgeadam.lesson010;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
		System.out.println("***************************");
		System.out.println("***********ÖZEL DİZİ**************");
		System.out.println("***************************");
		System.out.println("");
		int secim=0;
		Scanner sc = new Scanner(System.in);
		
		do {
		System.out.println("1-Ekle");
		System.out.println("2-Listele");
		System.out.println("0-Çıkış");
		secim = sc.nextInt();
		
		switch (secim) {
		case 1: 		System.out.println("Eklenecek İfade.....:");
						String ifade = sc.nextLine();

			break;
		case 2: for(int i=0;i<MyArray.size();i++) {
			System.out.println(MyArray.list()[i]);
		}
			break;
		case 3:
            System.out.println("Silmek istediğiniz kayıt....: ");
            int index = sc.nextInt();
            MyArray.remove(index);
            break;
		default: throw new IllegalArgumentException("Unexpected Value: " + secim);
		

		}}
		while(secim!=0);

	}

}
