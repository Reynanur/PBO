package sk1;

public class Commission extends Hourly {

    private double totalSales;
    private double comRate;

    public Commission(String eName, String eAddress, String ePhone, String SocSecNumber, 
    		double rate, double comRate){
        super(eName, eAddress, ePhone, SocSecNumber, rate );
        comRate = comRate;
        System.out.println("Commission: " + comRate);
    }

    public void addSales(double totalSales){
        this.totalSales = totalSales;
    }

    @Override
    public double pay(){
        return (comRate * totalSales /100) + super.pay();
        
    }

    @Override
    public String toString(){
        return super.toString() + "Total sales : " + totalSales;
    }
}
