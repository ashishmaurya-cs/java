package com.ashish;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class EmployeeDao {
	private NamedParameterJdbcTemplate template;

	public EmployeeDao(NamedParameterJdbcTemplate template) {
		super();
		this.template = template;
	}

	public NamedParameterJdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(NamedParameterJdbcTemplate template) {
		this.template = template;
	}
	
	public boolean saveEmployee(Employee e){
		String query="insert into employees values(:id,:name,:salary)";
		Map<String,Object> map=new HashMap<>();
		map.put("id", e.getId());
		map.put("name", e.getName());
		map.put("salary", e.getSalary());
		return template.execute(query, map, new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps)
					throws SQLException, DataAccessException {
				
				return ps.execute();
			}
		});
		
	}

}
