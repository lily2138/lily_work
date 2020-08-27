/*
 * Source --- ����
 * Sink --- ����...src\\result.txt
 * ::
 * ���Ͽ� �ִ� ������ �о
 * �Ǵٸ� ���Ϸ� ����ϴ� ������ �ۼ�
 * ::
 * 
 */
package io.file.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadingTest2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("src\\hope.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("src\\data\\result.txt"));

		try {
			String line = "";
			while((line=br.readLine())!=null) {
//				System.out.println(line);
				bw.write(line);
				bw.newLine();
			}
//			bw.flush();//�ԷµǴ� ���� ��Ƶ��� �ʰ� �ٷ� ��µȴ�.
		} finally {
			bw.close(); //�̰� ���ϸ� ������ �����Ǵµ� ���빰�� ���� ���´�.---> ���� �� �ȿ��ִ� ���빰�� �� �������� �ݴ´�.
			br.close();
		}
	}

}
