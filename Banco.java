public class Banco {
    public static void main(String[] args) {
        Endereco e = new Endereco(1234, "rua 1 do lado da rua 2", "Centro");
        Cliente c = new Cliente("Fulano de tal", 58845, 500, e);

        c.extrato();
        System.out.println("\n\n");
        c.deposito(500);
        System.out.println("\n\n");
        c.extrato();
        System.out.println("\n\n");
        c.saque(900);
        c.extrato();
        System.out.println("\n\n");

    }
}
