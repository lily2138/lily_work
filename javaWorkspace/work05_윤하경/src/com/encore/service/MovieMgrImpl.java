package com.encore.service;

import com.encore.vo.Movie;

public class MovieMgrImpl implements MovieMgr {
	private Movie[ ] movies = new Movie[100];
	private int index;
	
	//�̱���...MovieMgr�� mgr�̸����� ��ü ����...getInstance�� ������ ��ü�� �޾ƿ´�.
	private static MovieMgrImpl mgr = new MovieMgrImpl();
	private MovieMgrImpl() {};
	public static MovieMgrImpl getInstance() {
		return mgr;
	}
	
	public void add(Movie m) {
		movies[index++] = m;
	}
	
	public Movie[] search() {
		Movie[] allMovies= new Movie[index];
//		int idx = 0;
//		for (Movie m :movies) {
//			if(m==null)	break;			//�̰Ÿ� �ȳ����� null������ ó���� ���ؼ� ����������.
//			allMovies[idx++] = m;
//		}
		for(int i=0; i<index; i++) {
			allMovies[i]=movies[i];
		}
		return allMovies;
	}
	
	public Movie[] search(String title) {
		Movie[] searchMovies = new Movie[index];
		int temp = 0;
		
/*		for (Movie m :movies) {
			if(m.getTitle().contains(title)) {
				searchMovies[temp++] = m;
			}
		}*/
		for(int i=0; i<index; i++) {
			if(movies[i].getTitle().contains(title)) {
				searchMovies[temp++] = movies[i];
			}
		}
		//null���� �߸��� ���ؼ� �ٽ� for���� ���۽�Ŵ
		Movie[] realMovies = new Movie[temp];
		for(int i=0; i<temp; i++) {
			realMovies[i] = searchMovies[i];
		}
		return realMovies;
	}

	public Movie[] searchDirector(String name) {
		int size = 0;
		for(int i=0; i<index; i++) {
			if(movies[i].getDirector().contains(name))
				size++;
		}
		Movie[] realMovies = new Movie[size];
		for (int i=0; i<index; i++) {
			if(movies[i].getDirector().contains(name)) {
				realMovies[--size] = movies[i];
			}
		}
		return realMovies;
	}

	public Movie[] searchGenre(String genre) {
		Movie[] searchMovies = new Movie[index];
		int temp = 0;
		for(int i=0; i<index; i++) {
			if(movies[i].getDirector().contains(genre)) {
				searchMovies[temp++] = movies[i];
			}
		}
		//null���� �߸��� ���ؼ� �ٽ� for���� ���۽�Ŵ
		Movie[] realMovies = new Movie[temp];
		for(int i=0; i<temp; i++) {
			realMovies[i] = searchMovies[i];
		}
		return realMovies;
	}

	public void delete(String title) {
		for(int i=0; i<index; i++) {
			if(movies[i].getTitle().equals(title)) { 
				for(int j=i; j<index; j++) {  
					movies[j] = movies[j+1];
				}
				movies[index] = null; 
				index--; 
			}
		}
		
	}
	
	public int getSize() {
		return index;
	}
}







