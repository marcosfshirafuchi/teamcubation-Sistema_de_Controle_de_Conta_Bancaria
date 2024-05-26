import java.util.Scanner;

public class Main {
    /**
     * <h1> Teamcubation - Exercicio_de_Java__Sistema_de_Controle_de_Conta_Bancaria</h1>
     * Exercício de Java: Sistema de Controle de Conta Bancária
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author  Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since   26/05/2024
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem Vindos ao Banco!");
        System.out.print("Digite o nome do titular da conta 1: ");
        String titular1 = scanner.nextLine();
        System.out.print("Digite o numero da conta 1: ");
        String numeroConta1 = scanner.nextLine();
        double saldo1,saldo2,saldo3,saldo4;
        do{
            System.out.print("Digite o valor do saldo da conta 1: ");
            saldo1 = scanner.nextDouble();
            if (saldo1<0){
                System.out.println("Digite um numero positivo!");
            }
        }while (saldo1<0);

        ContaBancaria contaBancaria1 = new ContaBancaria(titular1,numeroConta1,saldo1);
        Banco banco = new Banco();
        banco.adicionarConta(contaBancaria1);
        double depositarConta, depositarConta2, depositarConta3, depositarConta4;
        do{
            System.out.print("Digite o valor para depositar na conta 1: ");
             depositarConta = scanner.nextDouble();
             if (depositarConta<=0){
                 System.out.println("Digite um numero positivo e diferente de zero!");
             }
        }while(depositarConta <=0);

        contaBancaria1.depositar(depositarConta);
        double saqueConta, saqueConta2,saqueConta3,saqueConta4;
        do {
            System.out.print("Digite o valor para saque da conta 1: ");
            saqueConta = scanner.nextDouble();
            if(saqueConta<=0){
                System.out.println("Digite um numero positivo e diferente de zero!");
            }
        }while(saqueConta<=0);
        if (contaBancaria1.sacar(saqueConta) == false){
            System.out.println("Saldo insuficiente para sacar!");
        }else{
            contaBancaria1.sacar(saqueConta);
        }
        scanner.nextLine();
        System.out.print("Digite o nome do titular da conta 2: ");
        String titular2 = scanner.nextLine();
        System.out.print("Digite o numero da conta 2: ");
        String numeroConta2 = scanner.nextLine();
        do{
            System.out.print("Digite o valor do saldo da conta 2: ");
            saldo2 = scanner.nextDouble();
            if (saldo2<0){
                System.out.println("Digite um numero positivo!");
            }
        }while (saldo2<0);
        ContaBancaria contaBancaria2 = new ContaBancaria(titular2,numeroConta2,saldo2);
        banco.adicionarConta(contaBancaria2);
        do{
            System.out.print("Digite o valor para depositar na conta 2: ");
            depositarConta2 = scanner.nextDouble();
            if (depositarConta2<=0){
                System.out.println("Digite um numero positivo e diferente de zero!");
            }
        }while (depositarConta2<=0);

        contaBancaria2.depositar(depositarConta2);
        do {
            System.out.print("Digite o valor para saque da conta 1: ");
            saqueConta2 = scanner.nextDouble();
            if(saqueConta2<=0){
                System.out.println("Digite um numero positivo e diferente de zero!");
            }
        }while(saqueConta2<=0);

        if (contaBancaria2.sacar(saqueConta2) == false){
            System.out.println("Saldo insuficiente para sacar!");
        }else{
            contaBancaria2.sacar(saqueConta2);
        }
        scanner.nextLine();
        System.out.print("Digite o nome do titular da conta 3: ");
        String titular3 = scanner.nextLine();
        System.out.print("Digite o numero da conta 3: ");
        String numeroConta3 = scanner.nextLine();
        do{
            System.out.print("Digite o valor do saldo da conta 3: ");
            saldo3 = scanner.nextDouble();
            if (saldo3<0){
                System.out.println("Digite um numero positivo!");
            }
        }while (saldo3<0);
        ContaBancaria contaBancaria3 = new ContaBancaria(titular3,numeroConta3,saldo3);
        banco.adicionarConta(contaBancaria3);
        do{
            System.out.print("Digite o valor para depositar na conta 3: ");
            depositarConta3 = scanner.nextDouble();
            if (depositarConta3<=0){
                System.out.println("Digite um numero positivo e diferente de zero!");
            }
        }while (depositarConta3<=0);
        contaBancaria3.depositar(depositarConta3);
        do {
            System.out.print("Digite o valor para saque da conta 3: ");
            saqueConta3 = scanner.nextDouble();
            if(saqueConta3<=0){
                System.out.println("Digite um numero positivo e diferente de zero!");
            }
        }while(saqueConta3<=0);
        if (contaBancaria3.sacar(saqueConta3) == false){
            System.out.println("Saldo insuficiente para sacar!");
        }else{
            contaBancaria3.sacar(saqueConta3);
        }
        scanner.nextLine();
        System.out.print("Digite o nome do titular da conta 4: ");
        String titular4 = scanner.nextLine();
        System.out.print("Digite o numero da conta 4: ");
        String numeroConta4 = scanner.nextLine();
        do{
            System.out.print("Digite o valor do saldo da conta 4: ");
            saldo4 = scanner.nextDouble();
            if (saldo4<0){
                System.out.println("Digite um numero positivo!");
            }
        }while (saldo4<0);
        ContaBancaria contaBancaria4 = new ContaBancaria(titular4,numeroConta4,saldo4);
        banco.adicionarConta(contaBancaria4);
        do{
            System.out.print("Digite o valor para depositar na conta 4: ");
            depositarConta4 = scanner.nextDouble();
            if (depositarConta4<=0){
                System.out.println("Digite um numero positivo e diferente de zero!");
            }
        }while (depositarConta4<=0);
        contaBancaria4.depositar(depositarConta4);
        do {
            System.out.print("Digite o valor para saque da conta 4: ");
            saqueConta4 = scanner.nextDouble();
            if(saqueConta4<=0){
                System.out.println("Digite um numero positivo e diferente de zero!");
            }
        }while(saqueConta4<=0);
        if (contaBancaria4.sacar(saqueConta4) == false){
            System.out.println("Saldo insuficiente para sacar!");
        }else{
            contaBancaria4.sacar(saqueConta4);
        }
        double valorTransferencia1,valorTransferencia2,valorTransferencia3,valorTransferencia4;
        do {
            System.out.print("Digite o valor da transferencia da conta 1 para conta 2: ");
            valorTransferencia1 = scanner.nextDouble();
            if (valorTransferencia1<=0){
                System.out.println("Digite um numero positivo e diferente de zero!");
            }
        }while (valorTransferencia1<=0);
        if (contaBancaria1.transferir(valorTransferencia1,contaBancaria2) == false){
            System.out.println("Saldo insuficiente para a transferencia!");
        }else{
            contaBancaria1.transferir(valorTransferencia1,contaBancaria2);
        }
        do {
            System.out.print("Digite o valor da transferencia da conta 2 para conta 3: ");
            valorTransferencia2 = scanner.nextDouble();
            if (valorTransferencia2<=0){
                System.out.println("Digite um numero positivo e diferente de zero!");
            }
        }while (valorTransferencia2<=0);
        if (contaBancaria2.transferir(valorTransferencia2,contaBancaria3) == false){
            System.out.println("Saldo insuficiente para a transferencia!");
        }else{
            contaBancaria2.transferir(valorTransferencia2,contaBancaria3);
        }
        do {
            System.out.print("Digite o valor da transferencia da conta 3 para conta 4: ");
            valorTransferencia3 = scanner.nextDouble();
            if (valorTransferencia3<=0){
                System.out.println("Digite um numero positivo e diferente de zero!");
            }
        }while (valorTransferencia3<=0);
        if (contaBancaria3.transferir(valorTransferencia3,contaBancaria4) == false){
            System.out.println("Saldo insuficiente para a transferencia!");
        }else{
            contaBancaria3.transferir(valorTransferencia3,contaBancaria4);
        }
        do {
            System.out.print("Digite o valor da transferencia da conta 4 para conta 1: ");
            valorTransferencia4 = scanner.nextDouble();
            if (valorTransferencia4<=0){
                System.out.println("Digite um numero positivo e diferente de zero!");
            }
        }while (valorTransferencia4<=0);
        if (contaBancaria4.transferir(valorTransferencia4,contaBancaria1) == false){
            System.out.println("Saldo insuficiente para a transferencia!");
        }else{
            contaBancaria4.transferir(valorTransferencia4,contaBancaria1);
        }
        scanner.nextLine();
        System.out.print("Digite a conta para consulta: ");
        String contaBuscada = scanner.nextLine();
        if (banco.buscarConta(contaBuscada)==null){
            System.out.printf("Conta %s não encontrada!\n",contaBuscada);
        }else{
            System.out.printf("Conta %s encontrada no banco!\n",contaBuscada);
        }
        banco.listarContas();
        scanner.close();
    }
}
