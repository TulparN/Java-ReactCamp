package interfaces;

public class Utils {
	
	//static olan metodlar� newlemeye gerek yok
	//static ilk kez kullan�ld���nda bellekte referans olu�uyor ve program kapanana kadar bellekte durur
	//e�er b�t�n metodlar� static yaparsak bellek �i�er ve sistem patlar
	public static void runLoggers(Logger[] loggers, String message) {
		for (Logger logger : loggers) {
			logger.log(message);
		}
	}
}
