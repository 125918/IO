package io;
import java.util.HashMap;

public class IDandPasswords 
{
	// tworzymy hash map, kt�ra b�dzie dzia�a� perfekcyjnie w tym projekcie, poniewa� przechowuje pary klucz-warto��; kluczem b�dzie username, a warto�ci� has�o
	// tworzymy hash map i okre�lamy typ przechowywanych danych, czyli dwa Stringi (username, password)
	HashMap<String, String> logininfo = new HashMap<String, String>();
	
	// tworzymy konstruktor naszej klasy
	IDandPasswords()
	{
		logininfo.put("S�awomir", "Kost");
		logininfo.put("Kasia", "P�drak"); //kilka kombinacji username i password
		logininfo.put("Pawe�", "Staro�ciak");
		logininfo.put("Mateusz", "Zawadzki");
		logininfo.put("Mi�osz", "Idzikowski");		
	}
	
	// chcemy wysy�a� informacje z has map do ka�dej klasy, kt�ra tego zaz�da, wi�c tworzymy metod�: getter dla hash map
	protected HashMap getLoginInfo() // protected, �eby nie ka�dy m�g� j� wywo�a�, bo zawiera identyfikatory i has�a u�ytkownik�w
	{
		return logininfo; // do ka�dego, kto wywo�a t� metod� wy�lemy hash map: logininfo
	}
}
