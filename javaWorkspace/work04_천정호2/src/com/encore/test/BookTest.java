package com.encore.test;

import com.encore.manager.BookManagerImpl;
import com.encore.vo.Book;
import com.encore.vo.Magazine;

public class BookTest {

	public static void printBooks(Book[] books) {
		System.out.println("ISBN\tNAME\tAUTHOR\tPUBLISH\tPRICE\tDESC\t\tYEAR(m)\tMONTH(m)");
		System.out.println("=========================================================================");
		for (Book book : books) {
			System.out.println(book.toString());
		}
	}

	public static void main(String[] args) {
		Book b1 = new Book("0001", "å1", "������1", "A��", 5000.0, "Book_b1");
		Book b2 = new Book("0002", "å2", "������1", "A��", 10000.0, "Book_b2");
		Book b3 = new Book("0003", "å3", "������2", "A��", 5000.0, "Book_b3");
		Book b4 = new Book("0004", "å4", "������2", "B��", 10000.0, "Book_b4");
		Book b5 = new Book("0005", "å5", "������3", "B��", 5000.0, "Book_b5");
		Book b6 = new Book("0006", "å6", "������3", "B��", 15000.0, "Book_b6");
		Book b7 = new Book("0007", "å7", "������4", "C��", 5000.0, "Book_b7");
		Book b8 = new Book("0008", "å8", "������4", "C��", 15000.0, "Book_b8");

		Magazine m1 = new Magazine("1001", "����1", "������1", "A��", 10000.0, "Magazine_m1", 10, 8);
		Magazine m2 = new Magazine("1002", "����2", "������1", "A��", 15000.0, "Magazine_m2", 1, 4);
		Magazine m3 = new Magazine("1003", "����3", "������2", "B��", 5000.0, "Magazine_m3", 5, 8);
		Magazine m4 = new Magazine("1004", "����3", "������2", "B��", 10000.0, "Magazine_m4", 6, 4);
		Magazine m5 = new Magazine("1005", "����5", "������3", "C��", 15000.0, "Magazine_m5", 2, 1);
		Magazine m6 = new Magazine("1006", "����6", "������3", "C��", 15000.0, "Magazine_m6", 1, 8);
		Magazine m7 = new Magazine("1007", "����7", "������4", "C��", 5000.0, "Magazine_m7", 2, 10);

		Book[] books = { b1, b2, b3, b4, b5, b6, b7, b8, m1, m2, m3, m4, m5, m6, m7 };

		System.out.println("============================= printBooks() ==============================");
		printBooks(books);

		System.out.println();
		System.out.println("======================= BookManager.insertBook() ========================");
		//BookManager bm = new BookManager();
		BookManagerImpl bm = BookManagerImpl.getInstance();
		for (Book b : books) {
			bm.insertBook(b);
		}

		System.out.println();
		System.out.println("======================== BookManager.getAllBook() ========================");
		Book[] allbooks = bm.getAllBook();
		printBooks(allbooks);

		System.out.println();
		System.out.println("================ BookManager.searchBookByIsbn(\"0001\") ==================");
		System.out.println(bm.searchBookByIsbn("0001").toString());
		
		System.out.println();
		System.out.println("================ BookManager.searchBookByTitle(\"����3\") =================");
		printBooks(bm.searchBookByTitle("����3"));
		
		System.out.println();
		System.out.println("=============== BookManager.searchBookByPublisher(\"C��\") ================");
		printBooks(bm.searchBookByPublisher("C��"));
		
		System.out.println();
		System.out.println("================ BookManager.searchBookByPrice(10000.0) =================");
		printBooks(bm.searchBookByPrice(10000.0));
		
		System.out.println();
		System.out.println("=================== BookManager.getSumPriceOfBooks() ====================");
		System.out.println("Sum Price Of Books : " + bm.getSumPriceOfBooks());
		
		System.out.println();
		System.out.println("================== BookManager.getAveragePriceOfBooks() =================");
		System.out.println("Average Price Of Books : " + bm.getAveragePriceOfBooks());
		
	}

}
