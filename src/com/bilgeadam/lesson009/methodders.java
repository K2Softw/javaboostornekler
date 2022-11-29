package com.bilgeadam.lesson009;
import java.util.Scanner;

public class methodders {

	
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int secim = 0;
		menu();
		secim = islem();
		while(secim!=0) {
			
			
		}
		

}

	public static void menu() {
		
	
	      System.out.println("==Hesap makinesi===\n"); 
	      System.out.println("1- Topla"); 
	      System.out.println("2- Çıkar");      
	      System.out.println("3- Çarp");  
	      System.out.println("4- Böl");  
	      System.out.println("0- Çıkış"); 
	      System.out.println("Bir işlem Seçiniz");
	      
	      ;
	}
	public static int islem() {
		Scanner scan = new Scanner(System.in);
		int secim;
		secim = scan.nextInt();


		
		
	return secim;
	}
	}