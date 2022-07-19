package com.ovaldez.cassandra.entity;

import org.springframework.data.cassandra.core.mapping.UserDefinedType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@UserDefinedType(value = "author")
public class Author {

	private String name;
	private String dob;
	private String ethnic;
}
