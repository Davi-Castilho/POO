package negócio;

public class Fabricante {
  // Propriedades da classe
	private String nome = "";
	// métodos construtores da classe

public Fabricante() {
	super();
}
	public Fabricante(String nome) {
		super();
		this.nome = nome;
	}
	// métodos de acesso da classe
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
