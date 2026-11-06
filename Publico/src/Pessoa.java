public class Pessoa {
    String nome;
    int idade;
    int humor;
    int paciencia;
    String profissão;

    void apresentar(){
        System.out.println("Boa tarde a todos \n" +
                "Meu nome é " + nome  +
                "tenho" + idade + "anos\n" +
                "Minha profissão:" + profissão
        );
    }
}
