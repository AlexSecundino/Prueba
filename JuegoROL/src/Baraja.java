import java.util.ArrayList;


public class Baraja {

	private ArrayList<Criatura> mazo; 
	private final int TOTAL_CRIATURAS = 40;
	
	public Baraja() {

		mazo = new ArrayList<Criatura>();
		
		for(int i = 1; i <= TOTAL_CRIATURAS; i++)
		{
			Criatura a = new Criatura();
			mazo.add(a);
		}
	}

	@Override
	public String toString() {
		return "" + mazo;
	}
	
	
	
}
