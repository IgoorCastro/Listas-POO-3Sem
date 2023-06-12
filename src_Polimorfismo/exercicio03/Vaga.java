/*
Vagas tem a descrição (String) e o salário oferecido (double)
Igor Kaue Nardes de Castro
 */

package exercicio03;

public class Vaga {
	
	private String descricao;
	private double salario;
	private Candidato[] candidatos;
	private int contCadidato;
	
	public Vaga() {
		
		descricao = "Sem descrição";
		salario = 0;
		contCadidato = 0;
		candidatos = new Candidato[100];//100 candidatos por vaga
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

	public Candidato[] getCandidatos() {
		return candidatos;
	}

	public void setCandidatos(Candidato[] candidatos) {
		this.candidatos = candidatos;
	}
	
	public String getCandidatosCadastrados() {
		String ret = "";
		if(candidatos.length != 0) {
			for(int i = 0; i < candidatos.length; i++) {
				if(candidatos[i] != null)
					ret += candidatos[i].getNome() + "\n";
			}
		}else
			return "Não há candidatos cadastrados nessa vaga.";
		
		return ret;			
	}
	
	public void addCandidatos(Candidato candidato) {
		
		if(candidato != null) {
			candidatos[contCadidato] = candidato;
			candidato.setConcorrendo(true);
			System.out.println("Candidato adicionado com sucesso!");
			
			//LOG
			System.out.println("-------------------------");
			System.out.println("Candidatos cadastrados na vaga");			
			for(int i = 0; i <= contCadidato; i++) {
				System.out.println("Nome: " + candidatos[i].getNome());
			}
			
			contCadidato++;
		}
		else
			System.out.println("Candidato não adicionado!");
	}
}
