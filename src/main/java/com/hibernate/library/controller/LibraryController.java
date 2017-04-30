package com.hibernate.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.library.entity.Library;
import com.hibernate.library.service.LibraryService;

@RestController
public class LibraryController {
	@Autowired
	private LibraryService libraryService;

	@RequestMapping("/addBook")
	public String addBook() {
		Library library = new Library();
		library.setBookName("Mahima");
		library.setBookAuthor("chetan bhagat");
		libraryService.addBook(library);
		return "Successfully inserted..!!!";
	}
	
	@RequestMapping("/getBook")
	public List<Library> getBook(){
		return libraryService.getBook();
		
	}
	@RequestMapping("/deleteBook/{bId}")
	public String deleteBook(@PathVariable int bId){
		Library library = new Library();
		libraryService.deleteBook(bId);
		return "Deleted..!!!";
		
	}
	@RequestMapping("/updateBook")
	public String updateBook(){
		Library library = new Library();
		library.setBookId(2);
		library.setBookName("five point someone");
		return libraryService.updateBook(library);
	}

}
