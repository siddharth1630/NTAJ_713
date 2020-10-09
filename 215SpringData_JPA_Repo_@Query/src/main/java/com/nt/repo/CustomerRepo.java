 package com.nt.repo;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nt.entity.Customer;

@Transactional
public interface CustomerRepo extends JpaRepository<Customer, Integer>{
	// Select bulk operation using positional param( entity all com values)
	@Query("FROM Customer")
	List<Customer> getAllCustomer();
//	@Query("FROM Customer WHERE cAddr=?")	// error jdbc type parameter not supported
	@Query("FROM Customer WHERE cAdd=?1")
	List<Customer> getCustomerByCity(String city);
	
	@Query("FROM Customer WHERE billAmnt>?1 AND billAmnt<=?2")
	List<Customer> getCustByBillAmntRange(double min,double max);
	
	// Select bulk operation using named param( entity all com values)
	@Query("FROM Customer WHERE cAdd IN(:cOne,:cTwo)")
	List<Customer> getCustByCity(@Param("cOne")String city1,@Param("cTwo")String city2);
	
//	@Query("FROM Customer WHERE cName=:name")
//	List<Customer> getCustBycName(@Param("name")String name);
	
	@Query("FROM Customer WHERE cName=:name")// if the parameter name and postional name is same then 
	List<Customer> getCustBycNames(String name);	// no need to use the @param 
	
	// Select bulk operation using named param( specific multiple query->Scalar queries)
	@Query("SELECT cNo,cName FROM Customer WHERE cAdd=:city")
	List<Object[]> getDataByCity(@Param("city")String city);
	
	@Query("SELECT billAmnt FROM Customer WHERE cAdd In(:city,:city1)")
	List<Double> getDataByBillAmnt(@Param("city")String city,@Param("city1")String city1);
	
	@Query("SELECT MAX(billAmnt) FROM Customer")
	double findMaxBillAmnt();
	@Query("SELECT MAX(billAmnt),AVG(billAmnt),Min(billAmnt),COUNT(*) FROM Customer")
	Object findAggregteResult();
	
	//===========================	SINGLE ROW SELECT OPERATION USING HQL (ENTITY)================
//	@Query("FROM Customer WHERE cName=:name")
//	Customer getCustomerBycName(String name);
	
	//===========================	SINGLE ROW SELECT OPERATION USING HQL (scalor query selecting multiple colm)================
//		@Query("SELECT cName,billAmnt FROM Customer WHERE cName=:name")
//		List<Object[]> getCustomerBycName(String name);
		// OR
//	@Query("SELECT cName,billAmnt FROM Customer WHERE cName=:name")
//	Object getCustomerBycName(String name);

	//===========================	SINGLE ROW SELECT OPERATION USING HQL (scalor query selecting multiple colm)================
	/*@Query("SELECT billAmnt FROM Customer WHERE cName=:name")
	Double getBillAmntBycName(String name);
	*/
	// =========================== NON SELECT- OPERATION
	@Modifying
	@Query("UPDATE Customer set billAmnt =:billAmnt WHERE cName=:name")
	int updatebillAmntBycName(String name,double billAmnt);
	
	@Modifying
	@Query("DELETE FROM Customer where billAmnt<:amount")
	int deleteCustomerByBillAmnt(double amount);
	
	// ==================== NATIVE QUERY =============================
//	@Query(nativeQuery = true ,value="SELECT C_NO,C_NAME,BILL_AMNT,C_ADD FROM CUSTOMER WHERE C_ADD=?1")
//	@Query(nativeQuery = true ,value="SELECT C_NO,C_NAME,BILL_AMNT,C_ADD FROM CUSTOMER WHERE C_ADD=?1")
//	@Query(nativeQuery = true ,value="SELECT C_NO,C_NAME,BILL_AMNT,C_ADD FROM CUSTOMER WHERE C_ADD=:addr")
//	Iterable<Customer> fetchDetail(String addr);
	
	@Query(nativeQuery = true,value="SELECT SYSDATE FROM DUAL")
	Date getSystemDate();
	
	// inserting
	@Query(nativeQuery = true,value="INSERT INTO CUSTOMER VALUES(?,?,?,?)")
	@Modifying
	int insertCustomerDetail(int cno,double billAmnt,String add,String name);
	
	// calling the prorcudure
//	@Query(nativeQuery =  true ,value="{call fetchCustomerDetail(?)}")
//	Iterable<Customer> fetchDetail(String addr);
}
