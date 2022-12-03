public class SpecificDiscount extends Discount {
    Payment p;

    SpecificDiscount(Payment p) {
        this.p = p;
    }

    public void pay() {
        System.out.println("20 %");
    }

    public String getDiscreption() {
        return p.getDiscreption() + " Specific discount";
    }

}
