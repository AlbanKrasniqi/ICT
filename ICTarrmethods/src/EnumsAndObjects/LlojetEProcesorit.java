package EnumsAndObjects;

public enum LlojetEProcesorit {
	INTEL,ADM;
	public static void main(String[]args) {
		LlojetEProcesorit i  =LlojetEProcesorit.INTEL;
		LlojetEProcesorit a = LlojetEProcesorit.ADM;
		
		switch(i) {
		case INTEL:
			System.out.println("Procesorë Intel më së shpeshti përdoren në sistemet "
					+ "kompjuterike parafabrikuara, të tilla si ato të Dell dhe HP");
			break;
			
		case ADM:
			System.out.println("AMD është e para për të ndërtuar një procesor 64-bit, e aftë të lartë aplikacioneve "
					+ "fund përdorimit me operacionet grafike intensive.");
			break;
			default:
				System.out.print("...");
				break;
		}
	}
	

}
 
