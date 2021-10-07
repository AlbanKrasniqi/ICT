package ClasessObjects;

public class PunonjesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punonjes p = new Punonjes("Alban");
		Punonjes p2 = new Punonjes("Aaaa");
		
		p.age = 21;
		p.salary = 200000;
		p.print();
		
		p2.age = 30;
		p.salary = 500;
		p2.print();
		

	}

}
