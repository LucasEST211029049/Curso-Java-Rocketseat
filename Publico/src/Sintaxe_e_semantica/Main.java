package Sintaxe_e_semantica;

public class Main {
    public static void main(String[] args){
        Conta conta = new Conta();
        conta.nome = "Lucas Matheus";
        conta.saldo = 0.00;
        conta.deposito(100);
        conta.deposito(550);
        conta.sacar(50);
        conta.saldo();
    }
}
