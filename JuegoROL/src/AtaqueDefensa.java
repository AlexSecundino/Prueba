
public enum AtaqueDefensa {
	
	cien(100), doscientos(200), doscientoscincuenta(250), quinientos(500), ochocientos(750), mil(1000);
	
	private int ataqueDefensa;
	
	AtaqueDefensa(int ataqueDefensa)
	{
		this.ataqueDefensa = ataqueDefensa;
	}

	public int getAtaqueDefensa() {
		return ataqueDefensa;
	}
}
