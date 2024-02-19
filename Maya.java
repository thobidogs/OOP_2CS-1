public class Maya extends Order implements PaymentMode{
   
    @Override
    public double determineDiscountRate() {
        return 0.05;
    }
}