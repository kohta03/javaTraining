public class Main1_4{
	public static void main(String[] args){
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i <= 10000; i++){
			sb.append("java");
		}
		String s = sb.toString();
		System.out.println(s);
	}
}