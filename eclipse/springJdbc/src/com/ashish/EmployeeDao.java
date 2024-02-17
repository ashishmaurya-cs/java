package com.ashish;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {
	//persistcore+core+mysqlConnector
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int saveEmployee(Employee e){
		String query="insert into employee22 value('"+e.getId()+"','"+e.getName()+"','"+e.getSalary()+"')";
		return jdbcTemplate.update(query);
	}
	public int updateEmployee(Employee e){
		String query="update employee22 set name='"+e.getName()+"',salary='"+e.getSalary()+"' where id='"+e.getId()+"'";
		return jdbcTemplate.update(query);
	}
	
	public int deleteEmployee(Employee e){
		String query ="delete from employee22 where id='"+e.getId()+"'";
		return jdbcTemplate.update(query);
	}
}
