package com.equals;

public class Employee {
	
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
 @Override
public boolean equals(Object obj) {
	 
	//not null not same class
	 if(obj == null || this.getClass() != obj.getClass()) {
		 return false;
	 }
	 
	 //address
	 if( obj == this) {
		 return true;
	 }
	 
	 //create typecasted obj
	 Employee e = (Employee) obj;
	 
	 return (this.getId() == e.getId());
}
 
 @Override
public int hashCode() {
	// TODO Auto-generated method stub
	 
	//return getId();
//	 final int prime = 31;
//	 int result = 1;
//	 result = prime * result +id;
//	 return result;
	 
	 return this.name.length()%10;
}
	

}
