package test;

public class test5 {

	public static void main(String[] args) {
		//int [] arr={10,0,0,4,20};
		//solution(arr,3);
		System.out.println(solution(41,46,56));

	}
//�ٽ� �ҽ��ڵ��� ������ �ּ����� �ۼ��ϸ� �򰡿� ū ������ �˴ϴ�.
    public static int solution(int a, int b, int range){
        int sum=0;
        for(int i=1; i<=range; i++ ){
            if(i%a==0 || i%b==0){
                sum += i;
            }
        }
        return sum;
    }
}