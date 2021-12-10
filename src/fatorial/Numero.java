package fatorial;

public class Numero {
	private int fatorial;
	private int aux=1;

	public int getFatorial() {
		return fatorial;
	}

	public void setFatorial(int fatorial) {
		this.fatorial = fatorial;
	}

	public void calculaFatorial() {
		if (fatorial == 0 || fatorial == 1)
			fatorial = 1;
		else {
			for (int i = fatorial; i > 0; i--) {
				aux = aux * fatorial;
				fatorial = fatorial - 1;
			}
		}
		fatorial = aux;
	}

}
