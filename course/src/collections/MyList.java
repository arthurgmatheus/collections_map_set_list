package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyList {
	List<String> list = new ArrayList<>();

	public List<String> method() {
		
		
		
		list.add("Arthur");
		list.add("Arthur");
		list.add("Amanda");
		list.add("Brasil");
		
		Collections.sort(list);
		
		list.get(2);
		
		return list;
		
	}

}
