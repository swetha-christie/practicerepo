package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee
{
	private String eName;
	private String dept;
	private double salary;
	

	public Employee(String eName, String dept, double salary)
	{
		super();
		this.eName = eName;
		this.dept = dept;
		this.salary = salary;
	}


	public String geteName() {
		return eName;
	}


	public void seteName(String eName) {
		this.eName = eName;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [eName=" + eName + ", dept=" + dept + ", salary=" + salary + "]";
	}
}

public class EmployeeRecords
{

	public static void main(String[] args) 
	{
		List<Employee> employeeList=Arrays.asList(new Employee("Peter","Sales",12000),
				                                  new Employee("Erric","Training",15000),
				                                  new Employee("Jason","Sales",14000),
				                                  new Employee("Simon","Admin",20000),
				                                  new Employee("Maria","Development",12000),
				                                  new Employee("Janet","Devops",25000),
				                                  new Employee("Henna","Development",30000),
				                                  new Employee("Martha","Devops",32000));
		Stream<Employee> employeeStream=employeeList.stream();
		//list
//		Collector<Employee,?,List<Employee>> collector=Collectors.toList();
//		List<Employee> devopsList=employeeStream.filter((e)->e.getDept().equals("Devops")).collect(collector);
//      devopsList.forEach(System.out::println);
        
		//set
        Collector<Employee,?,Set<Employee>> collectorSet=Collectors.toSet();
        Set<Employee> developerSet=employeeStream.filter((e)->e.getDept().equals("Development")).collect(collectorSet);
        developerSet.forEach(System.out::println);
        
	}

}
