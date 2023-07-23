package collections;

import java.util.HashMap;
import java.util.Map;

public class MyMap {

	
	Map<String, Integer> cars = new HashMap<>();
	
	public Map<String, Integer> method(){
		
		cars.put("Chevrolet", 1);
		cars.put("Ford", 2);
		cars.put("Ferrari", 3);
		
		//Collections.sort(cars); Não funciona
		
		return cars;
		
	}
	
}
