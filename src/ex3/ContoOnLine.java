package ex3;

public class ContoOnLine extends ContoCorrente {
    private double maxPrelievo;

    public ContoOnLine(String titolare, double saldo, double maxP) {
        super(titolare, saldo);
        this.maxPrelievo = maxP;
    }

    public void stampaSaldo() {
        System.out.println("Titolare: " + this.titolare + " - Saldo: " + this.saldo + " - Num movimenti: " + this.nMovimenti + " - Massimo movimenti: " + this.maxMovimenti + " - Massimo prelievo possibile: " + maxPrelievo);
    }

    public void preleva(double x) throws BankException {
        if (x <= maxPrelievo) super.preleva(x);
        if (x > maxPrelievo) throw new BankException("Maximum withdrawal amount already reached");
    }
}
