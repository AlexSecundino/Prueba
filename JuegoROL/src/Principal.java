import java.util.Arrays;
import java.util.Random;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Crear juego. Cartas tienen ataque/defensa/PuntosInvocacion*/
		/*Acaba cuando matas a todas las criaturas del oponente*/
		/*Cada ronda te dan 2 puntos que servir�n para invocar carta*/
		/*Cada criatura matada te da un punto, quien mas puntos tenga, gana*/
	
		Baraja nueva = new Baraja();
		nueva.turno();
		System.out.println(nueva);
	}

}
