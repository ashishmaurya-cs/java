package com.ashish;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmpDao {
	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	public int save(EmpBean p){
		String sql="insert into empmvc(name,salary,designation) values('"+p.getName()+"','"+p.getSalary()+"','"+p.getDesignation()+"')";
		return template.update(sql);
	}
	public int update(EmpBean p){
		String sql="update empmvc set name='"+p.getName()+"',salary="+p.getSalary()+",designation='"+p.getDesignation()+"' where id="+p.getId()+"";
		return template.update(sql);
	}
	public int delete(int  id){
		String sql="delete from empmvc where id="+id+"";
		return template.update(sql);
	}
	public EmpBean getEmpById(int id){
		String sql="select * from empmvc where id=?";
		return template.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<EmpBean>(EmpBean.class));
	}
	
	public List<EmpBean> getEmployees(){
		return template.query("select * from empmvc", new RowMapper<EmpBean>() {

			@Override
			public EmpBean mapRow(ResultSet rs, int arg1) throws SQLException {
				EmpBean e=new EmpBean();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setSalary(rs.getFloat(3));
				e.setDesignation(rs.getString(4));
				
				return e;
			}
		});
	}
}
