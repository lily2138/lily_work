package exception.compile.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CompileTest4 {

	public static void main(String[] args) {
		
		String path = "c:\\yhk\\poem.txt";
		FileReader fr = null;
		try {
			System.out.println("1.fileReader Ŭ���� ����....");
			fr = new FileReader(path);
			
			System.out.println("2.������ ������ �о�帳�ϴ�... read()");
			fr.read();
			//������������ٴ�,,  close()
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			try {
				fr.close();
			}catch(IOException e) {
				
			}
		}
		
	}

}
