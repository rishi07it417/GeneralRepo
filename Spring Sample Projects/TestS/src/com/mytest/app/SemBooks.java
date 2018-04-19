package com.mytest.app;


public class SemBooks {
	
	String books;
	private JavaBook javabook;
	
	public SemBooks(JavaBook javabook) {
	      this.javabook = javabook;
	   }
	
	public String getBooks() {
		return books;
	}
	public void setBooks(String books) {
		this.books = books;
	}

	public JavaBook getJavabook() {
		return javabook;
	}

	public void setJavabook(JavaBook javabook) {
		this.javabook = javabook;
	}
	

}
