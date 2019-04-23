import java.util.*;
public class Main1_6{
	public static void main(String[] args){
		//標準入力から文字列を受け取る準備
		Scanner sc = new Scanner(System.in);
		//文字列を実際に受け取る
		String name = sc.next();
		//条件判定の変数を用意する
		boolean chk;
		//正規表現を実行するメソッドを呼出す
		chk = isValidPlayerName(name);
		
		//返却結果を判定して受け取った入力内文字列を出力する
		if(chk){
			System.out.println("名前は　" + name + "なのかな");
		}else{
			System.out.println("命名条件がクソです");
		}
	}
	//正規表現を実行するメソッド
	static boolean isValidPlayerName(String name){
		//正規表現で入力された文字列を判定する
		if(name.matches("[\\w][-@+\\*;:#$%&!.\\w]{1,20}")){
			return true;
		}else{
			return false;
		}
	}
}
