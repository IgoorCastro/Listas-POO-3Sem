/*
7) Escrever uma classe ModeloDeComputador que encapsule valores que definam a configuração de um
microcomputador (tipo de processador, memória RAM, tamanho do disco rígido, tamanho do monitor, por
exemplo). Essa classe deve ter um método calcularPreco que calculará o preço do computador como sendo
a soma do custo de seus componentes:
Igor Kaue Nardes de Castro
 */
package lista04;

import java.util.Arrays;

public class ModeloDeComputador7 {

    private String nomePlacaMae;
    private double valorPlacaMae;
    
    private String nomeProcessador;
    private double valorProcessador;
    
    private String[] nomeMemoriaRAM;
    private double[] valorMemoriaRAM;
    
    private String[] nomeMemoriaHD;
    private double[] valorMemoriaHD;
    
    private String nomeFonte;
    private double valorFonte;
    
    private String nomeGabinete;
    private double valorGabinete;
    
    private double valor;
    
    public ModeloDeComputador7(){
        this.nomePlacaMae = "no info";
        this.valorPlacaMae = 0;
        
        this.nomeProcessador = "no info";
        this.valorProcessador = 0;
        
        this.nomeMemoriaRAM = null;
        this.valorMemoriaRAM = null;
        
        this.nomeMemoriaHD = null;
        this.valorMemoriaHD = null;
        
        this.nomeFonte = "no info";
        this.valorFonte = 0;
        
        this.nomeGabinete = "no info";
        this.valorGabinete = 0;
        
        valor = 0;
    }

    public String getNomePlacaMae() {
        return nomePlacaMae;
    }

    public void setNomePlacaMae(String nomePlacaMae) {
        this.nomePlacaMae = nomePlacaMae;
    }

    public double getValorPlacaMae() {
        return valorPlacaMae;
    }

    public void setValorPlacaMae(double valorPlacaMae) {
        this.valorPlacaMae = valorPlacaMae;
    }

    public String getNomeProcessador() {
        return nomeProcessador;
    }

    public void setNomeProcessador(String nomeProcessador) {
        this.nomeProcessador = nomeProcessador;
    }

    public double getValorProcessador() {
        return valorProcessador;
    }

    public void setValorProcessador(double valorProcessador) {
        this.valorProcessador = valorProcessador;
    }

    public String[] getNomeMemoriaRAM() {
        return nomeMemoriaRAM;
    }

    public void setNomeMemoriaRAM(String[] nomeMemoriaRAM) {
        this.nomeMemoriaRAM = nomeMemoriaRAM;
    }

    public double[] getValorMemoriaRAM() {
        return valorMemoriaRAM;
    }

    public void setValorMemoriaRAM(double[] valorMemoriaRAM) {
        this.valorMemoriaRAM = valorMemoriaRAM;
    }

    public String[] getNomeMemoriaHD() {
        return nomeMemoriaHD;
    }

    public void setNomeMemoriaHD(String[] nomeMemoriaHD) {
        this.nomeMemoriaHD = nomeMemoriaHD;
    }

    public double[] getValorMemoriaHD() {
        return valorMemoriaHD;
    }

    public void setValorMemoriaHD(double[] valorMemoriaHD) {
        this.valorMemoriaHD = valorMemoriaHD;
    }

    public String getNomeFonte() {
        return nomeFonte;
    }

    public void setNomeFonte(String nomeFonte) {
        this.nomeFonte = nomeFonte;
    }

    public double getValorFonte() {
        return valorFonte;
    }

    public void setValorFonte(double valorFonte) {
        this.valorFonte = valorFonte;
    }

    public String getNomeGabinete() {
        return nomeGabinete;
    }

    public void setNomeGabinete(String nomeGabinete) {
        this.nomeGabinete = nomeGabinete;
    }

    public double getValorGabinete() {
        return valorGabinete;
    }

    public void setValorGabinete(double valorGabinete) {
        this.valorGabinete = valorGabinete;
    }
    
    @Override
    public String toString(){
        return "-Placa mãe: " + 
        		"\nModelo: \t"+ nomePlacaMae +
        		"\nValor: \t\t" + valorPlacaMae + 
        		
        		"\n\nProcessador: " +
        		"\nModelo: \t" + nomeProcessador +
        		"\nValor: \t\t"+ valorProcessador + 
        		
        		"\n\nMemoria RAM: " + 
        		"\nModelo(s): \t" + lerVetor(nomeMemoriaRAM) + 
        		"\nValor(es): \t" + lerVetor(valorMemoriaRAM) +
        		
        		"\n\nMemoria HD: " +
        		"\nModelo(s): \t" + lerVetor(nomeMemoriaHD) + 
        		"\nValor(es): \t" + lerVetor(valorMemoriaHD) +
        		
        		"\n\nFonte: " + 
        		"\nModelo: \t" + nomeFonte +
        		"\nValor: \t\t" + valorFonte +
        		
        		"\n\nGabinete: " + 
        		"\nModelo: \t" + nomeGabinete +
        		"\nValor: \t\t" + valorGabinete;
    }
    
    public double calcularPreco() {    	 
    	for(int i = 0; i < valorMemoriaRAM.length; i++) {
    		valor += valorMemoriaRAM[i];
    		valor += valorMemoriaHD[i];
    	}    	
    	
    	return valor + valorPlacaMae + valorProcessador + valorFonte + valorGabinete;
    }
    
    private String lerVetor(double[] vet) {
    	String toString = "";
    	for(int i = 0; i < vet.length; i++) {
    		if(i != 0 && vet[i] != 0)
    			toString += " + ";
    		if(vet[i] != 0) 
    			toString += vet[i];
    		else
    			break;
    	}
    	return toString;
    }
    
    private String lerVetor(String[] vet) {
    	String toString = "";
    	for(int i = 0; i < vet.length; i++) {
    		if(i != 0 && vet[i] != null)
    			toString += " + ";
    		if(vet[i] != null) 
    			toString += vet[i];
    		else
    			break;
    	}
    	return toString;
    }
    
}