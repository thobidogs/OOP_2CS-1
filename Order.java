public class Order {
   
    //variables
    private String item;
    private int quantity;
    private double unitPrice;
    private double totalAmount;
    private PaymentMode mode; //interface

    //default constructor
    public Order(){
    }

    //constructor
    public Order(String item, double unitPrice, int quantity, PaymentMode mode) {
        this.item = item;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.mode = mode;
        this.totalAmount = totalAmount();
    }

    //setters
    public void setItem(String item) {
        this.item = item;
    }
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setMode(PaymentMode mode) {
        this.mode = mode;
    }
    public void setTotalAmount() {
        this.totalAmount = totalAmount();
    }

    //getters
    public String getItem() {
        return item;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public int getQuantity() {
        return quantity;
    }
    public PaymentMode getMode() {
        return mode;
    }
    public double getTotalAmount() {
        return totalAmount;
    }

    //method to calculate the total amount
    public double totalAmount(){
        double disc = this.unitPrice*this.mode.determineDiscountRate();
        double amount = this.unitPrice - disc;
        double total = amount*this.quantity;
        return total;
    }
}