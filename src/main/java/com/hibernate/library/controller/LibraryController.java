package com.hibernate.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.library.entity.Library;
import com.hibernate.library.service.LibraryService;

@RestController
public class LibraryController {
	@Autowired
	private LibraryService libraryService;

	@RequestMapping(value = "/addBook", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String addBook(@RequestBody Library library) {
		// Library library = new Library();
		// library.setBookName("Mahima");
		// library.setBookAuthor("chetan bhagat");
		libraryService.addBook(library);
		return "Successfully inserted..!!!";
	}

	@RequestMapping(value = "/getBook", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<Library> getBook() {
		return libraryService.getBook();

	}

	@RequestMapping(value = "/deleteBook/{bId}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String deleteBook(@PathVariable int bId) {
		// Library library = new Library();
		libraryService.deleteBook(bId);
		return "Deleted..!!!";

	}

	@RequestMapping(value = "/updateBook", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String updateBook(@RequestBody Library library) {
		// Library library = new Library();
		// library.setBookId(2);
		// library.setBookName("five point someone");
		return libraryService.updateBook(library);
	}

}
