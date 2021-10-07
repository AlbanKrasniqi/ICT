package ClasessObjects;

public class Punonjes {
	 String name;
	 int age;
	 int salary;
	
	public Punonjes(String emri) {
		this.name = emri;
	}
	public void age(int mosha) {
		age = mosha;
	}
	public void salay(int rroga) {
		salary = rroga;
	}
	public void print() {
		System.out.println("Emri: "+name);
		System.out.println("Mosha: "+age);
		System.out.println("Rroga: "+salary);
		
		

	}
	

}
