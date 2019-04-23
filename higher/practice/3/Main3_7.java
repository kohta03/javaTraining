import java.util.*;

public class Main3_7{
	public static void main(String[] args){
		
		Map<String, Integer> prefs = new HashMap<String, Integer>();
		prefs.put("‹“s•{", 255);
		prefs.put("“Œ‹“s", 1261);
		prefs.put("ŒF–{Œ§", 181);
		int tokyo = prefs.get("“Œ‹“s");
		System.out.println("“Œ‹“s‚ÌlŒû‚ÍA@" + tokyo);
		prefs.remove("‹“s•{");
		prefs.put("ŒF–{Œ§", 181);
		int kumamoto = prefs.get("ŒF–{Œ§");
		System.out.println("ŒF–{Œ§‚ÌlŒû‚ÍA@" + kumamoto);
		
	}
}
