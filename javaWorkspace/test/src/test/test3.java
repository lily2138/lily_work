package test;

import java.util.Arrays;

public class test3 {

	public static void main(String[] args) {
		String [] arr={"1","174","23","578","71","9"};
		String[] result = solution(arr);
        for(int i=0; i<result.length; i++) {
        	System.out.println(result[i]);
        }
		

	}
	


//�ٽ� �ҽ��ڵ��� ������ �ּ����� �ۼ��ϸ� �򰡿� ū ������ �˴ϴ�.
	public static String[] solution(String[] sequence){
		int[] temp=new int[sequence.length];
		String[] answer = new String[sequence.length];
		
        for(int i=0; i<sequence.length; i++) {
        	temp[i] = Integer.parseInt(sequence[i]);
        }
        Arrays.sort(temp);
		
        for(int i=0; i<sequence.length; i++) {
        	answer[i] = Integer.toString(temp[i]);
        }
		
		return answer;
    }
}