package model;

public class Employee {

	private int id;  
	private String name;  

	public Employee() {
		System.out.println("Constructor");
	}  

	public Employee(int id) {
		this.id = id;
	}  

	public Employee(String name) {  
		this.name = name;
	}  

	public Employee(int id, String name) {  
		this.id = id;  
		this.name = name;  
	}  

	void displayInfo(){  
		System.out.println("ID"+"\t|"+"\t"+"NAME");  
		System.out.println("---------------------");
		System.out.println(id+"\t|"+"\t"+name);  
	}   

}
