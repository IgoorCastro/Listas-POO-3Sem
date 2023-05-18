package lista04;


import java.util.Scanner;

public class MainModelo7 {
	
	static Scanner scan;
    
    public static void main(String[] args) {
        
        String[] placaMae = {   "{1} - Gigabyte e2543\nValor: R$ 800,00"};
        
        String[] processador = {"{1} - Intel i3-9756\nValor: R$ 697,40",
                                "{2} - Intel i5-9326\nValor: R$ 789,30",
                                "{3} - Intel i7-9654\nValor: R$ 1453,99"};
        
        String[] memoriaRAM = { "{1} - 4Gb 1900Mhz\nValor: R$ 127,40",
                                "{2} - 8Gb 1900Mhz\nValor: R$ 225,30",
                                "{3} - 16Gb 1900Mhz\nValor: R$ 297,99"};
        
        String[] memoriaHD = {  "{1} - 1Tb HD\nValor: R$ 177,40",
                                "{2} - 1Tb SSD Sata\nValor: R$ 721,32",
                                "{3} - 520Gb HD\nValor: R$ 149,99",
                                "{4} - 520Gb SSD Sata\nValor: R$ 455,70",
                                "{5} - 120Gb HD\nValor: R$ 95,90",
                                "{6} - 120Gb SSD Sata\nValor: R$ 127,99"};
        
        String[] fonte = {      "{1} - 750W 80 Plus\nValor: R$ 659,99",
                                "{2} - 550W 80 Plus\nValor: R$ 499,98",
                                "{3} - 450W 80 Plus\nValor: R$ 320,99"};
        
        String[] gabinete = {   "{1} - Dog White\nValor: R$ 147,40",
                                "{2} - Dog Black\nValor: R$ 234,30",
                                "{3} - Dog Golden\nValor: R$ 321,99"};
        
        ModeloDeComputador7 modelo1 = new ModeloDeComputador7();
        scan = new Scanner(System.in);
        int op = 0;
        byte cont = 0;
        boolean motor = false;
        
        do{
            System.out.println("- Monte seu computador - \n\t-opções:");
            
            //placa mae
            System.out.println("\nPlaca mãe:");
            op = getOpcao(placaMae);   
            
            switch(op) {
            	case 1:
            		modelo1.setNomePlacaMae("Gigabyte e2543");
            		modelo1.setValorPlacaMae(800.00);
            		break;
            }
            
            //processador            
            System.out.println("\nProcessador:");
            op = getOpcao(processador);
            switch(op) {
            	case 1:
            		modelo1.setNomeProcessador("Intel i3-9756");
            		modelo1.setValorProcessador(697.40);
            		break;
            	case 2:
            		modelo1.setNomeProcessador("Intel i5-9326");
            		modelo1.setValorProcessador(789.30);
            		break;
            	case 3:
            		modelo1.setNomeProcessador("Intel i7-9654");
            		modelo1.setValorProcessador(789.30);
            		break;
            }
            
            //Memoria RAM
            System.out.println("\nMemoria RAM:");
            cont = 0;            
            String[] opMemoriaRAM = new String[5];//Nomes
            double[] valMemoriaRAM = new double[5];//Valores R$
            
            do {
            	op = getOpcao(memoriaRAM);
	            switch(op) {
	            	case 1:
	            		opMemoriaRAM[cont] = "4Gb 1900Mhz";
	            		valMemoriaRAM[cont] = 127.40;
	            		break;
	            	case 2:
	            		opMemoriaRAM[cont] = "8Gb 1900Mhz";
	            		valMemoriaRAM[cont] = 225.30;
	            		break;
	            	case 3:
	            		opMemoriaRAM[cont] = "16Gb 1900Mhz";
	            		valMemoriaRAM[cont] = 297.99;
	            		break;
            		default: 
            			System.out.println("Valor invalido");
	            }
	            
	            op = 0;
	            System.out.print("{1} para escolher outra opção / {0} para proximo: ");
	            op = scan.nextInt();
	            motor = (op == 0) ? true : false;
	            cont++;
	            //System.out.println("Cont: " + cont);
            }while(cont < 5 && !motor);//maximo de 5 escolhas
            
            modelo1.setNomeMemoriaRAM(opMemoriaRAM);//set nomes
            modelo1.setValorMemoriaRAM(valMemoriaRAM);//set valores
           
            //Memoria HD
            System.out.println("\nMemoria HD:");
            cont = 0;           
            String[] opMemoriaHD = new String[5];//Nomes
            double[] valMemoriaHD = new double[5];//Valores R$
            
            do {
            	op = getOpcao(memoriaHD);
	            switch(op) {
	            	case 1:
	            		opMemoriaHD[cont] = "1Tb HD";
	            		valMemoriaHD[cont] = 177.40;
	            		break;
	            	case 2:
	            		opMemoriaHD[cont] = "1Tb SSD Sata";
	            		valMemoriaHD[cont] = 721.32;
	            		break;
	            	case 3:
	            		opMemoriaHD[cont] = "520Gb HD";
	            		valMemoriaHD[cont] = 149.99;
	            		break;
	            	case 4:
	            		opMemoriaHD[cont] = "520Gb SSD Sata";
	            		valMemoriaHD[cont] = 455.70;
	            		break;
	            	case 5:
	            		opMemoriaHD[cont] = "120Gb HD";
	            		valMemoriaHD[cont] = 95.90;
	            		break;
	            	case 6:
	            		opMemoriaHD[cont] = "120Gb SSD Sata";
	            		valMemoriaHD[cont] = 127.99;
	            		break;
            		default: 
            			System.out.println("Valor invalido");
	            }
	            
	            op = 0;
	            System.out.print("{1} para escolher outra opção / {0} para proximo: ");
	            op = scan.nextInt();
	            motor = (op == 0) ? true : false;
	            cont++;
            }while(cont < 5 && !motor);//maximo de 5 escolhas
            
            modelo1.setNomeMemoriaHD(opMemoriaHD);//set nomes
            modelo1.setValorMemoriaHD(valMemoriaHD);//set valores
            
            //Fonte
            System.out.println("\nFonte:");
            op = getOpcao(fonte);
            
            switch(op) {
            	case 1:
            		modelo1.setNomeFonte("750W 80 Plus");
            		modelo1.setValorFonte(659.99);
            		break;
            	case 2:
            		modelo1.setNomeFonte("550W 80 Plus");
            		modelo1.setValorFonte(499.98);
            		break;
            	case 3:
            		modelo1.setNomeFonte("450W 80 Plus");
            		modelo1.setValorFonte(320.99);
            		break;
            }
            
            //Gabinete
            System.out.println("\nGabinete:");
            op = getOpcao(gabinete);
            
            switch(op) {
            	case 1:
            		modelo1.setNomeGabinete("Dog White");
            		modelo1.setValorGabinete(147.40);
            		break;
            	case 2:
            		modelo1.setNomeGabinete("Dog Black");
            		modelo1.setValorGabinete(234.30);
            		break;
            	case 3:
            		modelo1.setNomeGabinete("Dog Golden");
            		modelo1.setValorGabinete(321.99);
            		break;
            }
            
            System.out.println("\nResumo da compra\n");
            System.out.println(modelo1.toString());
            
            System.out.println("\n-Total: \t" + modelo1.calcularPreco());
            
            scan.next();
        }while(motor);   
    }
    
    static byte getOpcao(String[] lista) {
    	scan = new Scanner(System.in);
    	byte op;
    	do {            	
        	escreveMtz(lista);
            System.out.print(" Digite sua opção: ");
            op = scan.nextByte();
            System.err.println((op < 1 || op > lista.length) ? "Valor invalido!" : "");
        }while(op < 1 || op > lista.length);
    	return op;
    }
    
    static void escreveMtz(String[] mtz){
        for(int i = 0; i < mtz.length; i++)
            System.out.println(mtz[i]);        
    }
}