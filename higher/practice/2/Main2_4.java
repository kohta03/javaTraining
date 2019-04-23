import java.time.*;
import java.time.format.*;
public class Main2_4{
	public static void main(String[] args){
		//�����񂩂�Loc����Date�𐶐�
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate d = LocalDate.parse("2018/08/21", f);
		
		LocalDate d2 = LocalDate.now();
		
		//1000������v�Z����
		d = d.plusDays(1000);
		String str = d.format(f);
		System.out.println("1000�����" + str);
		
		d2 = d2.minusDays(1000);
		String str2 = d2.format(f);
		System.out.println("1000���O��" + str2);
		
		//���ݓ��t�Ƃ̔�r
		LocalDate now = LocalDate.now();
		if(now.isAfter(d)){
			System.out.println("now��d���V����");
		}
	}
}
