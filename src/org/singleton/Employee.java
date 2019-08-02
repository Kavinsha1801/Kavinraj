package org.singleton;

public class Employee {
	static Employee e=null;
	private Employee() {
	}
public static Employee getInstance() {
if(e==null)
{
	e=new Employee();
}

System.out.println(e);
return e;

}
public void add() {
	System.out.println("addition");
}
public void sub() {
	System.out.println("subtract");
}

}

	
	
	


