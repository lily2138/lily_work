package condition.test;

import java.util.Scanner;
/*
 * ������ ������� �̸��� ����ÿ� �Է¹޾Ƽ� ������ �ۼ�...
 */
public class SwitchGradeTest3 {

	public static void main(String[] args) {
		//������ ���� Grade�� �����ϴ� ������ �ۼ�
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����� �̸��� �Է��ϼ���...");
		String name = sc.nextLine();
		System.out.println("����� ����� �Է��ϼ���...");
		String grade = sc.nextLine();

		
		switch(grade) {
			case "A":
				System.out.println(name + ", 90�̻� 100���� �����Դϴ�");
				break;
			case "B":
				System.out.println(name + ", 80�̻� 90�̸� �����Դϴ�");
				break;
			case "C":
				System.out.println(name + ", 70�̻� 80�̸� �����Դϴ�");
				break;
			default:
				System.out.println(name + "try again!!!");
		}
		
	}
}
