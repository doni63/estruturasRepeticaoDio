package parImpar;

public class Numero {
	private int numeroPar;
	private int numeroImpar;
	
	public int getNumeroPar() {
		return numeroPar;
	}
	
	public void setNumeroPar(int numeroPar) {
		this.numeroPar = numeroPar;
	}

	public int getNumeroImpar() {
		return numeroImpar;
	}

	public void setNumeroImpar(int numeroImpar) {
		this.numeroImpar = numeroImpar;
	}
	
	public String exibir() {
		return "Quantidade de n�meros pares: " + numeroPar + 
			"\nQuantidade de n�meros �mpares: " + numeroImpar;
	}

}
