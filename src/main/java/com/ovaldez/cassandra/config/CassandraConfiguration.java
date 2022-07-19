package com.ovaldez.cassandra.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;

public class CassandraConfiguration extends AbstractCassandraConfiguration {

	@Value("${spring.data.cassandra.keyspace-name}")
	private String keySpaceName;
	
	@Override
	protected String getKeyspaceName() {
		return null;
	}

}
