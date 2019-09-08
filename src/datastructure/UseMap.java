package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		List<String> car = new ArrayList<>();
		car.add("BMW");
		car.add("Toyota");
		car.add("Honda");

		List<String> phone = new ArrayList<>();
		phone.add("IPhone");
		phone.add("SamSung");
		phone.add("Lg");

		List<String> laptop = new ArrayList<>();
		laptop.add("Mac");
		laptop.add("Dell");
		laptop.add("Hp");

		Map<String, List<String>> list = new HashMap<String, List<String>>();
		list.put("popular car in the world",car);
		list.put("popular phone in the world", phone);
		list.put("popular laptop in the world",laptop);
		System.out.println(list);
		System.out.println(" ");

		System.out.println("Getting values by using for each loop.....");
		for (Map.Entry<String, List<String>> st : list.entrySet()){
			System.out.println(st.getKey()+ " -------- " +st.getValue());
		}
		System.out.println(" ");
		System.out.println("Getting values by  using iterator.....");
		Set set = list.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}




}


