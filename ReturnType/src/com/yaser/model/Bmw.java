package com.yaser.model;

public class Bmw extends Car{

	@Override
	Bmw price() {
		// TODO Auto-generated method stub
		return new Bmw();
	}
}
/*
 * Normalde override dönüs tipi degismez ama covariant( es deger ) dönüs tipi olursa degisebilir.
 * Car da dönüs tipi car iken bunda Bmw olmustur.Metodun dönüs tipinin alt sinif dönüs tipinde oldugu
 * durumlarda covariant return type gecerli olacaktýr.Sebebi Bmw is a Car.
 * 
 */
