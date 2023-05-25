package com.example.caotruongtoan_2011063795.repository;

import com.example.caotruongtoan_2011063795.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepository extends JpaRepository<Book,Long> {

}
