package com.ashish.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ashish.EmpBean;
import com.ashish.EmpDao;

@Controller
public class EmpController {
	@Autowired
	EmpDao dao;// it will inject dao from XML file   
	  /*It displays a form to input data, here "command" is a reserved request attribute  
     *which is used to display object data into form  
     */
	@RequestMapping("/empform")
		public ModelAndView showform(){
			return new ModelAndView("empform","command",new EmpBean());
		}
	  /*It saves object into database. The @ModelAttribute puts request data  
     *  into model object. You need to mention RequestMethod.POST method   
     *  because default request is GET*/ 
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("empBean") EmpBean empBean){
		dao.save(empBean);
		return new ModelAndView("redirect:/viewemp");
	}
	  /* It provides list of employees in model object */   
	@RequestMapping("/viewemp")
	public ModelAndView viewemp(){
		List<EmpBean> list=dao.getEmployees();
		return new ModelAndView("viewemp","list",list);
		
	}
	   /* It displays object data into form for the given id.   
     * The @PathVariable puts URL data into variable.*/ 
	@RequestMapping(value="/editemp/{id}")
	public ModelAndView edit(@PathVariable int id){
		EmpBean empBean=dao.getEmpById(id);
		return new ModelAndView("empeditform","command",empBean);
	}
	  /* It updates model object. */ 
	@RequestMapping(value="/editsave",method=RequestMethod.POST)
	public ModelAndView editsave(@ModelAttribute("empBean")EmpBean empBean){
		dao.update(empBean);
		return new ModelAndView("redirect:/viewemp");
	}
	 /* It deletes record for the given id in URL and redirects to /viewemp */
	@RequestMapping(value="/deleteemp/{id}",method=RequestMethod.GET)
	public ModelAndView delete(@PathVariable int id){
		dao.delete(id);
		return new ModelAndView("redirect:/viewemp");
	}
	
	
}
