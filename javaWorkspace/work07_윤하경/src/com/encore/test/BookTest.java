package com.encore.test;
import java.util.ArrayList;
import java.util.Scanner;

import com.encore.Book;
import com.encore.BookMgrImpl;
import com.encore.Magazine;

public class BookTest {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		BookMgrImpl mgr = BookMgrImpl.getInstance();
		
		aaa : while(true)
		{
			String menu = "";
			menu += "��ȣ�� �����ϼ���\n";
			menu += "1:������ �Է� ���\t";
			menu += "2:������ ��ü �˻����\n";
			menu += "3:isbn���� ������ �˻��ϴ� ���\t";
			menu += "4:Title�� ������ �˻��ϴ� ���(�Ķ���ͷ� �־��� ������ �����ϴ� ��� ����)\n";
			menu += "5:Book�� �˻��ϴ� ���\t";
			menu += "6:Magazine�� �˻��ϴ� ���\n";
			menu += "7: Magazine�� ���� ������ �˻��ϴ� ���\t";
			menu += "8: ���ǻ�� �˻��ϴ� ���\n";
			menu += "9: �������� �˻� ���(�Ķ���ͷ� �־��� ���ݺ��� ���� ���� ���� �˻�)\t";
			menu += "10:����� ��� ������ �ݾ� �հ踦 ���ϴ� ���\n";
			menu += "11:����� ��� ������ �ݾ� ����� ���ϴ� ���\t";
			menu += "0:������";

			System.out.println(menu);
			int number = sc.nextInt();
			
			switch(number)
			{
			case 0: 
				break aaa;
			case 1:
//				bm.add(new Book("11", "�ڹ�", "Alpha", "a.kr", 100, "aaaa"));
//				bm.add(new Magazine("22", "C", "Bravo", "b.kr", 300, "bbbb", 2019, 7));
//				bm.add(new Book("11", "C++", "Charlie", "c.kr", 200, "cccc"));
//				bm.add(new Magazine("44", "�ڹ�", "Delta", "d.kr", 50, "dddd", 2020, 2));
				
				System.out.println("��ȣ ���� (1:Book / 2:Magazine) : ");
				int num = sc.nextInt();
				
				if(num < 0 || 2 < num)
					continue;
					
				System.out.println("isbn(String) : ");
				String isbn = sc.next();
				System.out.println("title(String) : ");
				String title = sc.next();
				System.out.println("author(String) : ");
				String author = sc.next();
				System.out.println("publisher(String) : ");
				String publisher = sc.next();
				System.out.println("price(int) : ");
				int price = sc.nextInt();
				System.out.println("desc(String) : ");
				String desc = sc.next();
				
				
				if(num==1)
				{
					Book book = new Book(isbn,title,author,publisher,price,desc);
					mgr.addBook(book);
				}
				else if(num == 2)
				{
					System.out.println("year(int) : ");
					int year = sc.nextInt();
					System.out.println("month(int) : ");
					int month = sc.nextInt();
					
					Magazine maga = new Magazine(isbn,title,author,publisher,price,desc,year,month);
					mgr.addBook(maga);
				}
				
				break;
				
			case 2:
				ArrayList<Book> list=mgr.getAllBook();
				for(Book b : list) {
					System.out.println(b);
				}
				break;
			case 3:
				System.out.println("�˻��� isbn �Է� : ");
				String name1 = sc.next();				
				System.out.println(mgr.searchBookByIsbn(name1));
				break;
			case 4:
				System.out.println("�˻��� title �Է� : ");
				String name2 = sc.next();
				ArrayList<Book> returnList=mgr.searchBookByTitle(name2);
				for(Book b : returnList) System.out.println(b);
				
				break;
			case 5:
				ArrayList<Book> returnList2=mgr.onlySearchBook();
				for(Book b : returnList2) {
					System.out.println(b);
				}
				break;
			case 6:
				ArrayList<Book> returnList3=mgr.onlySearchMagazin();
				for(Book b : returnList3) {
					System.out.println(b);
				}
				break;
			case 7:
				ArrayList<Book> returnList4 = mgr.magazineOfThisYearInfo(2019);
				for(Book b : returnList4) {
					System.out.println(b);
				}
				break;
			case 8:
				System.out.println("�˻��� publisher �Է� : ");
				String name3 = sc.next();
				ArrayList<Book> returnList5=mgr.searchBookByPublish(name3);
				for(Book b : returnList5)System.out.println(b);
				break;
			case 9:
				System.out.println("�˻��� ���� �Է� : ");
				int num2 = sc.nextInt();
				ArrayList<Book> returnList6=mgr.searchBookByPrice(num2);
				for(Book b : returnList6)System.out.println(b);
				break;
			case 10:
				System.out.println(mgr.getTotalPrice());
				break;
			case 11:
				System.out.println(mgr.getAvgPrice());
				
			}
		}	
	}
}