/*
Vagas tem a descrição (String) e o salário oferecido (double)
Igor Kaue Nardes de Castro
 */

package exercicio03;

public class Vaga {
	
	private String descricao;
	private double salario;
	
	public Vaga() {
		
		descricao = "Sem descrição";
		salario = 0;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
