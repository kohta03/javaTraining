public class Main1_3{
	public static void main(String[] args){
		String s1 = "Java programing";
/*		if(s1.contains("Java")){
			System.out.println("文字列s1は、Javaを含んでいます");
		}
		if(s1.endsWith("Java")){
			System.out.println("文字列s1は、Javaが末尾にあります");
		}*/
		System.out.println("文字列s1の3文字目以降は" + s1.substring(3));
		
		System.out.println("文字列s1の3〜8文字目は" + s1.substring(3,8));
	}
}
