package com.encore.manager;

import com.encore.book.Book;

public class BookManager{
	private int numberOfBooks;//books �ε���
	//book���� �迭 ����
	Book[ ] books;

	public BookManager() {
		books = new Book[100];
	}
	
	
	public int getNumberOfBooks() {
		return numberOfBooks;
	}

	public void insertBook(Book b) {
		books[numberOfBooks++] = b;
	}
	
	public Book[] getAllBook() {
		Book[] allBooks = new Book[numberOfBooks];
		for(int i=0; i<numberOfBooks; i++) {
			allBooks[i]=books[i];
		}
		return allBooks;
	}
	
	public Book searchBookByIsbn(String isbn) {
		Book bo = null;
		for(int i=0; i<numberOfBooks; i++) {
			if(books[i].getIsbn().equals(isbn)) {
				bo=books[i];
				break;
			}
			else {
				return null;
			}
		}
		return bo;
	}
	
	//�ѹ迭ũ�⺸�� ���⼭ ���� �迭ũ��� �� �۱� ������ print�� �� ����
	public Book[] searchBookByTitle(String title) {
		Book[] searchBooks = new Book[numberOfBooks];
		int temp=0;
		for(int i=0; i<numberOfBooks; i++) {
			if(books[i].getTitle().equals(title)) {
				searchBooks[temp++]=books[i];
			}
		}
		Book[] realBooks = new Book[temp];
		for(int i=0; i<temp; i++) {
			realBooks[i] = searchBooks[i];
		}
		return realBooks;
	}
	
	//�ѹ迭ũ�⺸�� ���⼭ ���� �迭ũ��� �� �۱� ������ print�� �� ����
	public Book[] searchBookByPublisher(String publisher) {
		Book[] searchBooks = new Book[numberOfBooks];
		int temp=0;
		for(int i=0; i<numberOfBooks; i++) {
			if(books[i].getPublisher().equals(publisher)) {
				searchBooks[temp++]=books[i];
			}
		}
		Book[] realBooks = new Book[temp];
		for(int i=0; i<temp; i++) {
			realBooks[i] = searchBooks[i];
		}
		return realBooks;
	}
	
	public Book[] searchBookByPrice(double price) {
		Book[] searchBooks = new Book[numberOfBooks];
		int temp=0;
		for(int i = 0; i < numberOfBooks; i++) {
			if (books[i].getPrice() == price) {
				searchBooks[temp++]=books[i];
			}
		}
		Book[] realBooks = new Book[temp];
		for(int i=0; i<temp; i++) {
			realBooks[i] = searchBooks[i];
		}
		return realBooks;
	}
	
	public double getSumPriceOfBooks() {
		double sum = 0;
		for(int i=0; i<numberOfBooks; i++) {
			sum+=books[i].getPrice();
		}
		return sum;
	}
	
	public double getAveragePriceOfBooks() {
		
		double avg = getSumPriceOfBooks()/numberOfBooks;
		
		return avg;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
