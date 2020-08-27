package com.encore.test;

import java.util.Arrays;
import java.util.Scanner;

import com.encore.service.MovieMgrImpl;
import com.encore.vo.Movie;

public class MovieTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("<<��ȭ ���� ���α׷�>>");
		//getInstance()�� MovieMgr ��ü �޾ƿ�..
		MovieMgrImpl mvManager = MovieMgrImpl.getInstance();
		
		boolean flag = true;
		while(flag) {
			System.out.println("1. ��ȭ ���� �Է�");
			System.out.println("2. ��ȭ ���� ��ü �˻�");
			System.out.println("3. ��ȭ�� �˻�");
			System.out.println("4. ��ȭ �帣�� �˻�");
			System.out.println("5. ��ȭ ���� ����");
			System.out.println("0. ����");
			
			int selectNum = sc.nextInt();
			switch(selectNum) {
			case 1:
				System.out.print("��ȭ ���� �Է����ּ��� : ");
				String mvName = sc.next();
				System.out.print("���� ���� �Է����ּ��� : ");
				String mvDir = sc.next();
				System.out.print("����� �Է����ּ��� : ");
				int mvGr = sc.nextInt();
				System.out.print("�帣�� �Է����ּ��� : ");
				String mvGre = sc.next();
				System.out.print("����� �Է����ּ��� : ");
				String mvSumm = sc.next();
				mvManager.add(new Movie(mvName, mvDir, mvGr, mvGre, mvSumm));
				System.out.println();
				break;
			case 2:
				System.out.println(Arrays.toString(mvManager.search()));
				break;
			case 3:
				System.out.println("ã�����ϴ� ������ �Է��ϼ��� : ");
				mvName = sc.next();
				System.out.println(Arrays.toString(mvManager.search(mvName)));
				break;
			case 4:
				System.out.print("ã�����ϴ� �帣�� �Է��ϼ��� : ");
				mvGre = sc.next();
				System.out.println(Arrays.toString(mvManager.searchGenre(mvGre)));
				break;
			case 5:
				System.out.print("�����ϰ����ϴ� ������ �Է��ϼ��� : ");
				mvName = sc.next();
				mvManager.delete(mvName);
				System.out.println("�����Ϸ�");
				break;
			case 0:
				flag=false;
				break;
			}			
		}
	}

}
