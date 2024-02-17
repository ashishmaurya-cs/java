package com.ashish;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

public class StudentDao {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	/*public Boolean saveStudent(StudentPojo s){
		String query = "insert into student values(?,?,?)";
		
		return jdbcTemplate.execute(query, new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				ps.setInt(1, s.getRoll());
				ps.setString(2, s.getName());
				ps.setInt(3, s.getMark());
				return ps.execute();
			}
		});
		
	}
	*/
	
	
	/*public Boolean updateStudent(StudentPojo s){
		String query = "update student set name=?,mark=? where rollNo=?";
		
		return jdbcTemplate.execute(query, new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				ps.setString(1, s.getName());
				ps.setInt(2, s.getMark());
				ps.setInt(3, s.getRoll());
				return ps.execute();
			}
		});
	}*/
	
	/*public Boolean deleteStudent(StudentPojo s){
		String query="delete from student where rollNo=?";
		return jdbcTemplate.execute(query, new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				ps.setInt(1, s.getRoll());
				return ps.execute();
			}
		});
	}
*/	

	public List<StudentPojo> getAllStudent(){
		String queryS = "select * from student";
		
		return jdbcTemplate.query(queryS, new RowMapper<StudentPojo>() {

			@Override
			public StudentPojo mapRow(ResultSet rs, int arg1) throws SQLException {
				// TODO Auto-generated method stub
				StudentPojo s= new StudentPojo();
				
					
					s.setRoll(rs.getInt(1));
					s.setName(rs.getString(2));
					s.setMark(rs.getInt(3));
					
			
				return s;
			}
			
		});
		
	}
	
}
