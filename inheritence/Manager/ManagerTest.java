package com.monocept.inheritence.Manager;
import java.util.*;

public class ManagerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		
		Manager manager=new Manager();
		
		System.out.println("Enter id ,name,address and salary of manager");
		int employeedId=scanner.nextInt();
		String name=scanner.next();
		String address=scanner.next();
		int salary=scanner.nextInt();
		
		manager.setManager(name,address,employeedId,salary);
		manager.showManager();
		

	}

}
