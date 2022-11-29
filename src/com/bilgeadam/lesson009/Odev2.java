package com.bilgeadam.lesson009;

public class Odev2 {

	public static void main(String[] args) {

		int[] intArray = {1,1,6,8,8,0,4,3,7,1,0,6,4,6,2,1,5};
		int x = (intArray.length-1);
		int[] arttirma = new int [x];
		int sayac=0;
		int[] kontrol = new int [x];
		
		for(int i=0;i<x;i++) {
			for(int j=0;j<x;j++) {
				
				if (intArray[x-j]==intArray[i]) {
					
					if(arttirma[i]>=1) {
						
						arttirma[i]++;
					}
					else {arttirma[i]=1;}
				}
			}
			System.out.println(intArray[i]+" Sayısı " + (arttirma[i]+1) + " kere tekrar etmiştir.");
			
	}
		
			
		}

	}
