public class Main1_7{
	public static void main(String[] args){
		
		String s = "abc,def:ghj";
		String[] words = s.split("[,:]");
		for(String w : words){
			System.out.print(w + "->");
		}
	}
}
