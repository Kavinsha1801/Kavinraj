package org.singleton;

public class Sample {
	public static void main(String[] args) {
		Employee emp=Employee.getInstance();
		emp.add();
		emp.sub();
	}

}
