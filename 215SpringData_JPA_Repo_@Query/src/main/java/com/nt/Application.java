package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.entity.Customer;
import com.nt.repo.CustomerRepo;

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
//		repo.getAllCustomer().forEach(System.out::println);
//		repo.getCustomerByCity("hyd").forEach(System.out::println);
		
//		repo.getCustByBillAmntRange(14000, 23000).forEach(System.out::println);
	//	repo.getCustByCity("hyd","indore").forEach(System.out::println);
	//	repo.getCustBycName("vikash").forEach(System.out::println);
		repo.getCustBycNames("vikash").forEach(System.out::println);
		
		// ================== AGGREGATE FUNCTION =====================
		System.out.println(repo.findMaxBillAmnt());
		Object result[]=(Object[]) repo.findAggregteResult();
		System.out.println(result[0]+" "+result[1]+" "+result[2]+" "+result[3]);
		
	//	repo.getDataByCity("hyd").forEach(System.out::println);	// the return type of Object toString is hashcode
	/*	repo.getDataByCity("hyd").forEach(e->{
		//	System.out.println(e[0]+" "+e[1]);	// but problem with that if we increase the colm then printing is not work
			for(Object val:e) {
				System.out.println(val);
			}
		});
	*/	
	//	repo.getDataByBillAmnt("hyd","delhi").forEach(System.out::println);
		
	/*List<Object[]> list=repo.getCustomerBycName("vikash");
	Object data[]=list.get(0);
	System.out.println(data[0]+" "+data[1]);
	*/
		// OR
	/*	Object list=repo.getCustomerBycName("sid");
		Object data[]=(Object[]) list;
		System.out.println(data[0]+" "+data[1]);
	*/		
	/*	double bAmt=repo.getBillAmntBycName("vikash");
		System.out.println("Bill Amount: "+bAmt);
	*/	
		
		// ================= NON - SELECT QUERY ========================
	//	System.out.println("number of record updated-->"+repo.updatebillAmntBycName("vikash", 7777));
		
	//	System.out.println("number of record deleted-->"+repo.deleteCustomerByBillAmnt(10000));
		
		
		// =================== NATIVE QUERY ========================
//		repo.fetchDetail("hyd").forEach(System.out::println);
		
//		System.out.println(repo.getSystemDate());
		
//		int count=repo.insertCustomerDetail(144, 35000, "deo", "gupta");
//		System.out.println(count==0?"record not inserted":"succefully inserted");
		
	//	repo.fetchDetail("hyd").forEach(System.out::println);
		
		
		((ConfigurableApplicationContext) ctx).close();
		
	}

}
