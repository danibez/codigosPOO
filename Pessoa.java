public class Pessoa {
    String nome;
    int idade;
    int cpf;
    String signo;
    int sus;

    void imprimePessoa(){
        System.out.println("Nome: " + nome +
                            "\nIdade: "+ idade + 
                            "\nCPF: " + cpf + 
                            "\nSigno: " + signo +
                            "\nSUS: "+ sus);
    }
}