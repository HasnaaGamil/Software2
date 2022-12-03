public abstract class Payment {
    String discreption = "UnEnitialized Payment";

    public String getDiscreption() {
        return discreption;
    }

    public abstract void pay();
}
