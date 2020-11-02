package com.yaser.model;

public class PrimitiveReturnType {
	// primitive tiplerin geri dönüs tipi null olamaz.

//	int f() {
//		return null;
//	}  compiler time da hata verdi null yapamyýz.

	public int giveMeInt() {
		// return 'c';
		// return new Byte((byte)10);
		return new Short((short) 10);
	}

	public float giveMeFloat() {
		// return 'c';
		// return new Byte((byte)10);
		// return new Short((short)10);
		return 10;
	}

	public int castFloat() {
		float f = 32.5f;
		return (int) f;
		//tanimlanan donus tipini explicity/acik bir sekilde cast ederek kullanilabiliriz
	}
}
