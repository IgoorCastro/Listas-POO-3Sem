package lista05;

public class UsaCalculadora2 {

	public static void main(String[] args) {
		Calculadora2 calc = new Calculadora2();

		calc.setNumero1(15);
		calc.setNumero2(5);
		
		System.out.println(	calc.getNumero1() + " + " + calc.getNumero2() + ": " + calc.somar() + "\n" +
							calc.getNumero1() + " - " + calc.getNumero2() + ": " + calc.subtrair() + "\n" +
							calc.getNumero1() + " * " + calc.getNumero2() + ": " + calc.multiplicar() + "\n" +
							calc.getNumero1() + " / " + calc.getNumero2() + ": " + calc.dividir());
	}

}
