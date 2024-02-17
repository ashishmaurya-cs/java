package com.ashish;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("studentconfi.xml");
		StudentDao sdao= (StudentDao) ctx.getBean("sdao");
		//boolean i=sdao.updateStudent(new StudentPojo(33, "Amit", 999));
		
		StudentPojo ss=new StudentPojo();
		ss.setRoll(33);
		//boolean i=sdao.deleteStudent(ss);
		//System.out.println(i);
		
		List<StudentPojo> list=sdao.getAllStudent();
		Iterator<StudentPojo> itr=list.iterator();
		while(itr.hasNext()) {
			StudentPojo s = itr.next();
			System.out.println(s.getRoll()+s.getName()+s.getMark());
		}
	}
}
