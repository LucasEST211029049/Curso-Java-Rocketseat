package Sintaxe_e_semantica;

public class Conta {
    String nome;
    double saldo;
    public void sacar(double valor){
        saldo = saldo - valor;
    }
    public void deposito(double valor){
        saldo = saldo + valor;
    }
    public void saldo(){
        System.out.println("Boa tarde " + nome + "\n" +
                "Seu saldo " + saldo);
    }
}
