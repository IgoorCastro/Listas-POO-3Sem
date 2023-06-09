/*
Empregados, que tem o nome da empresa (String), onde está atualmente.
Igor Kaue Nardes de Castro
 */

package exercicio03;

public class Empregado extends Candidato{
	
	private String nomeEmpresaAtual;
	
	public Empregado() {
		
		nomeEmpresaAtual = "Desconhecida";
	}

	public String getNomeEmpresaAtual() {
		return nomeEmpresaAtual;
	}

	public void setNomeEmpresaAtual(String nomeEmpresaAtual) {
		this.nomeEmpresaAtual = nomeEmpresaAtual;
	}
	
	
	@Override
	public String toString() {
		return "Nome: " + getNome() +
				"Idade: " + getIdade() +
				"Empresa atual: " + getNomeEmpresaAtual();
	}
}
