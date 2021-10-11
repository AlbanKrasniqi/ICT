package EnumsAndObjects;

public enum RAMtypes {
	CVL,KHP,KHF;
	
	public static void main(String[]args) {
		RAMtypes cvl = RAMtypes.CVL;
		RAMtypes khp = RAMtypes.KHP;
		RAMtypes khf = RAMtypes.KHF;
		
		ramNames(cvl,khp,khf);

		
	}
	static void ramNames(RAMtypes cvl,RAMtypes khp,RAMtypes khf) {
		switch(cvl) {
		case CVL:
			System.out.println("Corsair Vengeance LED");
			break;
		case KHP:
			System.out.println("Kingston HyperX Predator");
			break;
		case KHF:
			System.out.println("Kingston HyperX Fury");
			break;
			default:
				System.out.print(".....");
				break;
			
		}
	}

}
