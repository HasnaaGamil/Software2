import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Transaction {
    List<HashMap> transactions = new ArrayList<HashMap>();

    public void setTransaction(HashMap user, HashMap form) {
        transactions.add(user);
        transactions.add(form);
    }

    public void listTransaction() {
        for (int i = 0; i < transactions.size(); i += 2) {
            System.out.println(transactions.get(i));
            System.out.println(transactions.get(i + 1));
            System.out.println("---------------------------------------------------");
        }

    }

}