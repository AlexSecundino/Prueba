import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class Baraja {

	private ArrayList<Criatura> mazo;
	private final int TOTAL_CRIATURAS = 40;
	
	private ArrayList<Criatura> jugador;
	private ArrayList<Criatura> CPU;
	
	public Baraja() {

		mazo = new ArrayList<Criatura>();
		
		jugador = new ArrayList<Criatura>();
		CPU = new ArrayList<Criatura>();
		
		for(int i = 1; i <= TOTAL_CRIATURAS; i++)
		{
			Criatura a = new Criatura();
			mazo.add(a);
		}
	}
	
	public void turno(){
		repartirMazo();
	}
	
	private void repartirMazo(){
		for(int i = 0; i < TOTAL_CRIATURAS / 2; i++)
		{
			jugador.add(extraerCriatura());
			CPU.add(extraerCriatura());
		}
		Collections.sort(jugador);
		Collections.sort(CPU);
	}
	
	private Criatura extraerCriatura() {
		// TODO Auto-generated method stub
		Criatura a = null;
		int indice = conseguirIndice();
		a = mazo.get(indice);
		mazo.remove(indice);
		return a;
		
	}

	private int conseguirIndice() {
		// TODO Auto-generated method stub
		int indice = 0;
		Random r = new Random();
		indice = r.nextInt(mazo.size());
		return indice;
	}
	
	@Override
	public String toString() {
		return "Jugador = " + jugador +
				"\n\nCPU = " + CPU;
	}
	
	
	
}
