public class ShopeePay extends Order implements  PaymentMode{
    public ShopeePay(){
    }

    public ShopeePay(String item, double unitPrice, int quantity, PaymentMode mode) {
        super(item, unitPrice, quantity, mode);
    }

    @Override
    public double determineDiscountRate() {
        return 0.1;
    }
}