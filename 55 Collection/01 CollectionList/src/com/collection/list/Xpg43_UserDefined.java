package com.collection.list;

import java.util.ArrayList;

public class Xpg43_UserDefined {
	public static void main(String[] args) {
		ArrayList al=new ArrayList<>();
		al.add(new A(5));
		al.add(new A(6));
		al.add(new A(7));
		System.out.println(al);
		al.remove(new A(7));
		System.out.println(al);
	}
}

// to string methods is not overriden so it returns class@hashcode
/* class A{
	int x;
	A(int x){
		this.x=x;
	}
}*/

// it cannot remove element because it doesn't override equals method
/*class A{
	int x;
	A(int x){
		this.x=x;
	}
	public String toString() {
		return "A("+x+")";
	}
}
*/
class A{
	int x;
	A(int x){
		this.x=x;
	}
	
	public String toString() {
		return "A("+x+")";
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof A) {
			A a=(A)obj;
			return (this.x==a.x);
		}
		return false;
		
	}
}
