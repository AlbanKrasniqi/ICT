package EnumsAndObjects;

public enum LlojetEProcesorit {
	INTEL,ADM;
	public static void main(String[]args) {
		LlojetEProcesorit i  =LlojetEProcesorit.INTEL;
		LlojetEProcesorit a = LlojetEProcesorit.ADM;
		
		switch(i) {
		case INTEL:
			System.out.println("Procesor� Intel m� s� shpeshti p�rdoren n� sistemet "
					+ "kompjuterike parafabrikuara, t� tilla si ato t� Dell dhe HP");
			break;
			
		case ADM:
			System.out.println("AMD �sht� e para p�r t� nd�rtuar nj� procesor 64-bit, e aft� t� lart� aplikacioneve "
					+ "fund p�rdorimit me operacionet grafike intensive.");
			break;
			default:
				System.out.print("...");
				break;
		}
	}
	

}
 
