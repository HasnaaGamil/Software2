public class Cash extends Payment {

    Cash() {
        discreption = " Cash payment";
    }

    public float pay() {
        return getAmount();
    }
}
