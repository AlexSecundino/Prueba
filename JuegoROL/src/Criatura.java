import java.util.Arrays;
import java.util.Random;


public class Criatura {

	private int ataque;
	private int defensa;
	private int costeInvocacion;
	
	public Criatura() {
		this.ataque = randomAtaqueDefensa();
		this.defensa = randomAtaqueDefensa();
		this.costeInvocacion = randomCosteInvocacion();
	}

	private int randomAtaqueDefensa()
	{
		AtaqueDefensa[] values = AtaqueDefensa.values();
		Random a = new Random();
		int indice = a.nextInt(values.length);
		int valor = values[indice].getAtaqueDefensa();
		return valor;
	}

	private int randomCosteInvocacion()
	{
		Random r = new Random();
		int a = r.nextInt(3) + 1;
		return a;
	}
	
	
	@Override
	public String toString() {
		return "[ataque=" + ataque + ", defensa=" + defensa
				+ ", costeInvocacion=" + costeInvocacion + "]";
	}
	
}
