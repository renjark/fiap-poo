package br.com.fiapride.main;
import br.com.fiapride.model.Aspirador; 

////===ATIVIDADE AULA 01===
public class TesteAspirador {
public static void main(String[] args) {

	Aspirador meuAspirador = new Aspirador(null, null);
	meuAspirador.cor = "Branco";
	meuAspirador.material = "Plástico";
	
	Aspirador aspiradordoProfessor = new Aspirador(null, null);
	aspiradordoProfessor.cor = "Metálica";
	aspiradordoProfessor.material = "Alumínio";
	System.out.println("Meu aspirador é: " + meuAspirador.cor);
	System.out.println("O do professor é: " + aspiradordoProfessor.cor);
	
	}

}

//===ATIVIDADE AULA 02===
public class TesteAspirador {
public static void main(String[] args) {

	Aspirador meuAspirador = new Aspirador("Branco", "Plástico");
	System.out.println("Meu Aspirador");
	
	meuAspirador.AspirarCasa(60);
	
System.out.println("=======================");

	Aspirador aspiradordoProfessor = new Aspirador ("Metálica", "Alumínio");
	System.out.println("Aspirador do professor");
	
	aspiradordoProfessor.AspirarCasa(9);
	
System.out.println("=======================");
	
System.out.println("--- Aspiradores ---");
System.out.println("Meu aspirador: " + meuAspirador.cor + " | Material: " + meuAspirador.material + " | Bateria: " + meuAspirador.bateria);
System.out.println("Aspirador do professor: " + aspiradordoProfessor.cor + " | Material: " + aspiradordoProfessor.material + " | Bateria: " + aspiradordoProfessor.bateria);
}

public static void main(String[] args) {
    
    System.out.println("--- Teste do Meu Projeto Pessoal ---");
    
    Aspirador meuAspirador = new Aspirador();
    
	meuAspirador.cor = "Branco";
	meuAspirador.material = "Plástico";

    meuAspirador.AspirarCasa();
    
    System.out.println("Cor do aspirador: " + meuAspirador.cor);
    System.out.println("Material: " + meuAspirador.material);
	}
    
//===ATIVIDADE AULA 03===


}


