package array.test1;

class ArrayExam{
	String type="�迭";
	public String type() {
		return type;
	}
}

public class ArrayBasicTest1 {
	public static void main(String[] args) {
		ArrayExam exam = new ArrayExam();
		int[] arr = new int[3];  //��ü�ϱ� 0,0,0 �⺻��
/*		
		for(int i =0; i<arr.length; i++) {
			System.out.println(arr[i]);*/
		
		System.out.println("======Default Value======");
		//���� for��... ���� ���ȿ��� ���ư��°�?
		for(int val : arr) System.out.println(val);
		
		System.out.println(exam);
		System.out.println(exam.toString());
		
		//fqcn
		
		System.out.println(arr);
		
		//�迭�ʱ�ȭ
		arr[0] =11;
		arr[1] =22;
		arr[2] =33;
		for(int val : arr) System.out.println(val);
		
		int [] arr2 = {11,22,33};
		for(int val : arr2) System.out.println(val);
		System.out.println("\n arr2 �迭�� ũ��" + arr.length);
			
		arr2 = new int[5];
		arr2[3] = 44; arr2[4] = 55;
		for(int val : arr2) System.out.println(val);
		
	}

}








