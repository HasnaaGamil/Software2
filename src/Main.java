public class Main {

	public static void main(String[] args) {
		Payment payment = new Cash();
		payment = new OverallDiscount(payment);
		System.out.println(payment.getDiscreption());
		payment.pay();

	}

}
