package array.test2;

import java.util.Random;

/*
 * ����
 * ::
 * �迭�� ���� �ڷᱸ���� ���ؼ��� ���Ŀ� ���� �䱸������ ����ϰ� �Ͼ��.
 * ������ �����ϱ� ���� �˰��� �� ���� ��ǥ���� �������Ŀ� ���ؼ� ���캸�ڴ�.
 * 
 * ��������
 * ::
 * 2,5 �μ��� ��--> 2,5�� ����
 * 5,3 �μ��� ��--> temp��� �ӽú���(5) / 3,3 / temp���� ������ 5�� ���ڸ��� 3,5
 * ��ó�� �μ��� �ڸ��� �ٲٴ� ����� swap�̶� �Ѵ�.
 * 
 * ����!!!
 * 
 */

public class ArrayBubbleSortingTest3 {
	public static void main(String[] args) {
		Random r = new Random();
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = r.nextInt(10); //0~9������ �������� ����
		}
		System.out.println("======�ʱ�ȭ�Ϸ�======");
		for(int i : arr) {
			System.out.print(i+" ");
		}
		
		int temp = 0;
		for(int i=0; i<arr.length-1;i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {//���� ���� ���� ������ ũ�ٸ�
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("======���ĿϷ�======");
		for(int i : arr) {
			System.out.print(i+" ");
		}
		
	}

}
