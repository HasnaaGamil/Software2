public class Wallet extends Payment {
    float funds = 1000;
    CreditCard[] cc;

    public Wallet(CreditCard... cc) {
        this.cc = cc;
    }

    public void AddFunds(float f) {
        this.funds += f;
    }

    public float GetFunds() {
        return funds;

    }

    public float pay() {

        if (funds > amount) {
            funds -= getAmount();
            return getAmount();
        }
        return -1;
    }

}