public class Endereco {

    int cep;
    String logradouro, bairro;

    Endereco(int cep, String logradouro, String bairro){
        this.cep = cep;
        this.logradouro = logradouro;
        this.bairro = bairro;
    }

    public void imprimeEnd(){
        System.out.println("--- ENDEREÇO ---");
        System.out.println("CEP: " + cep);
        System.out.println("Logradouro: " + logradouro);
        System.out.print("Bairro: " + bairro);
    }

}