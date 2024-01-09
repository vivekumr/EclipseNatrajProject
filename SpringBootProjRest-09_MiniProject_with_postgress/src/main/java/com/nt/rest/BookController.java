package com.nt.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Book;
import com.nt.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {

	Logger log=LoggerFactory.getLogger(BookController.class);
	@Autowired
	BookService bookServ;

	@GetMapping("/getBook")
	public ResponseEntity<?> getAllBooks() {
		try {
			log.debug("BookController:getAllBooks home");
			List<Book> books = bookServ.fethAllBook();
			log.debug("BookController:getAllBooks redponse ");
			return new ResponseEntity<List<Book>>(books, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("Problem in fetching records", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PostMapping("/saveBook")
	public ResponseEntity<String> saveBook(@RequestBody Book book) {
		try {
			String msg = bookServ.saveBook(book);
			return new ResponseEntity<String>(msg, HttpStatus.CREATED);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("Problem in saving books", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/getBookbById/{id}")
	public ResponseEntity<?> findById(@PathVariable int id){
		try {
			//Long id=Long.valueOf(ids);
		return new ResponseEntity<Book>(bookServ.getBookById(id),HttpStatus.OK);
		}
		catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("Problem in Fetching book Record with id "+id,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@DeleteMapping("/deleteBookById/{id}")
	public ResponseEntity<?> deleteBookById(@PathVariable Integer id){
		try {
		return new ResponseEntity<String>(bookServ.deleteBookById(id),HttpStatus.OK);
		}
		catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("Problem in Fetching book Record with id "+id,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/modifyBook")
	public ResponseEntity<?> updateBookById(@RequestBody Book book){
		try {
		String result=bookServ.modifyBookById(book);
		return new ResponseEntity<String>(result,HttpStatus.OK);
		}
		catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("Problem in Fetching book Record with id "+book.getId(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PatchMapping("/updateBook/{id}/{price}")
	public ResponseEntity<String> updatePriceWithId(@PathVariable int id,@PathVariable int price){
		try {
			String result=bookServ.updatePriceById(id, price);
			return new ResponseEntity<String>(result,HttpStatus.OK);
			}
			catch(Exception e) {
				e.printStackTrace();
				return new ResponseEntity<String>("Problem in Fetching book Record with id "+id,HttpStatus.INTERNAL_SERVER_ERROR);
			}
	}
	
	
	
}
