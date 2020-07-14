package br.com.bbnsdevelop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bbnsdevelop.data.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}