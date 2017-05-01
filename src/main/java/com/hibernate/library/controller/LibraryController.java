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
import com.hibernate.library.mappers.LibraryMappers;
import com.hibernate.library.response.LibraryResponse;
import com.hibernate.library.service.LibraryService;

@RestController
public class LibraryController {
	@Autowired
	private LibraryService libraryService;

	@Autowired
	private LibraryMappers libraryMappers;

	@RequestMapping(value = "/addBook", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse addBook(@RequestBody Library library) {
		return new LibraryResponse(libraryService.addBook(library));
	}

	@RequestMapping(value = "/getBook", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<Library> getBook() {
		return libraryMappers.mapLibrary(libraryService.getBook());

	}

	@RequestMapping(value = "/deleteBook/{bId}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse deleteBook(@PathVariable int bId) {
		return new LibraryResponse(libraryService.deleteBook(bId));

	}

	@RequestMapping(value = "/updateBook", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse updateBook(@RequestBody Library library) {
		return new LibraryResponse(libraryService.updateBook(library));
	}

}
