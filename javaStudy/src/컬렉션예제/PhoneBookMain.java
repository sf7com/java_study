package �÷��ǿ���;

public class PhoneBookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//(1) ���� �����/ ������ ���̽� - ȸ������ �о�鿩 pbm�� ����
		PhoneBookManager pbm = new PhoneBookManager();
		pbm.add("ȫ�浿","010-1234-5678", "����� ������ 11-3");
		pbm.add("�Ӳ���","010-4848-8282", "����� ���ʱ� ��赿 193");
		pbm.add("���ϳ�","010-8282-2678", "�λ�� �ؿ�뱸 �ؿ�뵿 77-3");
		PhoneBook pb = new PhoneBook("������", "010-9181-2468", "������ �Ǽ��� 248");
		pbm.add(pb);
		
		pbm.printAllMember();
	}

}
