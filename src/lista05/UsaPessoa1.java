package lista05;

public class UsaPessoa1 {

	public static void main(String[] args) {
		
		Pessoa1 pessoa = new Pessoa1();
		
		pessoa.setNome("Kamargo da Silva");
		pessoa.setIdade(21);
		pessoa.setAltura(1.37);
		
		System.out.print("Nome: " + pessoa.getNome() + "\nIdade: " + pessoa.getIdade() + "\nAltura: " + pessoa.getAltura() + "\n --Parabéns!!!\nIdade atualizada:  ");
		pessoa.fazAniversario(true);
		System.out.println(pessoa.getIdade());

	}
}
