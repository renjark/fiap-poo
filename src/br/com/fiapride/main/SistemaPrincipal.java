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

//===AULA 03===

package br.com.fiapride.main;

import br.com.fiapride.model.Passageiro;

public class SistemaPrincipal {

    public static void main(String[] args) {
        
        System.out.println("--- Iniciando o Sistema FiapRide --- \n");
        
        Passageiro passageiro1 = new Passageiro("Ana Silva", "222.222.222-22");
        System.out.println(">>> Recarga Passageiro 1:");
        passageiro1.adicionarSaldo(50.0);

        Passageiro passageiro2 = new Passageiro("Carlos Souza", "333.333.333-33");
        System.out.println(">>> Recarga Passageiro 2:");
        passageiro2.adicionarSaldo(12.5);

        System.out.println("\n--- Status dos Passageiros ---");
        System.out.println("Passageiro: " + passageiro1.getNome() + " | Saldo: R$ " + passageiro1.getSaldo() + " | CPF: " + passageiro1.getCpf());
        System.out.println("Passageiro: " + passageiro2.getNome() + " | Saldo: R$ " + passageiro2.getSaldo() + " | CPF: " + passageiro2.getCpf());
        
        System.out.println("\n--- Realizando Viagens ---");
        System.out.println("Pagando viagem do passageiro 1 (Ana)...");
        passageiro1.pagarViagem(20.0);
        
        System.out.println("\nPagando viagem do passageiro 2 (Carlos)...");
        passageiro2.pagarViagem(20.0); 
        

    }
}
