package com.yaser.model;

public class Bmw extends Car{

	@Override
	Bmw price() {
		// TODO Auto-generated method stub
		return new Bmw();
	}
}
/*
 * Normalde override d�n�s tipi degismez ama covariant( es deger ) d�n�s tipi olursa degisebilir.
 * Car da d�n�s tipi car iken bunda Bmw olmustur.Metodun d�n�s tipinin alt sinif d�n�s tipinde oldugu
 * durumlarda covariant return type gecerli olacakt�r.Sebebi Bmw is a Car.
 * 
 */
