package com.application.libmanagement.repository;

import com.application.libmanagement.entity.Book;
import com.application.libmanagement.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository  extends JpaRepository<Publisher,Long> {
}
