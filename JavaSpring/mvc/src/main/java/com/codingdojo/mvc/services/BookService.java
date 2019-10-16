package com.codingdojo.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.mvc.models.Book;
import com.codingdojo.mvc.repositories.BookRepository;


@Service
public class BookService {
	private final BookRepository bookrepository;
	
	public BookService(BookRepository bookRepository) {
		this.bookrepository = bookRepository;
	}
	 // returns all the books
    public List<Book> allBooks() {
        return bookrepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookrepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookrepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    public Book updateBook(Book book) {
            return bookrepository.save(book);
    }
    public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
    	Book uBook = findBook(id);
    	if(uBook != null) {
    		uBook.setTitle(title);
    		uBook.setDescription(desc);
    		uBook.setLanguage(lang);
    		uBook.setNumberOfPages(numOfPages);
    		return this.updateBook(uBook);
    	}
    	return null;
    }
    public void deleteBook(Long id) {
    	bookrepository.deleteById(id);
    }
    
}
