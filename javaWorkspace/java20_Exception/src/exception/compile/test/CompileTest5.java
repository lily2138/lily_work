package exception.compile.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CompileTest5 {

	public static void main(String[] args)throws FileNotFoundException,IOException {
		
		String path = "c:\\yhk\\poem.txt";
		FileReader fr = null;
		try {
			System.out.println("1.fileReader Ŭ���� ����....");
			fr = new FileReader(path);
				
			System.out.println("2.������ ������ �о�帳�ϴ�... read()");
			fr.read();
				//������������ٴ�,,  close()
		}finally {
			fr.close();
		}
		//try~finally �� ������ ���ܰ� �߻����� ��, fr.close���� �������� ���� �� �ִ�.
	}

}
