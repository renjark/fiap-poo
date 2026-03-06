package br.com.fiapride.model;
public class Aspirador { 
    public String cor;
    public String material;
    public int bateria;
    
    public Aspirador(String cor, String material) {
    	this.cor = cor;
    	this.material = material;
    	this.bateria = 9;
    	
    	}

    public void AspirarCasa (double bateria) {
    	//O aspirador não funciona caso a bateria estiver 10%<
    	if (bateria <= 10) {
    		System.out.println("A bateria está fraca demais para aspirar.");
    		return;
    	}
    	if (bateria >= 10) {
    		System.out.println("Aspirando...");
    		return;
    	}
    	this.bateria += bateria;
    	System.out.println("A bateria do aspirador é de: "+ this.bateria);
    }
    
    public void CarregarBateria(double carregamento) {
    	if (carregamento >= 100) {
    		System.out.println("Carga 100% carregada.");
    		return;
    		
    	}
    	if (this.bateria < carregamento) {
    		System.out.println("Carregando...");
    		return;
    	}
    }
    
}
	

