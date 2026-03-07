package br.com.fiapride.model;
public class Aspirador { 
    private String cor;
    private String material;
    private int bateria;
    
    public Aspirador(String cor, String material) {
    	this.cor = cor;
    	this.material = material;
    	this.bateria = 9;
    	
    	}

    private Aspirador() {
		// TODO Auto-generated constructor stub
	}

	private void AspirarCasa (double bateria) {
    	//O aspirador não funciona caso a bateria esteja 10% ou menor
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
    
    private void CarregarBateria(double carregamento) {
    	if (carregamento >= 100) {
    		System.out.println("Carga 100% carregada.");
    		return;
    		
    	}
    	if (this.bateria < carregamento) {
    		System.out.println("Carregando...");
    		return;
    	}
    }

	private void AspirarCasa() {
		// TODO Auto-generated method stub
		
	}
	
    public double getBateria() {
        return this.bateria; 
    }

    // Método para DEFINIR o saldo (Escrita com Regra de Negócio!)
    private void setBateria(double porcentagem) {
        if (porcentagem >= 0) {
            this.bateria = porcentagem;
        } else {
            System.out.println("Tentativa de definir bateria negativa bloqueada!");
        }
    }

    public String getCor() {
        return this.cor;
    }
}
	

