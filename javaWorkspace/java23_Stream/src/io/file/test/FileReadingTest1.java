/*
 * Source --- ����
 * Sink --- �ܼ�
 * ::
 * ���Ͽ� �ִ� ������ �о
 * �ַܼ� ����ϴ� ������ �ۼ�
 * ::
 * 
 */
package io.file.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingTest1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("src\\hope.txt"));

		try {
			String line = "";
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
		} finally {
			br.close();
		}
	}

}
