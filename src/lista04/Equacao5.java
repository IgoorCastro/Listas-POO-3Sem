/*
5) Criar uma classe para resolver a equação do segundo grau, sendo necessário passar os valores de a, b e
c. Criar um método interno para o cálculo do delta e um público para mostrar o valor das raízes, ou da raiz
ou ainda informar que não existem raízes reais. Lembre-se de validar para ver é uma equação do segundo
grau.
Igor Kaue Nardes de Castro
 */

package lista04;

public class Equacao5 {
	private double[] valores;
	
	public Equacao5() {
		valores = new double[3];//[0]: a - [1]: b - [2]: c
	}
	
	public double[] getValores() {
		return valores;
	}

	public void setValores(double[] valores) {
		if(valores != null)
			this.valores = valores;
	}

	public double[] primeiroGrau() {
		//equação
		System.out.println("\n\nEquação: " + valores[0] + "x² + " + valores[1] + "x + " + valores[2] + " = 0\n");
		
		//delta
		double delta = Math.pow(valores[1], 2) - (4 * valores[0] * valores[2]);		
		
		//raizes
		double[] raizes = new double[2];
		
		if(delta < 0)
        	return null;
		
		raizes[0] = (-1 * valores[1] + Math.sqrt(delta)) / (2 * valores[0]);
		raizes[1] = (-1 * valores[1] - Math.sqrt(delta)) / (2 * valores[0]);
		
		return raizes;
	}
}
