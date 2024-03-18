import java.util.*;
public class ExampleArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> fruits = new ArrayList<String>();
		
		fruits.add("mela");
		fruits.add("pera");
		fruits.add(0, "kiwi");
		System.out.println(fruits.indexOf("pera"));
		System.out.println(fruits.get(0).getClass());
		
		//fruits.remove(0);
		//fruits.remove("kiwi");
		System.out.println(fruits.size());
		/*for (String fr : fruits) {
			System.out.println(fr);
		}*/
		
		for (int i = 0; i < fruits.size(); i++) {
			System.out.println(fruits.get(i));
		}
}
}