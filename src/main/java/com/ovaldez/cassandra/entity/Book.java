package com.ovaldez.cassandra.entity;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

	@PrimaryKey
	private Integer bookId;
	private String name;
	private Author authors;
	private String editorial;
	private String year;
}
