package ex3;

public class Main {
    public static void main(String[] args) {
        ContoCorrente conto1 = new ContoCorrente("Aldo Baglio", 20000.00);

        System.out.println(conto1.restituisciSaldo());

        try {
            conto1.preleva(30000);
            System.out.println(conto1.restituisciSaldo());
        } catch (BankException e) {
            System.err.println("Error " + e);
        }

        ContoOnLine conto2 = new ContoOnLine("Sergio Mattarella", 50000, 1000);

        conto2.stampaSaldo();

        try {
            conto2.preleva(1100);
            conto2.stampaSaldo();
        } catch (BankException e) {
            System.err.println("Error " + e);
        }
    }


}
