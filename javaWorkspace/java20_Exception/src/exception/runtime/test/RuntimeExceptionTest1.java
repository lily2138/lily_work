package exception.runtime.test;
/*
 * ���� �߻� ���ϸ� ...try ����
 * ���� �߻� �ϸ�...
 * 		+
 * �߻��� ���ܷ� �� ������...catch�� ����
 * 
 */
public class RuntimeExceptionTest1 {
	public static void main(String[] args) {
		String[] str = {
			"Hello Java", 
			"No I mean it", 
			"Nice to meet you"	
		};
		
		int i = 0;

		while(i<=3) {
			try {
				//���� �߻����ϸ� �̺κ� ����...
				System.out.println(str[i]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Nice Catch!!!");
			}
			i++;
		}
	}
}
