public class Main1_3{
	public static void main(String[] args){
		String s1 = "Java programing";
/*		if(s1.contains("Java")){
			System.out.println("������s1�́AJava���܂�ł��܂�");
		}
		if(s1.endsWith("Java")){
			System.out.println("������s1�́AJava�������ɂ���܂�");
		}*/
		System.out.println("������s1��3�����ڈȍ~��" + s1.substring(3));
		
		System.out.println("������s1��3�`8�����ڂ�" + s1.substring(3,8));
	}
}
