package model;

public class Corrida {
	
	private int percurso;
	private int posicao = 0;

	public Corrida(int percurso) {
		super();
		this.percurso = percurso;
	}
	
	public int getPosicao() {
		return this.posicao;
	}
	
	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}
	
	public int getPercurso() {
		return this.percurso;
	}
}
