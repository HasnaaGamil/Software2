public class RefundRequest {
	static int ID;
	float Refund;
	String service;
	
	public RefundRequest() {
		ID++;
	}
	
	public static int GetID() {
		return ID;
	}
	
	public void askForRefund(float f, String s) {
		this.Refund=f;
		this.service=s;
	}

}
