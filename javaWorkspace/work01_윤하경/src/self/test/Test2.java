package self.test;
/*
 * 1�� ����, 2�� �ָ�, 3�� �� ��� �������� �� ��ǻ�Ϳ�
����ڰ� �Բ��ϴ� ���������� ������ �ۼ��Ͽ� ����.
<��� ��>
>>���������� ������ �����մϴ�. �Ʒ� ���� �� �ϳ��� ��
������.
1. 5�� 3��
2. 3�� 2��
3. 1�� 1��
��ȣ�� �Է��ϼ���. 2
���������� �� �ϳ� �Է�: ����
�����ϴ�!!!
���������� �� �ϳ� �Է�: ����
�����ϴ�!!!
### ��ǻ�� ��!!!
 */

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		System.out.println("���������� ������ �����մϴ�. �Ʒ� ���� �� �ϳ��� ������.");
		System.out.println("1. 1�� 1��"+"\n"+ "2. 3�� 2��"+"\n"+"3. 5�� 3��");
		Scanner sc = new Scanner(System.in);
		System.out.println("��ȣ�� �Է��ϼ���");
		int roleNum = sc.nextInt();
		
		int comCnt = 0; //��ǻ�Ͱ� �̱��
		int perCnt = 0; //����� �̱��
		
		//��ǻ�Ϳ� ����� �̱���� �Ѵ� ����ڰ� ���� ���� ��ġ�� ���ϸ� ��� �ݺ��� ����
		while(comCnt!=roleNum && perCnt!=roleNum) {
			
			System.out.println("���������� �� �Է��ϼ���");
			Scanner scan = new Scanner(System.in);  		//�����ߴµ� ���⼭ �� �� scanner�� ������ϴ��� �𸣰ڴ�... scanner�� �����ָ� �Է��̾ȵȴ�...
			String per = scan.nextLine();	//����� ������������ ���� �Է¹ޱ�
			System.out.println(per);
			int com = (int)(Math.random()*3)+1; //��ǻ���� ���� �� ����
//			System.out.println(com);   //��ǻ�Ͱ� �������� Ȯ�ο�
			
			switch(com) {
			case 1:
				if(per.equals("����")) {
					System.out.println("�����ϴ�");
				}else if(per.equals("����")) {
					System.out.println("�̰���ϴ�");
					perCnt++;
				}else if(per.equals("��")){
					System.out.println("�����ϴ�");
					comCnt++;
				}else
					System.out.println("�߸��Է��Ͽ����ϴ�");
				break;
			case 2:
				if(per.equals("����")) {
					System.out.println("�����ϴ�");
					comCnt++;
				}else if(per.equals("����")) {
					System.out.println("�����ϴ�");
				}else if(per.equals("��")){
					System.out.println("�̰���ϴ�");
					perCnt++;
				}else
					System.out.println("�߸��Է��Ͽ����ϴ�");
				break;
			case 3:
				if(per.equals("����")) {
					System.out.println("�̰���ϴ�");
					perCnt++;
				}else if(per.equals("����")) {
					System.out.println("�����ϴ�");
					comCnt++;
				}else if(per.equals("��")){
					System.out.println("�����ϴ�");
				}else
					System.out.println("�߸��Է��Ͽ����ϴ�");
				break;
			}
		}
		
		//��� �� ���
		String result = comCnt>perCnt ? "��ǻ�Ͱ� �̰���ϴ�":"����� �̰���ϴ�";
		System.out.println(result);
		
		

		

	}

}
