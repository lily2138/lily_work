package array.test2;

public class ArrayMaxAndMinTest2 {

	public static void main(String[] args) {
		int[] score= {79,88,91,44,100,55,95};
		
		int min = score[0]; //�迭�� ù��° ������ �ּҰ��� �ʱ�ȭ�Ѵ�...79
		int max = score[0];
		
		/*for(int i=0; i<score.length; i++) {
			if(score[i]<min)
				min=score[i];
			if(score[i]>max)
				max=score[i];
		}*/
		
		//Advanced For.....ForEach
		for(int s : score) {
			if(s<min)
				min=s;
			if(s>max)
				max=s;
		}
		
		System.out.println("�ּҰ�:"+min);
		System.out.println("�ִ밪:"+max);

	}

}
