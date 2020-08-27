package array.test3;

import java.util.Arrays;
import java.util.Scanner;

public class FlattenBoxText3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int tc = 10;
		int boxLen = 100;
		for(int tcn=1; tcn<=tc; tcn++) {
			System.out.println("������ ���� �Է��ϼ���");
			int dump = sc.nextInt();
			
			int[] boxes = new int[boxLen];
			System.out.println("�� ���� ������ ���� �Է��ϼ���");
			for(int i=0; i<boxes.length;i++) {
				boxes[i] = sc.nextInt();
			}
			
			int heightDiff = flatten(boxes,dump);
			System.out.printf("#%d %d%n", tcn, heightDiff);
		}
	}
	private static int flatten(int[] boxes, int dump) {
		
		for(int i=0; i<dump; i++) {
			Arrays.sort(boxes);
			int diff = boxes[boxes.length-1]-boxes[0];
			if(diff<=1) {
				return diff;
			}
			boxes[0]++;
			boxes[boxes.length-1]--;
		}
		//�̺κ��� �ݵ�� �߰��ؾ��Ѵ�.
		Arrays.sort(boxes);
		return boxes[boxes.length-1] - boxes[0];
	}
}
