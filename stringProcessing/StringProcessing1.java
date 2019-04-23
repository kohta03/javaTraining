package stringProcessing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StringProcessing1 {

	public static void main(String[] args) {

		//stringReplace();
		displayName();

	}


	public static void stringReplace() {

		String str = "プFiログVラムgK開gr発PwのO現li場cWでxlはUH必ずBとXいpっgてよhwいLほwど文J字列saにKh関lすgOるug処D理がgu要mWe求cさRhれまwす。I\n"
				   + "特qeにXPyW本格fu的なBS開Ke発FDでHQはa、ME「照I合UO」「Q部OS分置T換」aaなどB、I"
				   + "wS文J字b列k処aer理BPのh中avでもW複C雑でZk高度MZなyi処理nがhH求uFめOられhるこtLとnOもp少なcくあbPりnませufん";

		str = str.replaceAll("[a-zA-Z]", "");
		System.out.println(str);

	}

	public static void displayName() {

		List<String> list = new ArrayList<>(Arrays.asList(
				 "石橋 玲那",
				 "羽切 蒼",
				 "溝口 七瀬",
				 "宋 彦霖",
				 "川瀬 杏樹",
				 "加藤 嵩大",
				 "林 敏生",
				 "家塚 晃慈",
				 "市村 泰誠",
				 "巴 美月",
				 "萬田 一沙",
				 "泉 向日葵",
				 "山本 翔太",
				 "濱本 洸多",
				 "村上 舞",
				 "佐々木 瞭",
				 "大室 宏樹",
				 "岩瀬 虎斗",
				 "禹 明香",
				 "川口 洋平",
				 "池田 清花",
				 "佐々木 徳哉",
				 "大坪 一輝"));
		Iterator iterator = list.iterator();

		while (iterator.hasNext()) {
		      String s = (String)iterator.next();
		      String[] name = s.split(" ");
		      String str = String.format("FirstName = %-5s LastName = %-5s ", name[0], name[1]);
		      System.out.println(str);
		    }
	}

}
