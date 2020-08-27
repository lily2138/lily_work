package com.encore.test;

import com.encore.book.Book;
import com.encore.magazine.Magazine;
import com.encore.manager.BookManager;

public class Test {
	
	
	public static void printBooks(Book[] books) {
		for (Book book : books) {
			System.out.println(book.toString());
		}
	}

	public static void main(String[] args) {

		//1. BookManager��ü ����
		BookManager bookManager = new BookManager();

		Book b1 = new Book("b1", "å1", "������1", "���ǻ�1", 9000, "����1");
		Book b2 = new Book("b2", "å2", "������2", "���ǻ�2", 9000, "����2");
		Book b3 = new Book("b3", "å3", "������3", "���ǻ�3", 9000, "����3");
		Book b4 = new Book("b4", "å4", "������4", "���ǻ�4", 9000, "����4");
		Book b5 = new Book("b5", "å5", "������5", "���ǻ�5", 9000, "����5");
		Book b6 = new Book("b6", "å6", "������6", "���ǻ�6", 9000, "����6");
		Book b7 = new Magazine("M1", "�ް���1", "�ް���������1", "�ް������ǻ�1", 10000, "����1",2019,4);
		Book b8 = new Magazine("M2", "�ް���2", "�ް���������2", "�ް������ǻ�2", 10000, "����2",2019,4);
		Book b9 = new Magazine("M3", "�ް���3", "�ް���������3", "�ް������ǻ�3", 10000, "����3",2019,4);
		
		//2. books ��� �迭�� ��� �ֱ�
		Book[] books = { b1, b2, b3, b4, b5, b6, b7, b8, b9 };
		
		
		System.out.println("============================= printBooks() ==============================");
		printBooks(books);
		
		System.out.println("======================= bookManager.insertBook() ========================");
		for (Book b : books) {
			bookManager.insertBook(b);
		}
		
		System.out.println("======================== bookManager.getAllBook() ========================");
		Book[] allbooks = bookManager.getAllBook();
		printBooks(allbooks);
		
		System.out.println("================ bookManager.searchBookByIsbn ==================");
		System.out.println(bookManager.searchBookByIsbn("b1").toString());
		
		System.out.println("================ bookManager.searchBookByTitle =================");
		printBooks(bookManager.searchBookByTitle("�ް���1"));
		

		System.out.println("=============== bookManager.searchBookByPublisher ================");
		printBooks(bookManager.searchBookByPublisher("���ǻ�4"));
		
		System.out.println();
		System.out.println("================ bookManager.searchBookByPrice(10000.0) =================");
		printBooks(bookManager.searchBookByPrice(10000.0));
		

		System.out.println("=================== bookManager.getSumPriceOfBooks() ====================");
		System.out.println(bookManager.getSumPriceOfBooks());
		
		System.out.println();
		System.out.println("================== bookManager.getAveragePriceOfBooks() =================");
		System.out.println(bookManager.getAveragePriceOfBooks());
		
		

		

	}

}
