package �÷��ǿ���;

import java.util.Scanner;
import java.util.Set;

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
		
		boolean run = true;
		while(run) {
			//�޴� ����
			int sel = getMenu();
			switch(sel) {
			case 1:
				//ȸ���߰��޴�
				addMenu(pbm);
				break;
			case 2:
				//ȸ�������޴�
				delMenu(pbm);
				break;
			case 3:
				//ȸ���˻� �޴�
				searchMenu(pbm);
				break;
			case 4:
				//ȸ������ ��¸޴�
				pbm.printAllMember();
				break;
			case 5:
				//���α׷� ����
				run = false;
				break;
			default:
				System.out.println("�߸� �Է��Ͽ����ϴ�.");
				continue;
			}
		}
		
	}

	private static void searchMenu(PhoneBookManager pbm) {
		// TODO Auto-generated method stub
		System.out.println("\n�˻�-��ȸ����� �����ϼ���.");
		Scanner sc = new Scanner(System.in);
		System.out.println("1 : �̸�");
		System.out.println("2 : ��ȭ��ȣ");
		System.out.println("3 : �ּ�");
		
		int sel;
		Set<PhoneBook> members = null;
		do {			
			System.out.print("�����Է� >");
			sel = sc.nextInt();
			sc.nextLine(); //\n ���� ����(���� �Է� �� string �Է�)			
			switch (sel) {
			case 1:
				System.out.print("�̸� >");
				String name = sc.nextLine();
				members = pbm.searchByName(name);
				break;
			case 2:
				System.out.print("��ȭ��ȣ >");
				String phone = sc.nextLine();
				members = pbm.searchByPhone(phone);			
				break;
			case 3:
				System.out.print("�ּ� >");
				String addr = sc.nextLine();
				members = pbm.searchByAddr(addr);			
				break;
	
			default:
				System.out.println("�߸��� ���ڸ� �Է��Ͽ����ϴ�.");
				sel = -1;
				break;
			}
		}while(sel==-1);

		for(var member:members) {
			System.out.println(member);
		}
		
		System.out.println("��ȸ�� �Ϸ�Ǿ����ϴ�.");
		
	}

	private static void delMenu(PhoneBookManager pdm) {
		// TODO Auto-generated method stub
		System.out.println("\n����-ȸ�� ������ �Է��ϼ���.");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� >");
		String name = sc.nextLine();
		System.out.print("��ȭ��ȣ >");
		String phone = sc.nextLine();
		
		pdm.delMember(name, phone);
		System.out.println("ȸ������ �Ǿ����ϴ�.");
		
	}

	private static void addMenu(PhoneBookManager pdm) {
		// TODO Auto-generated method stub
		System.out.println("\n�߰�-ȸ�� ������ �Է��ϼ���.");
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� >");
		String name = sc.nextLine();
		System.out.print("��ȭ��ȣ >");
		String phone = sc.nextLine();
		System.out.print("�ּ� >");
		String addr = sc.nextLine();
		
		pdm.add(name,phone,addr);
		System.out.println("ȸ���߰� �Ǿ����ϴ�.");
	}

	private static int getMenu() {
		// TODO Auto-generated method stub
		System.out.println("\n<ȸ�� ����>");
		System.out.println("1.ȸ���߰�");
		System.out.println("2.ȸ������");
		System.out.println("3.ȸ���˻�");
		System.out.println("4.��ü ȸ����ȸ");
		System.out.println("5.����");
		
		Scanner sc = new Scanner(System.in);
		int sel = sc.nextInt();
				
		return sel;
	}

}
