package com.hibernate.library.service;

import java.util.List;

import com.hibernate.library.entity.Library;

public interface LibraryService {

	public String addBook(Library library);

	public String updateBook(Library library);

	public String deleteBook(int bId);

	public List<Library> getBook();
}
