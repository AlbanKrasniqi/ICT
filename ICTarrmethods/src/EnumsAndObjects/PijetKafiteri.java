package EnumsAndObjects;

public enum PijetKafiteri {
	
	RedBull, CocaCola, Sprite,IceTea, Fanta, Makiato, Expresso, Vodka, RakiRrushi;
	
public static void main(String[]args) {
	PijetKafiteri rd = PijetKafiteri.RedBull;
	PijetKafiteri cc = PijetKafiteri.CocaCola;
	PijetKafiteri s = PijetKafiteri.Sprite;
	PijetKafiteri it = PijetKafiteri.IceTea;
	PijetKafiteri f = PijetKafiteri.Fanta;
	PijetKafiteri m = PijetKafiteri.Makiato;
	PijetKafiteri e = PijetKafiteri.Expresso;
	PijetKafiteri v = PijetKafiteri.Vodka;
	PijetKafiteri rr = PijetKafiteri.RakiRrushi;
	if(rd==rd.RedBull) {
		System.out.println("Ju befte mire "+rd.RedBull);
	}else if(rd==rd.CocaCola) {
		System.out.println("Ju befte mire "+rd.CocaCola);
	}else {
		System.out.print("Ju befte mire pija");
	}
	
	


}
}
