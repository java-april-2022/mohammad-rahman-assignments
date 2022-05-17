

/* 
 * BACKGROUND:
 * This type of Controller (with @Controller) is used in 
 * full-stack Java.
 * The other type of Controller (BooksApi.java) with @RestController is used for back-end Java only.  Front end might be python/js

*/

package com.codingdojo.mvc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.codingdojo.mvc.models.Book;
import com.codingdojo.mvc.services.BookService;

@Controller
public class BookController {

	
	@Autowired
	BookService bookService;
	
	
	@GetMapping("/books/{bookId}")
	public String index(Model model, @PathVariable("bookId") Long bookId) {
		
		System.out.println(bookId);
		Book book = bookService.findBook(bookId);
		System.out.println(book);
		
		List<Book> books = bookService.allBooks();
		
		
		model.addAttribute("book", book);
		model.addAttribute("books", books);
		
		return "show.jsp";
	}
}
