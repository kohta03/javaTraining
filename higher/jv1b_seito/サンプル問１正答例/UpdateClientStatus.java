/* UpdateClientStatus.java
 */

import java.io.IOException;

/* UpdateClientStatus
 * ��1:�V���ɒǉ�����N���X
 */
public class UpdateClientStatus extends ConsoleStatus {

	// �t�B�[���h
	private ClientList cl;

	private String message =
	  "1.��Ж�\t\t2.�Z��\t\t3.�d�b�ԍ�\n";
	private String data;

	/**
	 * �R���X�g���N�^ UpdateClientStatus
	 * @param String firstMess
	 * @param String promptMess
	 * @param boolean IsEndStatus
	 * @param ClientList cl
	 */
	UpdateClientStatus( String firstMess, String promptMess,
	                 boolean IsEndStatus, ClientList cl ) {
		super( firstMess, promptMess, IsEndStatus );
		this.cl = cl;
		this.data = "";
	}

	// �ŏ��ɏo�͂��郁�b�Z�[�W��\������
	// ���̃N���X�ł͏]�ƈ��̃f�[�^�̍X�V����
	// �݂̂��s��
	/** displayFirstMess
	 * @throws IOException
	 */
	public void displayFirstMess() throws IOException {
		int id, no;

		// ID�̓���
		System.out.print( "�ڋqID����͂��Ă��������B\n>" );
		data = inputMessage();
		try {
			id = Integer.parseInt( data ); // �ڋqID
		} catch( NumberFormatException e ) {
			System.out.println( "���l�ɕϊ��ł��Ȃ��f�[�^�����͂���Ă��܂��B" );
			System.out.println( "�ē��͂��Ă��������B" );
			displayFirstMess();
			return;
		}

		Client c = cl.get( id );
		if( c == null ) {
			System.out.println( "�w���ID�̌ڋq�͑��݂��܂���B" );
			System.out.println( "�ē��͂��Ă��������B" );
			displayFirstMess();
			return;
		}

		// �ڋq�̏��̏o��
		System.out.println( c.toString() );

		System.out.println( "\n�X�V���������ڂ���͂��Ă��������B" );
		System.out.print( message );

		// �X�V���鍀�ڂ̔ԍ��̓���
		System.out.print( "\n�X�V���鍀�ڂ̔ԍ�����͂��Ă��������B\n>" );
		data = inputMessage();

		try {
			no = Integer.parseInt( data ); // �ԍ�

			// �X�V����l�̓���
			System.out.print( "\n�X�V��̒l����͂��Ă��������B\n>" );
			data = inputMessage();

			if( no >= 1 && no <= 3 ) {
				switch( no ) {
					case 1:
						c.setName( data );   break;
					case 2:
						c.setAddress( data );   break;
					case 3:
						c.setTel( data );   break;
					default:
						break;
				}
			}
		} catch( NumberFormatException e ) {
			System.out.println( "���l�ɕϊ��ł��Ȃ��f�[�^�����͂���Ă��܂��B" );
			System.out.println( "�ē��͂��Ă��������B" );
			displayFirstMess();
			return;
		}
	}

	// ���̏�ԂɑJ�ڂ��邱�Ƃ𑣂����߂̃��b�Z�[�W�̕\��
	// ���̃N���X�́C������Ԃɖ߂�ƌ��܂��Ă��邽�߁C����
	// ���͂���Ă�������ԂɑJ�ڂ���悤�ɂ��Ă���
	/** getNextStatus
	 * @param String s
	 * @return ConsoleStatus
	 */
	public ConsoleStatus getNextStatus( String s ) {
		return super.getNextStatus( " " );
	}
}