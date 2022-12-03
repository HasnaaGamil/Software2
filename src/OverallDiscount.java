public class OverallDiscount extends Discount {
    Payment p;

    OverallDiscount(Payment p) {
        this.p = p;
    }

    public void pay() {

        System.out.println("10 %");
    }

    public String getDiscreption() {
        return p.getDiscreption() + ", Overall Discount";
    }

}
