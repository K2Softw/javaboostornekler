package com.bilgeadam.lesson009;

public class enkucukdeger {

	public static void main(String[] args) {
	int[] array = {1,5,-4,3};
	int sonuc = 15;
	
	
	for(int i=0;i<4;i++) {
		for(int j=0;j<4;j++) {
			if(i!=j) {
			if(Math.abs(array[i]-array[j])<sonuc) {
				sonuc = Math.abs(array[i]-array[j]);

			}
		}
	}}
	System.out.println(sonuc);

	}

}
