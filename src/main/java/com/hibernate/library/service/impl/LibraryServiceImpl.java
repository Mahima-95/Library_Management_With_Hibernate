package com.hibernate.library.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hibernate.library.dao.LibraryDao;
import com.hibernate.library.entity.Library;
import com.hibernate.library.service.LibraryService;

@Service
public class LibraryServiceImpl implements LibraryService {

	@Autowired
	private LibraryDao libraryDao;

	@Override
	@Transactional
	public String addBook(Library library) {
		return libraryDao.addBook(library);
	}

	@Override
	@Transactional
	public String updateBook(Library library) {
		return libraryDao.updateBook(library);
	}

	@Override
	@Transactional
	public String deleteBook(int bId) {
		return libraryDao.deleteBook(bId);
	}

	@Override
	@Transactional
	public List<Library> getBook() {
		return libraryDao.getBook();
	}

}
