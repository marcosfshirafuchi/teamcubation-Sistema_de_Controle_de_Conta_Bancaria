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
public class ContaBancaria {
    private String titular;
    private String numeroConta;
    private double saldo;

    public ContaBancaria(){

    }
    public ContaBancaria(String titular, String numeroConta, double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public boolean sacar(double valor){
        if (valor>saldo){
            return false;
        }
        else {
            saldo -=valor;
            return true;
        }
    }

    public boolean transferir(double valor, ContaBancaria destino){
        if (this.sacar(valor)==true){
            destino.depositar(valor);
            return true;
        }else{
            return false;
        }
    }
}
