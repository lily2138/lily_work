package condition.test;

import java.util.Scanner;
/*
 * ������ ������� �̸��� ����ÿ� �Է¹޾Ƽ� ������ �ۼ�...
 */
public class IfGradeTest2 {

	public static void main(String[] args) {
		//������ ���� Grade�� �����ϴ� ������ �ۼ�
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����� ������ �̸��� �Է��ϼ���...");
		
		int grade = sc.nextInt();
		String name = sc.nextLine();
		
		if(grade>=90 && grade <=100) { 
			System.out.println(name + ", A Grade...");
		}else if(grade>=80 && grade<90) {
			System.out.println(name + ", B Grade...");
		}else if(grade>=70 && grade<80) {
			System.out.println(name + ", C Grade...");
		}else {
			System.out.println("Try Again!!!");
		}
	}
}
