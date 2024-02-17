package com.ashish;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class EmployeeDao {
	private NamedParameterJdbcTemplate jdbcTemplate;
	

	

	public EmployeeDao(NamedParameterJdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	public NamedParameterJdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(NamedParameterJdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public boolean save(Employee e){
		String query="insert into employee22 values(:id,:name,:salary)";
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("id", e.getId());
		map.put("name", e.getName());
		map.put("salary", e.getSalary());
		
		return (Boolean) jdbcTemplate.execute(query, map, new PreparedStatementCallback<Boolean>() {

			@Override
			public final Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				return ps.execute();
			}
		});
		

	}
}