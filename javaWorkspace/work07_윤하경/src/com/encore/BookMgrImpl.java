package com.encore;

import java.util.ArrayList;
import com.encore.Magazine;
import com.encore.Book;

public class BookMgrImpl implements BookMgr{
	
	private ArrayList<Book> books = null;
	
	private static BookMgrImpl mgr = new BookMgrImpl();
	private BookMgrImpl() {
		books = new ArrayList<Book>();
	}
	public static BookMgrImpl getInstance() {
		return  mgr;
	}
	

	@Override
	public void addBook(Book b) {
		boolean find = false;
		for(Book book :books) {
			if(b.getIsbn().equals(book.getIsbn())) { //�̹� �׷�å�� �ִٸ�.
				find = true;
				System.out.println(b.getIsbn()+"å�� �̹� ��ϵǾ��ֽ��ϴ�..");
				return;
			}
		}
		if(find==false) {	//�߰��ϰ��� �ϴ� ������� ������ ����Ʈ���� ����
			books.add(b);
			System.out.println(b.getIsbn()+"å�� ��ϵǾ����ϴ�.");

		}
	}

	@Override
	public ArrayList<Book> getAllBook() {
		
		return books;
	}

	@Override
	public Book searchBookByIsbn(String isbn) {
		boolean find = false;
		Book book = null;
		for(Book b : books) {
			if(b.getIsbn().equals(isbn)){
				find = true;
				book = b;
			}
		}
		if(find==false) {
			System.out.println("�׷�å�� �����ϴ�");
		}
		return book;
	}

	@Override
	public ArrayList<Book> searchBookByTitle(String title) {
		boolean find = false;
		ArrayList<Book> searchList= new ArrayList<>();
		for(Book b : books) {
			if(b.getIsbn().equals(title)){
				find = true;
				searchList.add(b);
			}
		}
		if(find==false) {
			System.out.println("�׷�å�� �����ϴ�");
		}
		return searchList;
	}

	@Override
	public ArrayList<Book> onlySearchBook() {
		ArrayList<Book> onlyBook= new ArrayList<>();
		for(Book b : books) {
			if (b instanceof Magazine) {
				continue;
			}
			else
				onlyBook.add(b);
		}
		return onlyBook;
	}

	@Override
	public ArrayList<Book> onlySearchMagazin() {
		ArrayList<Book> onlyMagazin= new ArrayList<>();
		for(Book m : books) {
			if (m instanceof Magazine) {
				onlyMagazin.add(m);
			}
		}
		return onlyMagazin;
	}

	@Override
	public ArrayList<Book> magazineOfThisYearInfo(int year) {
		boolean find = false;
		ArrayList<Book> magazineYear= new ArrayList<>();
		for(Book m : books) {
			if (m instanceof Magazine) {
				if(((Magazine) m).getYear()==year) {
					find = true;
					magazineYear.add(m);
				}
				
			}
		}
		if(find==false) {
			System.out.println("�׷������� �����ϴ�");
		}
		return magazineYear;
	}

	@Override
	public ArrayList<Book> searchBookByPublish(String publish) {
		boolean find = false;
		ArrayList<Book> bookPublish= new ArrayList<>();
		for(Book b : books) {
			if(b.getPublisher().equals(publish)){
				find = true;
				bookPublish.add(b);
			}
		}
		if(find==false) {
			System.out.println("�׷�å�� �����ϴ�");
		}
		return bookPublish;
	}

	@Override
	public ArrayList<Book> searchBookByPrice(int price) {
		boolean find = false;
		ArrayList<Book> bookPrice= new ArrayList<>();
		for(Book b : books) {
			if(b.getPrice()<=price){
				find = true;
				bookPrice.add(b);
			}
		}
		if(find==false) {
			System.out.println("�׷�å�� �����ϴ�");
		}
		return bookPrice;
	}

	@Override
	public int getTotalPrice() {
		int total = 0;
		for(Book b : books) {
			total += b.getPrice();
		}
		return total;
	}
	
	
	@Override
	public int getAvgPrice() {	
		
		return getTotalPrice()/books.size();
	}
}
