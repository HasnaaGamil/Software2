public class RefundRequest {
    static int num_requests = 1;
    int id = 0;
    float Refund;
    String service;

    public RefundRequest() {
        id = num_requests++;

    }

    public int GetID() {
        return id;
    }

    public void askForRefund(float f, String s) {
        this.Refund = f;
        this.service = s;
    }

    public float getRefundAmount() {
        return Refund;
    }

    public String getServiceName() {
        return service;
    }

}