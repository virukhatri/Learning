package JavaBasic;

import java.util.ArrayList;

public class ArrayListConcepts {
	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		ar.add(100);
		ar.add(200);
		ar.add(300);
		ar.add("Tom");
		ar.add("M");
		ar.add(12.22);
		System.out.println(ar.size());
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		ArrayList<Integer> ari = new ArrayList<Integer>();
		ari.add(11);
		ari.add(123);

		ArrayList<String> ars = new ArrayList<String>();
		ars.add("test");
		ars.add("200");
	}
}
