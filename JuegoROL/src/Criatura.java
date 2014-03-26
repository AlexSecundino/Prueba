import java.util.Arrays;
import java.util.Random;


public class Criatura implements Comparable{

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

	public int getAtaque() {
		return ataque;
	}

	public int getDefensa() {
		return defensa;
	}
	
	@Override
	public int compareTo(Object o){
		// TODO Auto-generated method stub
		Criatura c = (Criatura) o;
		
		if(this.costeInvocacion > c.costeInvocacion)
			return 1;
		else if(this.costeInvocacion < c.costeInvocacion)
			return -1;
		else
			if(this.ataque > c.ataque)
				return 1;
			else if(this.ataque < c.ataque)
				return -1;
			else
				if(this.defensa > c.defensa)
					return 1;
				else if(this.defensa < c.defensa)
					return -1;
				else
					return 0;
	}
	
	@Override
	public String toString() {
		return "ataque=" + ataque + ", defensa=" + defensa
				+ ", costeInvocacion=" + costeInvocacion;
	}

}
