package self.test;
/*
 * ���ڸ������ʹ� ũ�⶧���� ����� �̻�������... �̰Ը´°ɱ��..?
 */
public class Test1_1 {

	public static void main(String[] args) {
		int num = 0;
		int row = 8; //������ ����Ұ���.
		for(int i=0; i<row; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("   ");
			}
			for(int k=0; k<row-i; k++) {
				num = num+1;
				System.out.print(num+"  ");
			}
			System.out.print("\n");
		}
	}
}
