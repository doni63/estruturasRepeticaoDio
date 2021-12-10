package fatorial;

public class Numero {
	private int fatorial;
	private int multiplicacao = 1;

	public int getFatorial() {
		return fatorial;
	}

	public void setFatorial(int fatorial) {
		this.fatorial = fatorial;
	}

	public void calculaFatorial() {
		int aux;
		if (fatorial == 0 || fatorial == 1)
			fatorial = 1;
		else {
			for (int i = fatorial; i >= 1; i--)
				multiplicacao *= i;	
		}
		fatorial = multiplicacao;
	}

}
