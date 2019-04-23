/* DisplayPersonsByNameStatus.java
 */

/* DisplayPersonsByNameStatus
 * ��2:�ύX����N���X
 */
public class DisplayPersonsByNameStatus extends ConsoleStatus {

	// �t�B�[���h
	private String name;
	private PersonList plist;
	private PersonList selectedList;
	private DisplayPersonStatus next;

	// ��2:�ǉ�����
	// ���X�g��\������͈͂̐擪�ʒu�i�����l��0�j
	private int startIdx;

	/**
	 * �R���X�g���N�^ DisplayPersonsByNameStatus
	 * @param String firstMess
	 * @param String promptMess
	 * @param boolean IsEndStatus
	 * @param PersonList plist
	 * @param DisplayPersonStatus next
	 */
	DisplayPersonsByNameStatus( String firstMess, String promptMess,
	                     boolean IsEndStatus,
	                     PersonList plist, DisplayPersonStatus next ) {
		super( firstMess, promptMess, IsEndStatus );
		this.name = "";
		this.plist = plist;
		this.selectedList = null;
		this.next = next;
		// ��2:�ǉ�����
		this.startIdx = 0;
	}

	// �ŏ��ɏo�͂��郁�b�Z�[�W��\������
	/** displayFirstMess
	 * @throws Exception
	 */
	public void displayFirstMess() throws Exception {
		displayList();
		super.displayFirstMess();
	}

	// �������鎁����o�^����
	/** setName
	 * @param String name
	 */
	public void setName( String name ) {
		this.name = name;
		// ��2:�ǉ�����
		startIdx = 0;
	}

	// ���͂��ꂽ�����̕�����������Ɋ܂ޏ]�ƈ��̃��R�[�h������
	// ���o������
	/**
	 * displayList
	 */
	public void displayList() {
		// ��2:�ǉ�����
		Person p;

		// ���͂��ꂽ�����Ɉ�v�܂��͎������܂ޏ]�ƈ��̃��R�[�h������
		// selectedList�Ɏ��o��
		selectedList = plist.searchByName( name );
		// selectedList�̌�����0�Ȃ�Γ��Y�E�������
		// �]�ƈ��͂��Ȃ��ƕ\��
		if( selectedList.size() <= 0 )
			System.out.println( "�]�ƈ������݂��܂���B" );
		// ��2:�ύX����
		// ���X�g��\������͈͂̐擪�ʒu����
		// �擪�ʒu�{2�̈ʒu�̃��R�[�h�܂ł�\��
		// (���X�g�̖����ɒB�����Ƃ��͖����̃��R�[�h�܂ł�\��)
		else {
			for( int i = startIdx;
			     i < (startIdx + 3) && i < selectedList.size(); i++ ) {
				p = (Person)selectedList.getRecord( i );
				System.out.println( p.toString() );
			}
		}
	}

	// ���̏�ԂɑJ�ڂ��邱�Ƃ𑣂����߂̃��b�Z�[�W�̕\��
	/** getNextStatus
	 * @param String s
	 * @return ConsoleStatus
	 */
	public ConsoleStatus getNextStatus( String s ) {
		// ���l�����͂��ꂽ�ꍇ�C���̐��l�Ɠ���ID������
		// ���R�[�h��selectedList�ɂ��邩�ǂ������肵�C
		// ����΂�������̏��DisplayPersonStatus�ɓn��
		try {
			int i = Integer.parseInt( s );
			Person p = selectedList.get( i );
			if( p == null )
				return this;
			else {
				next.setPersonRecord( p );
				return next;
			}
		} catch( NumberFormatException e ) {
			// ��2:�ύX����
			// "N"�����͂��ꂽ�ꍇ:
			// ���X�g��\������͈͂̐擪�ʒu��3���Z
			// �������C3���Z�����l�����X�g�̑傫���𒴂���ꍇ��
			// �擪�ʒu0�ɖ߂�
			if( s.equals("N") ) {
				if( (startIdx + 3) < selectedList.size() )
					startIdx += 3;
				else
					startIdx = 0;
			}
			// "P"�����͂��ꂽ�ꍇ:
			// ���X�g��\������͈͂̐擪�ʒu��3���Z
			// �������C3���Z�����l���}�C�i�X�ɂȂ�ꍇ��
			// ���X�g�̑傫���|3�̈ʒu�ɂ���
			if( s.equals("P") ) {
				if( (startIdx - 3) < 0 )
					startIdx = (selectedList.size() - 3) < 0 ? 0 : selectedList.size() - 3;
				else
					startIdx -= 3;
			}

			return super.getNextStatus( s );
		}
	}
}
