//===AULA 01===
//package br.com.fiapride.main;
//
//// Importamos a classe Passageiro para que o sistema a reconheça
//import br.com.fiapride.model.Passageiro;
//
//public class SistemaPrincipal {
//
//    public static void main(String[] args) {
//        // INSTANCIAÇÃO
//        // O comando 'new' aloca memória para um novo objeto.
//        // Criando o primeiro passageiro (Objeto 1)
//        Passageiro passageiro1 = new Passageiro();
//        passageiro1.nome = "Ana Silva";
//        passageiro1.saldo = 50.0;
//
//        // Criando o segundo passageiro (Objeto 2)
//        Passageiro passageiro2 = new Passageiro();
//        passageiro2.nome = "Carlos Souza";
//        passageiro2.saldo = 12.50;
//
//        // Exibindo os dados no Console
//        System.out.println("--- Sistema FiapRide ---");
//        System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$" + passageiro1.saldo);
//        System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$" + passageiro2.saldo);
//
//        // Teste mental: Se eu mudar o nome do passageiro1, o passageiro2 muda?
//    }
//}

////===AULA 02===
//package br.com.fiapride.main;
//
//// Importamos a classe Passageiro para que o sistema a reconheça
//import br.com.fiapride.model.Passageiro;
//
//public class SistemaPrincipal {
//
//    public static void main(String[] args) {
//        // INSTANCIAÇÃO
//        // O comando 'new' aloca memória para um novo objeto.
//        // Criando o primeiro passageiro (Objeto 1)
//        Passageiro passageiro1 = new Passageiro("Ana Silva", "222");
//        System.out.println("Regarga passageiro 1");
//        passageiro1.adicionarSaldo(50.0);
//
//        // Criando o segundo passageiro (Objeto 2)
//        Passageiro passageiro2 = new Passageiro("Carlos Souza", "333");
//        System.out.println("Regarga passageiro 2");
//        passageiro2.adicionarSaldo(12.5);
//
//        System.out.println("--- Sistema FiapRide ---");
//        System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$ " + passageiro1.saldo + " | CPF: " + passageiro1.cpf);
//        System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$ " + passageiro2.saldo + " | CPF: " + passageiro2.cpf);
//        
//        System.out.println("Pagando viagem do passageiro 1");
//        passageiro1.pagarViagem(20);
//        System.out.println("Pagando viagem do passageiro 2");
//        passageiro2.pagarViagem(20);
//
//    }
//}

// ===ATIVIDADE AULA 01===
//package br.com.fiapride.main;
//import br.com.fiapride.model.Aspirador;
//
//public class SistemaPrincipal {
//  public static void main(String[] args) {
//
//	Aspirador meuAspirador = new Aspirador(null, null);
//	meuAspirador.cor = "Branco";
//	meuAspirador.material = "Plástico";
//	
//	Aspirador aspiradordoProfessor = new Aspirador(null, null);
//	aspiradordoProfessor.cor = "Metálica";
//	aspiradordoProfessor.material = "Alumínio";
//	System.out.println("Meu aspirador é: " + meuAspirador.cor);
//	System.out.println("O do professor é: " + aspiradordoProfessor.cor);
//	
//  }
//  
//}

//===ATIVIDADE AULA 02===
package br.com.fiapride.main;
import br.com.fiapride.model.Aspirador;

public class SistemaPrincipal {
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
  
}

