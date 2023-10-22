public class Commission extends Hourly {
    private double totalSales;
    private final double commissionRate;
    
    public Commission (String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate)
    {
        super (eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commissionRate;
        this.totalSales = 0.0;
    }
    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }

    @Override
    public double pay() {
        double hourlyPayment = super.pay(); // Calculate the hourly payment using the parent class's pay method.
        double commissionPayment = totalSales * commissionRate;
        totalSales = 0.0; // Reset total sales after payment.
        return hourlyPayment + commissionPayment;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTotal Sales: $" + totalSales;
    }
}