import java.time.*;
import java.time.format.*;
public class Main2_4{
	public static void main(String[] args){
		//文字列からLocあｌDateを生成
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate d = LocalDate.parse("2018/08/21", f);
		
		LocalDate d2 = LocalDate.now();
		
		//1000日後を計算する
		d = d.plusDays(1000);
		String str = d.format(f);
		System.out.println("1000日後は" + str);
		
		d2 = d2.minusDays(1000);
		String str2 = d2.format(f);
		System.out.println("1000日前は" + str2);
		
		//現在日付との比較
		LocalDate now = LocalDate.now();
		if(now.isAfter(d)){
			System.out.println("nowはdより新しい");
		}
	}
}
