/* AddClientStatus.java
 */

/* AddClientStatus
 * ��1:�V���ɒǉ�����N���X
 */
public class AddClientStatus extends ConsoleStatus {

	// �t�B�[���h
	private ClientList cl;

	private String[] messages = {
		"��Ж�����͂��Ă��������B>",
		"�Z������͂��Ă��������B>",
		"�d�b�ԍ�����͂��Ă��������B>"
	};
	private String[] data = new String[ 3 ];

	/**
	 * �R���X�g���N�^ AddClientStatus
	 * @param String firstMess
	 * @param String promptMess
	 * @param boolean IsEndStatus
	 * @param ClientList cl
	 */
	AddClientStatus( String firstMess, String promptMess,
	                 boolean IsEndStatus, ClientList cl ) {
		super( firstMess, promptMess, IsEndStatus );
		this.cl = cl;
	}

	// �ŏ��ɏo�͂��郁�b�Z�[�W��\������
	// ���̃N���X�ł͌ڋq�̃f�[�^�̓��͏���
	// �݂̂��s��
	/** displayFirstMess
	 * @throws Exception
	 */
	public void displayFirstMess() throws Exception {
		// messages�̊e����������ɕ\�����Ȃ���
		// �L�[�{�[�h�����Ж��C�Z���Ȃǂ𓾂Ă���
		for( int idx = 0; idx < messages.length; idx++ ) {
			System.out.print( messages[ idx ] );
			data[ idx ] = inputMessage();
		}

		int ID = cl.size();
		String cdata = ID + "," + data[ 0 ] + "," +
		               data[ 1 ] + "," + data[ 2 ] + ",f" ;

		// �V�������R�[�h��ǉ�
		cl.add( cdata );
		System.out.println( "ID:" + ID + "�œo�^����܂����B" );
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