package io.file.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * Byte�迭 ��Ʈ��....
 * ���̳ʸ� ����Ÿ(�̹��� ����)�� �о
 * ���Ϸ� ����ϴ� ������ �ۼ�.
 * ::
 * �Է�(2) | ���(2)
 * DataInputStream(FileInputStream)
 * DataOutputStream(FileOutputStream)
 */
public class DataInputStreamTest {
	public static void main(String[] args) {
		String fileName = "src/watermelon.png";
		String outfileName = "src/water.png";
		DataInputStream dis = null;
		DataOutputStream dos = null;
		try {
			dis = new DataInputStream(new FileInputStream(fileName));
			dos = new DataOutputStream(new FileOutputStream(outfileName));
			
			int data = 0;
			while((data=dis.readInt())!=-1) {
				dos.writeInt(data);
			}
		}catch(EOFException e) {
			
		}catch(IOException e) {
			
		}

	}

}
