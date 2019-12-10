package com.test.assignment_10dec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.time.*;


public class SortList{
	public static void main(String[] args) {
		ArrayList<Employee> emp=new ArrayList<Employee>();
		emp.add(new Employee("Rocket",LocalDateTime.of(1997, 06, 20, 02, 19),"Pune",4000));
		emp.add(new Employee("Groot",LocalDateTime.of(1985, 02, 27, 20, 19),"Gangtok",5010));
		emp.add(new Employee("Gamora",LocalDateTime.of(1956, 11, 16, 7, 45),"Chennai",9110));
		emp.add(new Employee("Bruce Wayne",LocalDateTime.of(1970, 9, 15, 12, 55),"Udaipur",7500));
		emp.add(new Employee("Clark Kent",LocalDateTime.of(2001, 01, 28, 3, 25),"Agra",4600));
		emp.add(new Employee("Steve Roggers",LocalDateTime.of(1933, 07, 10, 14, 10),"Jammu",3700));
		emp.add(new Employee("Tony Stark",LocalDateTime.of(1986, 8, 22, 23, 55),"Mumbai",4780));
		emp.add(new Employee("Bruce Banner",LocalDateTime.of(1967, 12, 29, 17, 30),"Bangalore",6999));
		emp.add(new Employee("Thanos",LocalDateTime.of(1907, 02, 13, 19, 19),"Delhi",9456));
		emp.add(new Employee("Doctor Strange",LocalDateTime.of(1984, 06, 30, 20, 39),"Patna",8750));
		emp.add(new Employee("Peter Parker",LocalDateTime.of(2004, 03, 21, 00, 00),"Jaipur",9106));
		
		System.out.println("Average Salary: "+avgSalary(emp));
		System.out.println("List in descending order of Salary\n,"+sortSalary(emp));
		System.out.println("Date Of Birth(in ascending order)\n,"+sortDob((ArrayList<Employee>) emp));
		System.out.println("Enter city name:");
		Scanner sc=new Scanner(System.in);
		String city=sc.next();
		System.out.println(searchCity(city,emp));

	}

	private static ArrayList<Employee> searchCity(String city, ArrayList<Employee> emp) {
		ArrayList<Employee> emp1=new ArrayList<Employee>();
		for(Employee e:emp) {
			if(city.equals(e.getCity())) {
				emp1.add(e);
			}
		}
		return emp1;
		
	}

	private static ArrayList<Employee> sortDob(ArrayList<Employee> emp) {
		Collections.sort(emp,new Comparator<Employee>() {
			public int compare(Employee obj1, Employee obj2) {
				if(obj1.getDob().isAfter(obj2.getDob())) {
					return 1;
				}
				else if(obj1.getDob().isBefore(obj2.getDob())) {
					return -1;
				}
				else 
				{
					return 0;
				}
			}
		}
		);
		
		return emp;
	}
			
	

	private static ArrayList<Employee> sortSalary(ArrayList<Employee> emp) {
		Collections.sort(emp,new Comparator<Employee>() {
			@Override
			public int compare(Employee obj1, Employee obj2) {
				return Integer.compare(obj2.getSalary(),obj1.getSalary());
			}
		});
		return emp;
	}

	private static int avgSalary(List<Employee> emp) {
		int sum=0,count=0;
		for(Employee e:emp) {
			sum+=e.getSalary();
			count++;
		}
		return sum/count;
		
	}
}
