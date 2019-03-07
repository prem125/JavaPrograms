import java.util.ArrayList;
import java.util.Iterator;


public class ArraylistExampleJP {

	public static void main(String[] args) {
		//Creating arraylist
		ArrayList<String> list = new ArrayList<String>();
		//Adding objects in arraylist
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		//Traversing list through Iterator
		Iterator itr = list.iterator();
		while(itr.hasNext());
		{
			System.out.println(itr.next());
		}
		
	}

}
