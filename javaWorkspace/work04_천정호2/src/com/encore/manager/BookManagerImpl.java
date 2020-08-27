package com.encore.manager;

import com.encore.vo.Book;

/**
 * 
 * @author JungHo Cheon
 * @version 2 :: Singletone ����...
 * @version 3 :: BookManager �������̽� ���ø� ����
 */
public class BookManagerImpl implements BookManager {
	private int numberOfBooks;//0
	private Book[] books;
	private int idx;//0

	//1.
	private static BookManagerImpl mgr = new BookManagerImpl();
	
	//2.
	private BookManagerImpl() {
		/*numberOfBooks = 0;
		idx = 0;*/
		books = new Book[100];
	}
	//3.
	public static BookManagerImpl getInstance() {
		return mgr;
	}
	
	public int getNumberOfBooks() {
		return numberOfBooks;
	}
	
	/**
	 * 
	 * @param book
	 * Book ��ü�� �߰���. 
	 */
	public void insertBook(Book book) {
		books[numberOfBooks++] = book;
	}
	
	/**
	 * 
	 * @return : �߰��� ��� Book ��ü�� ��ȯ��.
	 */
	public Book[] getAllBook() {
		Book[] ret_books = new Book[idx];
		for(int i = 0; i < idx; i++) {
			ret_books[i] = books[i];
		}
		return ret_books;
	}
	
	/**
	 * 
	 * @param isbn : ã���� �ϴ� å�� isbn
	 * @return : �Էµ� isdn�� ��ġ�ϴ� å�� ��ȯ. ã�� ���� ��� null ��ȯ
	 */
	public Book searchBookByIsbn(String isbn) {
		for(int i = 0; i < idx; i++) {
			if (books[i].getIsbn().equals(isbn)) {
				return books[i];
			}
		}
		return null;
	}
	
	/**
	 * 
	 * @param title : ã���� �ϴ� å���� ����
	 * @return : title�� ��ġ�ϴ� å���� ��ȯ. ã�� ���� ��� null ��ȯ
	 */
	public Book[] searchBookByTitle(String title) {
		Book[] search_books = new Book[idx];
		int ret_idx = 0;
		int count = 0;
		for(int i = 0; i < idx; i++) {
			if (books[i].getTitle().equals(title)) {
				search_books[ret_idx++] = books[i];
				count++;
			}
		}
		if (0 < count) {
			Book[] ret_books = new Book[count];
			System.arraycopy(search_books, 0, ret_books, 0, count);
			return ret_books;
		}
		return null;
	}
	
	
	/**
	 * 
	 * @param publisher : ã���� �ϴ� å���� ���ǻ� 
	 * @return : ���ǻ簡 ��ġ�ϴ� å���� ��ȯ. ���� ��� null ��ȯ
	 */
	public Book[] searchBookByPublisher(String publisher) {
		Book[] search_books = new Book[idx];
		int ret_idx = 0;
		int count = 0;
		for(int i = 0; i < idx; i++) {
			if (books[i].getPublisher().equals(publisher)) {
				search_books[ret_idx++] = books[i];
				count++;
			}
		}
		if (0 < count) {
			Book[] ret_books = new Book[count];
			System.arraycopy(search_books, 0, ret_books, 0, count);
			return ret_books;
		}
		return null;
	}
	
	/**
	 * 
	 * @param price : ã���� �ϴ� å���� ����
	 * @return : ������ ��ġ�ϴ� å���� ��ȯ. ���� ��� null ��ȯ
	 */
	public Book[] searchBookByPrice(double price) {
		Book[] search_books = new Book[idx];
		int ret_idx = 0;
		int count = 0;
		for(int i = 0; i < idx; i++) {
			if (books[i].getPrice() == price) {
				search_books[ret_idx++] = books[i];
				count++;
			}
		}
		if (0 < count) {
			Book[] ret_books = new Book[count];
			System.arraycopy(search_books, 0, ret_books, 0, count);
			return ret_books;
		}
		return null;
	}
	
	/**
	 * 
	 * @return : �߰��� ��� å���� ������ ���� ��ȯ.
	 */
	public double getSumPriceOfBooks() {
		int total = 0;
		for(int i = 0; i < idx; i++) {
			total += books[i].getPrice();
		}
		return total;
	}
		
	/**
	 * 
	 * @return : �߰��� ��� å���� ��� ������ ��ȯ.
	 */
	public double getAveragePriceOfBooks() {
		return getSumPriceOfBooks() / idx;
	}
	
}
