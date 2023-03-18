public class Cliente {

    String nome;
    int cpf;
    float saldo;
    Endereco endereco;

    Cliente(String nome, int cpf, float saldo, Endereco endereco){
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
        this.endereco = endereco;
    }

    public void deposito(float value){
        this.saldo = this.saldo + value;
    }

    public void saque(float value){
        this.saldo = this.saldo - value;
    }

    public void extrato(){
        System.out.println("\n==================");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        endereco.imprimeEnd();
        System.out.println("\nSaldo Total: " + saldo);
        System.out.println("==================\n");
    }

    
}