import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CreditCard extends Payment {
    private long ccNumber;
    private String cvv;
    private String dateOfExpiry;

    CreditCard(long ccNum, String cvv, String expiryDate) {
        this.ccNumber = ccNum;
        this.cvv = cvv;
        this.dateOfExpiry = expiryDate;
        discreption = " Credit Card";
    }

    // function that check on Expiration date
    public boolean checkExpire() {
        boolean expired;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/yy");
        simpleDateFormat.setLenient(false);
        Date expiry = null;
        try {
            expiry = simpleDateFormat.parse(dateOfExpiry);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        expired = expiry.before(new Date());
        return expired;
    }

    public void pay() {
        if (checkExpire() == false) {
            System.out.println("you can pay by credit card technique");
        }
    }

}
