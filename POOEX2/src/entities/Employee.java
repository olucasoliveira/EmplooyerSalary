package entities;

public class Employee {
	
	public String name;
	public double tax;
	public double grossSalary;
	public double salario;
	
	public double netSalary() {
		return grossSalary - tax;
		
	}
	public void increaseSalary(double percentage) {
		salario=(this.grossSalary * (1 + percentage/100))-tax;
	}
	
	public String toString() {
		
		return name 
				+ ", $ "
				+ String.format("%.2f", salario);
	}
	

}
