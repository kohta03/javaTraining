import java.util.*;
public class Main1_6{
	public static void main(String[] args){
		//�W�����͂��當������󂯎�鏀��
		Scanner sc = new Scanner(System.in);
		//����������ۂɎ󂯎��
		String name = sc.next();
		//��������̕ϐ���p�ӂ���
		boolean chk;
		//���K�\�������s���郁�\�b�h���ďo��
		chk = isValidPlayerName(name);
		
		//�ԋp���ʂ𔻒肵�Ď󂯎�������͓���������o�͂���
		if(chk){
			System.out.println("���O�́@" + name + "�Ȃ̂���");
		}else{
			System.out.println("�����������N�\�ł�");
		}
	}
	//���K�\�������s���郁�\�b�h
	static boolean isValidPlayerName(String name){
		//���K�\���œ��͂��ꂽ������𔻒肷��
		if(name.matches("[\\w][-@+\\*;:#$%&!.\\w]{1,20}")){
			return true;
		}else{
			return false;
		}
	}
}
