package DB����;

import java.util.Scanner;

public class PocketMoneyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DBAccess da = new DBAccess();
		while(true) {
			ScreenOut.menu();
			switch(sc.nextLine()) {
			case "1" : //����
			{
				//����޴�
				ScreenOut.outItem();
				String item = sc.nextLine();//���� �׸� �Է�
				ScreenOut.outMoney();
				String money = sc.nextLine();//���� �ݾ� �Է�
				ScreenOut.checkMent(item, money, "����");
				String check = sc.nextLine();
				if(check.equals("1")) {
					ScreenOut.yesMent();
					//������ ����
					da.insertData(item, "-"+money);
				}else {
					ScreenOut.noMent();
				}
				System.out.println("Enter");
				sc.nextLine();//���� ���� ������ ���
				break;
			}
			case "2" : //����
			{
				//���Ը޴�
				ScreenOut.inItem();
				String item = sc.nextLine();//���� �׸� �Է�
				ScreenOut.inMoney();
				String money = sc.nextLine();//���� �ݾ� �Է�
				ScreenOut.checkMent(item, money, "����");
				String check = sc.nextLine();
				if(check.equals("1")) {
					ScreenOut.yesMent();
					//������ ����
					da.insertData(item, money);
				}else {
					ScreenOut.noMent();
				}
				System.out.println("Enter");
				sc.nextLine();//���� ���� ������ ���
				break;
			}
			case "3" : //�ܾ���ȸ
			{
				//�ܾ� ��ȸ �Լ� �ʿ�
				int balance=da.getMoneyBalance();//�ܾ�
				System.out.println("\t���� ���� �ܾ��� " + balance + "�� �Դϴ�.");
				System.out.println("Enter");
				sc.nextLine(); //���� ���� ������ ���
				break;
			}
			case "4" : //��ü��ȸ
			{
				System.out.println("\t��ü ����� ��ȸ�մϴ�.");
				System.out.println("Enter");
				sc.nextLine(); //���� ���� ������ ���
				System.out.println("\t����(����)����\t�ݾ�\t\t��¥");
				System.out.println("\t" + "*".repeat(60));
				//��� ������ ��ȸ
				var items = da.getAllItems();
				for(var item : items) {
					System.out.printf("\t%-10s\t%7s��\t%s\n",
							item.item, item.money, item.date);
				}
				//
				System.out.println("\n\t��� ��ȸ�� �Ϸ�Ǿ����ϴ�.");
				System.out.println("Enter");
				sc.nextLine(); //���� ���� ������ ���
				break;
			}
			case "0" : //����
			{
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				break;
			}
			default :
				//�޴� �߸��Է�
				System.out.println("�߸��Է��Ͽ����ϴ�. �ٽ� �Է��ϼ���.");
			}
		}
	}

}
