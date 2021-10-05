import java.util.Scanner;

public class TridhjetMetoda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		mesazhiHyres();
		detyraThjeshtaMatematike();
		int a1 = 6;
		int b1 = 3;
		double a2 = 9;
		double b2 = 4;
		double b3 = 8;
		int c1 = mbledhja(a1, b1);
		System.out.println(a1 + "+" + b1 + "=" + (c1));
		int c2 = zbritja(a1, b1);
		System.out.println(a1 + "-" + b1 + "=" + (c2));
		int c3 = shumezimi(a1, b1);
		System.out.println(a1 + "*" + b1 + "=" + (c3));
		int c4 = (int) pjesimi(a1, b1);
		System.out.println(a1 + "/" + b1 + "=" + (c4));
		int c5 = (int) modulo(a1, b1);
		System.out.println(a1 + "*" + b1 + "=" + (c5));
		detyraMesmeMatematikore();
		double c6 = rrenjaKatrore(a2);
		System.out.println("Renja katrore e: " + a2 + " eshte: " + c6);
		int c7 = fuqiaKatrore(a1);
		System.out.println("Fuqia katrore e: " + a1 + " eshte: " + c7);
		int c8 = faktorieli(a1);
		System.out.println("Faktorili i: " + a1 + " eshte: " + c8);
		double c9 = sinus(a2);
		System.out.println("Sinusi i : " + a2 + " eshte: " + c9);
		double c10 = kosinus(a2);
		System.out.println("Kosinusi i : " + a2 + " eshte: " + c10);
		double c11 = tangent(a2);
		System.out.println("Kosinusi i : " + a2 + " eshte: " + c11);
		double c12 = coTagent(a2);
		System.out.println("Kosinusi i : " + a2 + " eshte: " + c12);
		double c13 = siperfaqjaRrethit(a2);
		System.out.println("Siperfaqja e rrehit me rreze : " + a2 + " eshte: " + c13);
		double c14 = perimetriRrethit(a2);
		System.out.println("Perimetri i rrehit me rreze : " + a2 + " eshte: " + c14);
		double c15 = perimeriKatrorit(a2);
		System.out.println("Perimetri i katrorit  : " + a2 + " eshte: " + c15);
		double c16 = syprinaKatrorit(a2, b2);
		System.out.println("Syprina katrorit  : " + a2 + "*" + b2 + "shte: " + c16);
		int c17 = vleraMaksimale(a1, b1);
		System.out.println("Vlera maksimale mes: " + a1 + " dhe " + b1 + " eshte " + c17);
		int c18 = vleraMinimale(a1, b1);
		System.out.println("Vlera minimale mes: " + a1 + " dhe " + b1 + " eshte " + c18);
		double c19 = distanca(a2, b2);
		System.out.println("Distanca: " + a2 + " dhe " + b2 + " eshte " + c19);
		String c20 = CiftTek(a1);
		System.out.println("Numri " + a1 + " eshte numer " + c20);
		double c21 = InchNeCm(a2);
		System.out.println(a2 + " inch bejne " + c21 + " centimetra.");
		ekuacieRendaMate();
		double c22 = ekuacioniKuadratikPozitiv(a2,b2,b3);
		System.out.println("Vlera e x1 eshte: "+c22);
		double c23 = ekuacioniKuadratikNegativ(a2,b2,b3);
		System.out.println("Vlera e x2 eshte: "+c23);
		double c24 = energjiaKinetike(a2,b2);
		System.out.println("Kur m eshte "+a2+" dhe v eshte "+b2+" energjia kinetike eshte "+c24);
		double c25 = energjiaPotenciale(a2,b2, b3);
		System.out.println("Kur m eshte "+a2+" dhe v eshte "+b2+"dhe g eshte:"+b3+" energjia potenciale eshte "+c25);
		mesazhiPermbylles();
	}

	public static void mesazhiHyres() {
		System.out.println("Mirserdhet ne 30 metodat e thjeshta");
	}

	public static void detyraThjeshtaMatematike() {
		System.out.println("Tash do te bejme disa detyra te thjeshta matamatikore");
	}

	public static int mbledhja(int a, int b) {
		return a + b;
	}

	public static int zbritja(int a, int b) {
		return a - b;
	}

	public static int shumezimi(int a, int b) {
		return a * b;
	}

	public static double pjesimi(int a, int b) {
		return a / b;
	}

	public static double modulo(int a, int b) {
		return a % b;
	}

	public static void detyraMesmeMatematikore() {
		System.out.println("Vazhdojme me disa detyra te mesme matematikore");
	}

	public static double rrenjaKatrore(double a) {
		return Math.sqrt(a);
	}

	public static int fuqiaKatrore(int a) {
		return (int) Math.pow(a, 2);
	}

	public static int faktorieli(int a) {
		int faktoriel = 1;
		for (int i = 1; i <= a; i++) {
			faktoriel = faktoriel * i;
		}
		return faktoriel;
	}

	public static double sinus(double a) {
		return Math.sin(a);
	}

	public static double kosinus(double a) {
		return Math.cos(a);
	}

	public static double tangent(double a) {
		return Math.tan(a);
	}

	public static double coTagent(double a) {
		double coTanA;
		return coTanA = 1.0 / Math.tan(a);
	}

	public static double siperfaqjaRrethit(double r) {
		return Math.PI * r * r;
	}

	public static double perimetriRrethit(double r) {
		return 2 * Math.PI * r;
	}

	public static double perimeriKatrorit(double a) {
		return 4 * a;
	}

	public static double syprinaKatrorit(double w, double l) {
		return w * l;
	}

	public static int vleraMaksimale(int a, int b) {
		return Math.max(a, b);
	}

	public static int vleraMinimale(int a, int b) {
		return Math.min(a, b);
	}

	public static double distanca(double a, double b) {
		return Math.abs(a - b);
	}

	public static String CiftTek(int a) {
		if (a % 2 == 0) {
			return "Cift";
		} else
			return "Tek";
	}
	public static double InchNeCm(double inch) {
		return inch *2.54;
	}
	public static void ekuacieRendaMate() {
		System.out.println("Tash do te shikojme disa detyra pak me te veshtira matematikore");
	}
	public static double ekuacioniKuadratikPozitiv(double a, double b, double c) {
		return (-b+Math.sqrt(b*b-4*a*c))/2*a;
	}
	public static double ekuacioniKuadratikNegativ(double a, double b, double c) {
		return (-b-Math.sqrt(b*b-4*a*c))/2*a;
	}
	public static double energjiaKinetike(double a, double b) {
		return (1/2)+Math.pow(a, b);
	}
	public static double energjiaPotenciale(double a, double b, double c) {
		return a*b*c;
	}
	public static void mesazhiPermbylles() {
		System.out.println("Kto ishin disa nga detyrat matematikore shpresoj t'ju ken pelqyer");
	}
	

}
