package com.ovaldez.cassandra.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.ovaldez.cassandra.entity.Book;

public interface BookRepository extends CassandraRepository<Book, Integer> {

}
