# <a href="https://ibb.co/3rNCHC2"><img src="https://i.ibb.co/K0qrHrd/1711738799650.jpg" alt="1711738799650" border="0" height="70" width="180"></a> Sistema de Controle de Conta Bancária


#### Desenvolvido na linguagem Java por:
- [Marcos Shirafuchi](https://github.com/marcosfshirafuchi)

# Exercício - Sistema de Controle de Conta Bancária

## Exercício de Java: Sistema de Controle de Conta Bancária
Objetivo: Este exercício visa praticar a criação e o uso de classes e métodos em Java. Os alunos irão desenvolver um sistema simples de controle de contas bancárias, onde será possível gerenciar contas, realizar depósitos, saques e transferências entre contas.<br>

Descrição do Exercício:<br>
1.	Classe ContaBancaria:<br>
 * Atributos:<br>
   * String titular<br>
   * String numeroConta<br>
   * double saldo<br>
 * Métodos:<br>
   * ContaBancaria(String titular, String numeroConta, double saldoInicial) - Construtor para inicializar os atributos.<br>
   * void depositar(double valor) - Método para depositar um valor na conta.<br>
   * boolean sacar(double valor) - Método para sacar um valor da conta. Retorna true se a operação for bem-sucedida e false se não houver saldo suficiente.<br>
   * boolean transferir(double valor, ContaBancaria destino) - Método para transferir um valor para outra conta. Retorna true se a operação for bem-sucedida e false se não houver saldo suficiente.<br><br>
2.	Classe Banco:<br>
 *	Atributos:<br>
    * List<ContaBancaria> contas<br>
 * Métodos:<br>
    * void adicionarConta(ContaBancaria conta) - Método para adicionar uma nova conta à lista de contas.<br>
    * ContaBancaria buscarConta(String numeroConta) - Método para buscar uma conta pelo número da conta. Retorna a conta encontrada ou null se não existir.<br>
    * void listarContas() - Método para listar todas as contas do banco com suas informações.<br><br>
3.	Classe Principal (Main):<br>
  * Métodos:<br>
    * public static void main(String[] args) - Método principal onde será instanciado o objeto Banco e algumas contas bancárias para realizar operações de depósito, saque e transferência.<br><br>

Passos a seguir:<br>
1.	Crie a classe ContaBancaria com seus atributos e métodos.<br>
2.	Crie a classe Banco com seus atributos e métodos.<br>
3.	Na classe Principal, crie uma instância da classe Banco e adicione algumas contas bancárias.<br>
4.	Realize operações de depósito, saque e transferência entre as contas criadas.<br>
5.	Liste as contas do banco e exiba suas informações após as operações.<br>


