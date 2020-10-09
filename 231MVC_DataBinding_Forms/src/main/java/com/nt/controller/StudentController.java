package com.nt.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.model.Student;

@Controller
public class StudentController {
	
	@GetMapping("/register")
	public String home(@ModelAttribute("stfrm") Student st) {
		System.out.println("StudentController.home()"+st.hashCode());
		st.setSadd("hyd");
		return "student_form";
	}
	
	@PostMapping("/register")
	public String result(@ModelAttribute("stfrm") Student st) {
		System.out.println("StudentController.result()"+st+" "+st.hashCode());
		return "show_result";
	}
	
	/*@GetMapping("/links")
	public String getLinksValue(@RequestParam("sno") int sno,  // here int sno is mathced wiht url or not its not mandatory but
								@RequestParam String sname) {	// here sname is must match with the url
		System.out.println("value is "+sno+"  "+sname);
		return "show_result1";
	}*/
	
	/// FOR CASE 3
	/*@GetMapping("/links")
	public String getLinksValue(@RequestParam("sno") int sno,  
								@RequestParam(required = false,defaultValue = "gupta ji") String sname) {	
		System.out.println("value is "+sno+"  "+sname);
		return "show_result1";
	}*/
	// CASE 5
	@GetMapping("/links")
	public String getLinksValue(@RequestParam("sno") int sno, 
//								@RequestParam String sname) {
								@RequestParam String[] sname,
								@RequestParam List<String> add){
		System.out.println("value is "+sno+"  "+sname[0]+"..."+sname[1]+"****"+add.get(0)+"***"+add.get(1));
		return "show_result1";
	}
}
// case 2: links are case senstive
// case 3: we can pass any no. of value but we cannot take other param name in controller
// 			OR we can take also if value is not there than default value is print
// case 4: order doesn't matter
// case 5: we can also take multiple value for 1 attribute in string ,array or colleciton type
// case 6: we cannot use required=false in int type to sovle this we use wrapper type i.e Integer
