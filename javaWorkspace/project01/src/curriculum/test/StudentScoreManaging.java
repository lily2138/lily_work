package curriculum.test;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import curriculum.manage.StudentManageImpl;
import curriculum.vo.*;
public class StudentScoreManaging {
	
	//map ����Լ�
	public static void printMapStudents(Map<Integer, Student> students) {
		Set<Integer> stdSet = students.keySet();
		Iterator<Integer> it = stdSet.iterator();
		while(it.hasNext()) {
			int key = it.next();
			Student std = students.get(key);
			System.out.println(std.toString());
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("Start student score managing program...");
		StudentManageImpl scoreMngr = StudentManageImpl.getInstance();
		
		
		Map<Integer, Student> students = null;
		int menuNum, stdId, stdAge, currId, score = 0;
		String stdName = "";
		Student std = null;
		Curriculum cur = null;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("�޴��� �������ּ���...");
			System.out.println("1. �л� ���		2. �л��� Ŀ��ŧ�� ���");
			System.out.println("3. ���� ���		4. �л� ����");
			System.out.println("5. ��� �л� ���� ��ȸ	6. �ݺ� �л� ���� ��ȸ");
			System.out.println("7. ��ü ���� ��ȸ		8. �ݺ� ���� ��ȸ");
			System.out.println("9. �ݺ� ��� ���� ��ȸ 10.���� ���� ���� �л� ��ȸ");
			System.out.println("11. ���� ���� ����	12.��ǥ ���� ����");
			System.out.println("13. �� ���� ����		14.���� ���� ����");
			System.out.println("0. �� ������ �ϰ� ����մϴ�.");
			
			menuNum = sc.nextInt();
			switch(menuNum) {
			
			case 1:
				System.out.println("�л��� ����մϴ�.");
				System.out.println("������ ID�� �Է��ϼ���.");
				stdId = sc.nextInt();
				System.out.println("�л��� �̸��� �Է��ϼ���.");
				stdName = sc.next();
				System.out.println("�л��� ���̸� �Է��ϼ���.");
				stdAge = sc.nextInt();
				scoreMngr.addStudent(stdId, stdName, stdAge);
				break;
			case 2:{
				System.out.println("�л��� Ŀ��ŧ���� ����մϴ�.");
				System.out.println("�л��� ID�� �Է��ϼ���.");
				stdId = sc.nextInt();
				System.out.println("����� ������ �����ϼ���. 1. Big Data, 2. AI");
				menuNum = sc.nextInt();
				switch(menuNum) {
				case 1:
					scoreMngr.addSubjectOfStudent(stdId,  new BigData());//issue occur
					break;
				case 2:
					scoreMngr.addSubjectOfStudent(stdId,  new AI());//issue occur
					break;
				}
				break;
			}
			case 3:
				System.out.println("�л��� ���������� ����մϴ�.");
				System.out.println("�л��� ID�� �Է��ϼ���.");
				stdId = sc.nextInt();
				cur = scoreMngr.getCurriculum(stdId);
				if(cur instanceof BigData) menuNum = 1;
				else menuNum = 2;
				
				switch(menuNum) {
				case 1:
					System.out.println("���������� �Է��ϼ���.");
					score = sc.nextInt();
					System.out.println("��ǥ������ �Է��ϼ���. ");
					int ptScore = sc.nextInt();
					scoreMngr.registerBigdataScore(stdId, score, ptScore);
					break;
				case 2:
					System.out.println("���������� �Է��ϼ���.");
					score = sc.nextInt();
					System.out.println("���������� �Է��ϼ���.");
					int quizScore = sc.nextInt();
					System.out.println("�� ������ �Է��ϼ���.");
					int teamScore = sc.nextInt();
					scoreMngr.registerAIScore(stdId, score, quizScore, teamScore);
					break;
				}
				break;
			case 4:
				System.out.println("�л� ������ �����մϴ�.");
				System.out.println("�л��� ID�� �Է��ϼ���.");
				stdId = sc.nextInt();
				scoreMngr.deleteStudent(stdId);
				break;
			case 5:
				System.out.println("��� �л��� ������ ��ȸ�մϴ�.");
				printMapStudents(scoreMngr.getAllStudent());
				break;
			case 6:
				System.out.println("�ݺ� �л��� ������ ��ȸ�մϴ�.");
				System.out.println("���� Id�� �Է��ϼ���.");
				currId = sc.nextInt();
				printMapStudents(scoreMngr.getStudentOfClass(currId)); //issue occur
				break;
			case 7:
				System.out.println("��ü ������ ��ȸ�մϴ�.");
				std = scoreMngr.getFirstStudent();
				System.out.println(std.toString());
				break;
			case 8:
				System.out.println("�ݺ� ������ ��ȸ�մϴ�.");
				System.out.println("���� Id�� �Է��ϼ���.");
				currId = sc.nextInt();
				std = scoreMngr.getFirstStudent(currId);
				System.out.println(std.toString());
				break;
			case 9:
				System.out.println("�ݺ� ��� ������ ��ȸ�մϴ�.");
				System.out.println("���� Id�� �Է��ϼ���.");
				currId = sc.nextInt();
				System.out.println(scoreMngr.getAvgScoreOfClass(currId));  //issue occur
				break;
			case 10:
				System.out.println("���� ���� ���� �л����� ��ȸ�մϴ�.");
				System.out.println("������ �Է��ϼ���.");
				score = sc.nextInt();
				printMapStudents(scoreMngr.findStudentByScore(score)); //issue occur
				break;
			case 11:
				System.out.println("���������� �����մϴ�.");
				System.out.println("�л��� ID�� �Է��ϼ���.");
				stdId = sc.nextInt();
				System.out.println("���ο� ������ �Է��ϼ���.");
				score = sc.nextInt();
				scoreMngr.updateStudentScore(stdId, score);
				break;
			case 12:
				System.out.println("��ǥ������ �����մϴ�.");
				System.out.println("�л��� ID�� �Է��ϼ���.");
				stdId = sc.nextInt();
				System.out.println("���ο� ������ �Է��ϼ���.");
				score = sc.nextInt();
				scoreMngr.updatePtScore(stdId, score);
				break;
			case 13:
				System.out.println("�������� �����մϴ�.");
				System.out.println("�л��� ID�� �Է��ϼ���.");
				stdId = sc.nextInt();
				System.out.println("���ο� ������ �Է��ϼ���.");
				score = sc.nextInt();
				scoreMngr.updateTeamProjectScore(stdId, score);
				break;
			case 14:
				System.out.println("���������� �����մϴ�.");
				System.out.println("�л��� ID�� �Է��ϼ���.");
				stdId = sc.nextInt();
				System.out.println("���ο� ������ �Է��ϼ���.");
				score = sc.nextInt();
				scoreMngr.updateQuizScore(stdId, score);
				break;
			case 0:
				System.out.println("�л����� �������� �ϰ� ����մϴ�.");
				scoreMngr.StudentTotalScore();
				System.out.println("����� �������ϴ�.");
				break;
			default :
				System.out.println("���α׷��� �����մϴ�...");
				System.exit(0);
			}
		}
	}
}