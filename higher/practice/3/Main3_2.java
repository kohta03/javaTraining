import java.util.ArrayList;
import java.util.Iterator;
public class Main3_2{
	public static void main(String[] args){
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Maffi");
		names.add("Muffin");
		names.add("MaffiMaffi");
		Iterator<String> it = names.iterator();
		while(it.hasNext()){
			String e = it.next();
			System.out.println(e);
		}
	}
}
