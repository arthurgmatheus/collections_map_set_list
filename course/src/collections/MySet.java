package collections;

import java.util.Set;
import java.util.HashSet;

public class MySet {

	Set<String> cities = new HashSet<>();
	
	public Set<String> method(){
		
		//No Set eu não consigo ordenar e nem repetir os itens
		
		cities.add("São Paulo");
		cities.add("Barcelona");
		cities.add("Rio de Janeiro");
		
		
		return cities;
	}
	
}
