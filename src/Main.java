public class Main {
    public static void main(String[] args) {

        Cliente alexandre = new Cliente();
        alexandre.setNome("Alexandre");

        Conta cc = new ContaCorrente(alexandre);
        Conta poupanca = new ContaPoupanca(alexandre);

        cc.depositar(7500);
        cc.transferir(1500, poupanca);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}