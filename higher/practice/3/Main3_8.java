import java.util.*;

public class Main3_8{
	public static void main(String[] args){
		
		Map<String, Integer> prefs = new HashMap<String, Integer>();
		prefs.put("‹“s•{", 255);
		prefs.put("“Œ‹“s", 1261);
		prefs.put("ŒF–{Œ§", 181);
		
		for(String key : prefs.keySet()){
			int value = prefs.get(key);
			System.out.println(key + "lŒû‚ÍA@" + value);
		}
	}
}
