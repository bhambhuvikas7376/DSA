package Algorithm;

import java.util.*;
import java.io.*;
class Empl{
	private String name; 
	int salary;
	
	public Empl (String name, int salary) {
		this.name = name;
		this.salary = salary;
}
	public String getName(){
		return name;
	}

	public int getSalary () {
		return salary;
	}
}
class SalaryComparator implements Comparator<Empl>{
	@Override
	public int compare(Empl e1, Empl e2) {
		return e1.salary - e2.salary;
	}
}
public class Bubblesort{
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in)) ;
		int n = Integer. parseInt (br. readLine ());
		TreeSet<Empl> employees = new TreeSet<>(new SalaryComparator());
		for(int i = 0; i < n; i++){
			String[] input = br.readLine ().split (" ");
            String name = input[0];
            int salary = Integer.parseInt(input[1]); 
            employees.add (new Empl (name, salary)) ;
    }
        for (Empl emp: employees) {
        System.out.println(emp.getName () + " " + emp.getSalary());
        }
	}
}