package com.nt.service;

import java.util.List;

import com.nt.model.Book;

public interface BookService {
	
	public List<Book> fethAllBook();
	public String saveBook(Book book);
	public Book getBookById(int id);
	public String deleteBookById(int id);
	public String modifyBookById(Book book);
	public String updatePriceById(int id,int percent);
	
}
