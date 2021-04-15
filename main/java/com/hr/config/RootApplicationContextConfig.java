package com.hr.config;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import oracle.jdbc.pool.OracleDataSource;


@Configuration
@ComponentScan("com.hr")
public class RootApplicationContextConfig {
	private static String driver="oracle.jdbc.OracleDriver";
	private static String url="jdbc:oracle:thin:@localhost:1521:xe";
	private static String username="bokjs";
	private static String password="test";
	
	@Bean
	public DataSource dataSource() throws SQLException {
		OracleDataSource ds = new OracleDataSource();
		ds.setURL(url);
		ds.setUser(username);
		ds.setPassword(password);
		return ds;
	}
	@Bean
	public NamedParameterJdbcTemplate getJdbcTemplate() throws SQLException {
		return new NamedParameterJdbcTemplate(dataSource());
	}
}
