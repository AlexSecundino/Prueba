import java.util.ArrayList;


public class Baraja {

	private ArrayList<Criatura> jugador; 
	private final int MAX_CRIATURAS = 20;
	
	public Baraja() {

		jugador = new ArrayList<Criatura>();
		
		for(int i = 1; i <= MAX_CRIATURAS; i++)
		{
			Criatura a = new Criatura();
			jugador.add(a);
		}
	}

	@Override
	public String toString() {
		return "Mano = " + jugador;
	}
	
	
	
}
