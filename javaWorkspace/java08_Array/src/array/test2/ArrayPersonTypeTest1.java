package array.test2;

import java.util.Scanner;

public class ArrayPersonTypeTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����� ���� �Է��ϼ���");
		int num = sc.nextInt(); //�迭�� ������
		
		int[] people = new int[num]; //�迭 �����
		
		//�迭 �ʱ�ȭ
		System.out.println("����� ������ �Է��ϼ���");
		for(int i=0; i<people.length; i++) {
			people[i] = sc.nextInt();
		}
		
		//Ÿ���� �迭�� ����� ����� Ÿ���� �� �迭�� �� +1��.
		int[] types = new int[5];
		for(int i=0; i<people.length; i++) {
			switch(people[i]) {
			case 1:
				types[0]++;
				break;
			case 2:
				types[1]++;
				break;
			case 3:
				types[2]++;
				break;
			case 4:
				types[3]++;
				break;
			case 5:
				types[4]++;
				break;
			}
		}
		
		//types ���� ���� ū �� ã��
		int max = 0;
		for(int i=0; i<types.length; i++) {
			if(max<types[i])
				max = types[i];
		}
		
		//�� ū ���� ��ġ�ϴ� �δ콺�� ã��. ã�� �� +1
		int answer = 0;
		for(int i=0; i<types.length; i++) {
			if (max==types[i])
				answer=i+1;
		}
		System.out.println("����::" +answer);
	}

}


/*

6
1 4 4 4 5 3

*/