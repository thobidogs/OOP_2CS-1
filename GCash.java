public class GCash extends Order implements PaymentMode{
    public GCash(){

    }
    public GCash(String item, double unitPrice, int quantity, PaymentMode mode) {
        super(item, unitPrice, quantity, mode);
    }

    @Override
    public double determineDiscountRate() {
        return 0.0;
    }
}