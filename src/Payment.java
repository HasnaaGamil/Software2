public abstract class Payment {
    float amount;

    String discreption = "UnInitialized Payment";

    public String getDiscreption() {
        return discreption;
    }
    public void setAmount(float amount)
    {
    	this.amount=amount;
    }
    public float getAmount()
    {
    	return this.amount;
    }

    public abstract float pay();
}
