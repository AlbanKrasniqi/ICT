package bazike;

public class EKuleta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int njec = 0;
		double cnjec = njec*0.00;
		System.out.println("------------------------------");
		System.out.println("1 centshe:   "+njec+"      "+cnjec+"  EUR");
		int dc = 2;
		double cdc = dc*0.02;
		System.out.println("2 centshe:   "+dc+"      "+cdc+" EUR");
		int pc = 10;
		double cpc = pc*0.05;
		System.out.println("5 centshe:  "+pc+"      "+cpc+"  EUR");
		int  fc = 4;
		double cfc = fc*0.5;
		System.out.println("50 centshe:  "+fc+"      "+cfc+"  EUR");
		int nc = 3;
		double cnc = nc*1;
		System.out.println("1 euro:      "+nc+"      "+cnc+"  EUR");
		int dyc = 2;
		double cdyc = dyc*2;
		System.out.println("2 euro:      "+dyc+"      "+cdyc+"  EUR");
		System.out.println("------------------------------");
		
		double totali = cnjec +cdc+cpc+cfc+cnc+cdyc;
		System.out.println("Totali:             "+totali+" EUR");
		System.out.println("------------------------------");



	}

}
