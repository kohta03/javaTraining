import java.util.*;

public class Main3_7{
	public static void main(String[] args){
		
		Map<String, Integer> prefs = new HashMap<String, Integer>();
		prefs.put("���s�{", 255);
		prefs.put("�����s", 1261);
		prefs.put("�F�{��", 181);
		int tokyo = prefs.get("�����s");
		System.out.println("�����s�̐l���́A�@" + tokyo);
		prefs.remove("���s�{");
		prefs.put("�F�{��", 181);
		int kumamoto = prefs.get("�F�{��");
		System.out.println("�F�{���̐l���́A�@" + kumamoto);
		
	}
}
