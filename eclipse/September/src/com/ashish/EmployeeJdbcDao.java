package com.ashish;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeJdbcDao {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	int save(EmployeeJdbc e){
		String query="insert into employee22 values('"+e.getId()+"','"+e.getName()+"','"+e.getSalary()+"')";
		int status=jdbcTemplate.update(query);
		return status;
		
	}
	
	int update(EmployeeJdbc e){
		String query="update  employee22 set name='"+e.getName()+"' , salary='"+e.getSalary()+"' where id='"+e.getId()+"'";
		int status =jdbcTemplate.update(query);
		return status;
	}
	
	int delete(int i){
		String query="delete from employee22 where id='"+i+"'";
		int status=jdbcTemplate.update(query);
		return status;
	}
	
}
