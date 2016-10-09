package com.rabbit.schedule.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public String getName(long id){
		String sql = "select name from person where id = ?";
		Object[] params = {id};
		return jdbcTemplate.queryForObject(sql, params, String.class);
	}
}
