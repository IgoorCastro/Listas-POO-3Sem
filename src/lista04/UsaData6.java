package lista04;

public class UsaData6 {

	public static void main(String[] args) {
		Data6 data1 = new Data6((byte) 1,(byte) 1, 2022);
		Data6 data2 = new Data6((byte) 1,(byte) 1, 2022);
		Data6 data3 = new Data6((byte) 5,(byte) 2, 2023);
		
		
		//Comparando data1 e data2
		System.out.println("Datas: " + data1.toString() + " - " + data2.toString());		
		if(compareData(data1, data2) == 2)//2 = datas iguais
			System.out.println( "Datas iguais!" );
		else {
			System.out.println( (compareData(data1, data2) == 0) ? "Maior data: " + data1.toString() : "Maior data: " +  data2.toString() );
			diferencaDatas(data1, data2);
		}
		
		//compara data1 e data3
		System.out.println("\nDatas: " + data1.toString() + " - " + data3.toString());	
		if(compareData(data1, data3) == 2)//2 = datas iguais
			System.out.println( "Datas iguais!" );
		else {
			System.out.println( (compareData(data1, data3) == 0) ? "Maior data: " + data1.toString() + "\nMenor data: " + data3.toString() : "Maior data: " +  data3.toString() + "\nMenor data: " + data1.toString() );
			diferencaDatas(data1, data3);
		}
		
		System.out.println("\n-Fim");
	}
	
	static void diferencaDatas(Data6 data1, Data6 data2) {
		int dia = 0;
		
		if (data1.getAno() > data2.getAno()) 			//testa o ano;
	        dia += (data1.getAno() - data2.getAno()) * 360;
	     else if (data1.getAno() < data2.getAno()) 
	    	dia += (data2.getAno() - data1.getAno()) * 360; 
		
		if (data1.getMes() > data2.getMes()) 			//testa o mes
	        dia += (data1.getMes() - data2.getMes()) * 30;
	     else if (data1.getMes() < data2.getMes()) 
	    	dia += (data2.getMes() - data1.getMes()) * 30;
	     
		if (data1.getDia() > data2.getDia()) 			//testa o dia
	        dia += data1.getDia() - data2.getDia();
	     else if (data1.getDia() < data2.getDia()) 
	        dia += data2.getDia() - data1.getDia();
	    
		System.out.println("Difernça em Dia(s): " + dia);
	}
	
	static byte compareData(Data6 data1, Data6 data2) {
		// 0: data1 maior, 1: data2 maior, 2: datas iguais
	    if (data1.getAno() > data2.getAno()) {			//testa o ano
	        return 0;
	    } else if (data1.getAno() < data2.getAno()) {
	        return 1;
	    } else if (data1.getMes() > data2.getMes()) {	//testa o mes
	        return 0;
	    } else if (data1.getMes() < data2.getMes()) {
	        return 1;
	    } else if (data1.getDia() > data2.getDia()) {	//testa o dia
	        return 0;
	    } else if (data1.getDia() < data2.getDia()) {
	        return 1;
	    } else {
	        return 2;	//datas iguais
	    }
	}

}
