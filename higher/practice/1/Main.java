public class Main{
	public static void main(String[] args){
		String s1 = "";
		String s2 = "Java";
		String s3 = "Java";
		if(s2.equals(s3)){
			System.out.println("s2��s3�͓�����");
		}
		if(s2.equalsIgnoreCase(s3)){
			System.out.println("s2��s3�̓P�[�X��ʂ��Ȃ���Γ�����");
		}
		System.out.println("s1�̒�����" + s1.length() + "�ł�");
		if(s1.isEmpty()){
			System.out.println("s1�͋󕶎��ł�");
		}
	}
}
