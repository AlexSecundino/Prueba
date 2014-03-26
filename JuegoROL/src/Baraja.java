import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;


public class Baraja {

	private ArrayList<Criatura> mazo;
	private final int TOTAL_CRIATURAS = 40;
	
	private ArrayList<Criatura> jugador;
	private ArrayList<Criatura> CPU;
	
	private int puntos;
	private int puntosCPU;
	
	public Baraja() {

		this.puntos = 0;
		this.puntosCPU = 0;
		
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
		
		Scanner scan = new Scanner(System.in);
		repartirMazo();
		
		while(jugador.size() > 0)
		{
			mostrarMano(jugador);
			System.out.println("Seleccione una carta para tirar: ");
			int indice = scan.nextInt() - 1;
			
			Criatura a = extraerCriaturaDelMazo(jugador, indice);
			Criatura b = extraerCriaturaDelMazo(CPU);
			if(comprobarPuntuacion(a, b)){
				System.out.println("Ronda ganada");
				puntos++;
			}
			else{
				System.out.println("Ronda perdida");
				puntosCPU++;
			}
		}
		
		mostrarPuntuacion();
	}

	private void mostrarMano(ArrayList<Criatura> mano) {
		// TODO Auto-generated method stub
		boolean ponerSalto = true;
		
		for(int i = 0; i < mano.size(); i++)
		{
			ponerSalto = true;
			System.out.print((i + 1) + "-" + mano.get(i) + "\t");
			
			if((i+1)%5 == 0){
				System.out.println();
				ponerSalto = false;
			}
		}
		if(ponerSalto)
			System.out.println();
	}

	private Criatura extraerCriaturaDelMazo(ArrayList<Criatura> mano, int indice) {
		// TODO Auto-generated method stub
		Criatura a = null;
		a = mano.get(indice);
		mano.remove(indice);
		return a;
	}
	
	private Criatura extraerCriaturaDelMazo(ArrayList<Criatura> mano) {
		// TODO Auto-generated method stub
		Criatura a = null;
		Random r = new Random();
		int indice = r.nextInt(mano.size());
		a = mano.get(indice);
		mano.remove(indice);
		return a;
	}
	
	private Criatura extraerCriatura() {
		// TODO Auto-generated method stub
		Criatura a = null;
		Random r = new Random();
		int indice = r.nextInt(mazo.size());
		a = mazo.get(indice);
		mazo.remove(indice);
		return a;	
	}
	
	private boolean comprobarPuntuacion(Criatura a, Criatura b) {
		// TODO Auto-generated method stub
		System.out.println("Jugador " + a + "\nVS\nCPU " + b);
		if(a.getAtaque() > b.getDefensa())
			return true;
		else
			return false;
	}
	
	private void mostrarPuntuacion() {
		// TODO Auto-generated method stub
		
		System.out.println("Puntos jugador: " + puntos);
		System.out.println("Puntos CPU: " + puntosCPU);
		
		if(puntos > puntosCPU)
			System.out.println("¡Has ganado! ERES EL PUTO AMO");
		else if(puntos < puntosCPU)
			System.out.println("Has perdido :(");
		else
			System.out.println("¡Empate!");
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
	
	@Override
	public String toString() {
		return "Jugador = " + jugador +
				"\n\nCPU = " + CPU;
	}
	
	
	
}
