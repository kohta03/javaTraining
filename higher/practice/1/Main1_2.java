public class Main1_2{
	public static void main(String[] args){
		String s1 = "Java and JavaScript";
		if(s1.contains("Java")){
			System.out.println("������s1�́AJava���܂�ł��܂�");
		}
		if(s1.endsWith("Java")){
			System.out.println("������s1�́AJava�������ɂ���܂�");
		}
		System.out.println("������s1�ōŏ���Java���o�ꂷ��ʒu��" + s1.indexOf("Java"));
		
		System.out.println("������s1�ōŌ��Java���o�ꂷ��ʒu��" + s1.lastIndexOf("Java"));
	}
}
