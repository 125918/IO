package io;
import java.util.HashMap;

public class IDandPasswords 
{
	// tworzymy hash map, która bêdzie dzia³aæ perfekcyjnie w tym projekcie, poniewa¿ przechowuje pary klucz-wartoœæ; kluczem bêdzie username, a wartoœci¹ has³o
	// tworzymy hash map i okreœlamy typ przechowywanych danych, czyli dwa Stringi (username, password)
	HashMap<String, String> logininfo = new HashMap<String, String>();
	
	// tworzymy konstruktor naszej klasy
	IDandPasswords()
	{
		logininfo.put("S³awomir", "Kost");
		logininfo.put("Kasia", "Pêdrak"); //kilka kombinacji username i password
		logininfo.put("Pawe³", "Staroœciak");
		logininfo.put("Mateusz", "Zawadzki");
		logininfo.put("Mi³osz", "Idzikowski");		
	}
	
	// chcemy wysy³aæ informacje z has map do ka¿dej klasy, która tego zaz¹da, wiêc tworzymy metodê: getter dla hash map
	protected HashMap getLoginInfo() // protected, ¿eby nie ka¿dy móg³ j¹ wywo³aæ, bo zawiera identyfikatory i has³a u¿ytkowników
	{
		return logininfo; // do ka¿dego, kto wywo³a tê metodê wyœlemy hash map: logininfo
	}
}
