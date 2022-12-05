public class OverallDiscount extends Discount {
    Payment p;
    float discount = 10;

    public void addDiscount(float dis) {
        this.discount = dis;
    }

    public void setPayment(Payment p) {
        this.p = p;
    }

    public float getDiscount() {
        return this.discount;
    }

    public float pay() {

        return p.getAmount() * (1 - (getDiscount() / 100));
    }

    public void viewDiscount() {
        System.out.println("There is discount on all services by " + getDiscount());
    }

    public String getDiscreption() {
        return p.getDiscreption() + ", Overall Discount";
    }

}