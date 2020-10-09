package com.nt.test;

import java.util.List;
import java.util.Set;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.WriteResult;

public class Test {

	public static void main(String[] args) throws Exception{

		MongoClient mongo = new MongoClient();
		DB db = mongo.getDB("College");		// selecting/creating DB
		System.out.println(db);
		
		List<String> dbs = mongo.getDatabaseNames();	// fetching list of database
		System.out.println(dbs); // [config, local, admin]
		
		
//		Set<String> collections = db.getCollectionNames();	// not working
//		System.out.println(collections); 
		
		DBCollection table = db.getCollection("student");	// selecting/creating collection
		BasicDBObject document = new BasicDBObject();	// creating document object
		document.put("firstName", "siddharth");
		document.put("lastName", "gupta");
		WriteResult verify =table.insert(document);				// saving data in the collection
		if(verify.getError()==null) {
			System.out.println("successfully inserted");
		}
		
		BasicDBObject query = new BasicDBObject();		// creating an object
		query.put("firstName", "siddharth");		// selecting the update colm where name =siddharth
		BasicDBObject newDocument = new BasicDBObject();
		newDocument.put("firstName", "mehta");			// set the value in colm
		BasicDBObject updateObj = new BasicDBObject();
		updateObj.put("$set", newDocument);		// set the value in object
		table.update(query, updateObj);			// execute the query
		
		BasicDBObject searchQuery = new BasicDBObject();	// create a object for storing  query
		searchQuery.put("firstName", "mehta");	// search siddharth in colm
		DBCursor cursor = table.find(searchQuery);		// create query
		while (cursor.hasNext()) {						// execute query
			System.out.println(cursor.next());
		}

		// DELETING A DOCUMENT
//		table=table.getCollection("student");	// selecting a collection
//		BasicDBObject searchQuerys = new BasicDBObject();	// creating a obj
//		searchQuery.put("name", "shaktiman");		// create a query
//		table.remove(searchQuerys);			// deleting a document
	}

}
