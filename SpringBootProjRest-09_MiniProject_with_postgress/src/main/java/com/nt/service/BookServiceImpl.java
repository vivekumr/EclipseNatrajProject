package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Book;
import com.nt.repository.BookRepository;

@Service("bookService")
public class BookServiceImpl implements BookService{

	@Autowired
	BookRepository bookRepo;
	
	@Override
	public List<Book> fethAllBook() {
		List<Book> books=bookRepo.findAll();
		return books;
	}

	@Override
	public String saveBook(Book book) {
		Long idVal=bookRepo.save(book).getId();
		return idVal+" Book saved.";
	}

	@Override
	public Book getBookById(int id) {
		//bookRepo.findById((long) id).get();
		return bookRepo.findById((long) id).get();

	}

	@Override
	public String deleteBookById(int bookId) {
		Optional<Book> opt= bookRepo.findById((long) bookId);	
		if(opt.isPresent()) {
			bookRepo.deleteById((long) bookId);
			return bookId+" id is deleted";
		}
		else {
			return bookId+" id Book is Not found";
		}
	}

	@Override
	public String modifyBookById(Book book) {
		Optional<Book> opt= bookRepo.findById(book.getId());	
		if(opt.isPresent()) {
			bookRepo.save(book);
			return book.getId()+" id is Updated";
		}
		else {
			return book.getId()+" id Book is Not found";
		}
	}

	@Override
	public String updatePriceById(int id, int percent) {
		Optional<Book> opt=bookRepo.findById((long) id);
		if(opt.isPresent()) {
			Book book=opt.get();
			int price=book.getPrice()+percent;
			book.setPrice(price);
			bookRepo.save(book);
			return "Book "+id+" updated with price "+price;
		}
		else {
			return id+" Book id not found";
		}
	}



}
