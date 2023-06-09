/*
Candidatos com seu nome (String) e idade (int).
Igor Kaue Nardes de Castro
 */

package exercicio03;

public class Candidato {

	private String nome;
	private int idade;
	
	public Candidato() {	
		
		nome = "Sem nome";
		idade = 0;
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
	
	
	@Override
	public String toString() {
		return "Nome: " + nome +
				"Idade: " + idade;
	}
}
