package lista05;

public class Pessoa1 {
	private String nome;
	private int idade;
	private double altura;
	
	public Pessoa1() {
		this.nome = "";
		this.idade = 0;
		this.altura = 0.0;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void fazAniversario(boolean aniversario) {
		idade++;
	}
}


