package com.bilgeadam.lesson009;

public class Islemler {

	public int topla(int... sayilar) {
		int result=0;
		for(int i=0;i<sayilar.length;i++) {
			result+=sayilar[i];
			
		}
		return result;
	}
	/*
	 * 
	 */
	public double otv_hesapla(double fiyat,int motorGucu) {
		double result=0;
		if (motorGucu<80) {
			result=fiyat*1.4;
		}
		else if(motorGucu<100) {
			result=fiyat*1.6;
			
		}
		else {
			result = fiyat*1.8;
		}
		return result;
	}
}
