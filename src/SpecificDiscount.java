public class SpecificDiscount extends Discount {
    Payment p;
    String service = "Mobile recharge services";
    float discount = 5;

    public void setPayment(Payment p) {
        this.p = p;
    }

    public void addDiscount(float dis, String ser) {
        this.service = ser;
        this.discount = dis;
    }

    public float getDiscount() {
        return this.discount;
    }

    public void viewDiscount() {
        System.out.println("There is discount on " + service + " " + getDiscount() + " % extra");
    }

    public float pay() {
        return p.getAmount() * (1 - (getDiscount() / 100));
    }

    public String getDiscreption() {
        return p.getDiscreption() + " Specific discount";
    }

}