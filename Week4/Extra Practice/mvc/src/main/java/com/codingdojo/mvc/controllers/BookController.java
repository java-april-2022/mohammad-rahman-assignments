

/* 
 * BACKGROUND:
 * This type of Controller (with @Controller) is used in 
 * full-stack Java.
 * The other type of Controller (BooksApi.java) with @RestController is used for back-end Java only.  Front end might be python/js

*/

package com.codingdojo.mvc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.mvc.models.Book;
import com.codingdojo.mvc.services.BookService;

@Controller
public class BookController {

	
	@Autowired
	BookService bookService;
	
	
	@GetMapping("/books/{bookId}")
	public String index(Model model, @PathVariable("bookId") Long bookId) {
		Book book = bookService.findBook(bookId);
		List<Book> books = bookService.allBooks();
		model.addAttribute("book", book);
		return "show.jsp";
	}
	    
    @GetMapping("/books")
    public String index(Model model) {
        List<Book> books = bookService.allBooks();
        model.addAttribute("books", books);
        return "index.jsp";
    }
    
    @GetMapping("/books/new")
    public String newBook() {
    	return "new.jsp";
    }
    
    @PostMapping(value="/books")
	public String create(
			@RequestParam("title") String title, 
			@RequestParam("description") String description, 
			@RequestParam("language") String language, 
			@RequestParam("numberOfPages") Integer pages)
    {
		Book book = new Book(title, description, language, pages);
		bookService.createBook(book);
		
		return "redirect:/books";
	}
    
    @GetMapping("/books/{id}/edit")
    public String edit(@PathVariable("id") Long id, Model model) {
        Book book = bookService.findBook(id);
        model.addAttribute("book", book);
        return "edit.jsp";
    }
    
    @PutMapping("/books/{id}")
    public String update(@Valid @ModelAttribute("book") Book book, BindingResult result) {
        if (result.hasErrors()) {
            return "edit.jsp";
        } else {
            bookService.updateBook(book);
            return "redirect:/books";
        }
    }

}
