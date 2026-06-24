package com.nav.library_management.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nav.library_management.entity.Books;

@Repository
public interface BookRepository extends JpaRepository<Books, Long> {

}
