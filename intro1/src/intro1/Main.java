package intro1;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		// camelCase
		// Don't Repeat Yourself -- Kendini Tekrar Etme
		String internetSubeButonu = "�nternet �ubesi";
		double dolarDun = 8.10;
		double dolarBugun = 8.10;
		int vade = 36;
		boolean dustuMu = false;

		System.out.println("Hello");
		System.out.println(internetSubeButonu);

		if (dolarBugun < dolarDun) {
			System.out.println("D���� Oku");
		} else if (dolarBugun == dolarDun) {
			System.out.println("E�it");
		} else {
			System.out.println("Y�kseli� Oku");
		}

		String kredi1 = "H�zl� Kredi";
		String kredi2 = "Yava� Kredi";
		String kredi3 = "�ift�i Kredi";
		String kredi4 = "Msb Kredi";
		String kredi5 = "Kredi";

		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		System.out.println("-----------------------------");

		String[] krediler = { "H�zl� Kredi", "Yava� Kradi", "�ift�i Kredisi", "Kamu Kredisi", "Kredi",
				"Konut Kredisi" };

		for (String kredi : krediler) {
			System.out.println(kredi);
		}

		System.out.println("-----------------------------");
		
		for (int i = 0; i < krediler.length; i++) {
			String kredi = krediler[i];	
			System.out.println(kredi);
		}
		
		
		//Say�sal veri tipleri de�er tip
		int sayi1 = 10;
		
		int sayi2 = 20;
		
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);
		
		
		//array string abstract gibi veriler referans tip
		int[] sayilar1 = {1,2,3,4,5};
		
		int[] sayilar2 = {10,20,30,40,50};
		
		sayilar1 = sayilar2;
		
		sayilar2[0] = 100;
		
		System.out.println(sayilar1[0]);
		
		//string te istisnai bir durum oluyor temel tip oldu�u i�in referans�n� de�ilde de�er tip gibi d�n�yor
		String sehir1 = "Ankara";
		String sehir2 = "Sakarya";
		sehir1 = sehir2;
		sehir2 = "�zmir";
		System.out.println(sehir1);
	}

}
