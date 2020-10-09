package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import com.nt.repo.CustomerRepo;
import com.nt.repo.CustomerRepo.ResultView1;
import com.nt.repo.CustomerRepo.ResultView2;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		CustomerRepo repo=null;
		
		// create IOC container
		ctx=SpringApplication.run(Application.class, args);
		//get service class object
		repo=ctx.getBean(CustomerRepo.class);
		// invoke method
//		List<ResultView1> view1=repo.findBycAdd("hyd");
//		view1.forEach(v->System.out.println(v.getcNo()+" "+v.getcName() ));
		
	//	List<ResultView2> view2=repo.findBycNoBetween(2, 3);
	//	view2.forEach(v2->System.out.println(v2.getcName()+" "+v2.getbillAmntt() ));
		//=============================================================
		
		// dynamic chg the colm projection
	//	List<ResultView1> view1=repo.findBycAdd("hyd",ResultView1.class);
	//	view1.forEach(v2->System.out.println(v2.getcName()+" "+v2.getcNo() ));
			
		List<ResultView2> view1=repo.findBycAdd("hyd",ResultView2.class);
		view1.forEach(v2->System.out.println(v2.getcName()+" "+v2.getbillAmntt() ));
	
		
		((ConfigurableApplicationContext) ctx).close();
		
	}

}
