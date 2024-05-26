import java.util.ArrayList;
import java.util.List;
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
public class Banco {
    private List<ContaBancaria> contas = new ArrayList<>();

    public void adicionarConta(ContaBancaria conta){
        contas.add(conta);
    }

    public ContaBancaria buscarConta(String numeroConta){
        ContaBancaria contaBancariaEncontrada = new ContaBancaria();
        boolean resposta = false;
        for (int i =0; i<contas.size();i++){
            if (contas.get(i).getNumeroConta().equalsIgnoreCase(numeroConta)){
                contaBancariaEncontrada = contas.get(i);
                resposta = true;
            }
        }
        if (resposta){
            return  contaBancariaEncontrada;
        }else{
            return null;
        }
    }

    public void listarContas(){
        System.out.println("Contas cadastradas no banco:");
        for (ContaBancaria impressaoContasCadastradas : contas){
            System.out.println("Titular: " + impressaoContasCadastradas.getTitular() + ", Numero da conta: "+impressaoContasCadastradas.getNumeroConta() + ", Saldo: R$ "+ String.format("%.2f",impressaoContasCadastradas.getSaldo()));
        }
    }
}
