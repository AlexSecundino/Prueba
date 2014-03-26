import java.util.ArrayList;


public class Partida {

	private ArrayList<Criatura> jugador;
	private ArrayList<Criatura> CPU; 
	
	private int puntosJugador, puntosCPU;
	
	private Baraja mazo;

	public Partida()
	{
		this.puntosJugador = 0;
		this.puntosCPU = 0;
		
		mazo = new Baraja();
	}
	
	public void repartirMazo(){
		
	}
	
	public void turno(){
		
	}
	
	public String estadoPartida(){
		return "Mazo = " + mazo;
	}
}
