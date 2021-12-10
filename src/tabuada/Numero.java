package tabuada;

public class Numero {
	private int tabuada;

	public int getTabuada() {
		return tabuada;
	}

	public void setTabuada(int tabuada) {
		this.tabuada = tabuada;
	}
	
	public void calculaTabuada() {
		for(int i=0;i<10;i++) {
			System.out.println(tabuada + " X " + (i+1) + " = " + (tabuada * (i+1)));
		}
	}
}
