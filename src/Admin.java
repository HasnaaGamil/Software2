import java.util.ArrayList;
import java.util.List;
   
public class Admin {
    List<RefundRequest>requests= new ArrayList<RefundRequest> ();
    public void addRequest(RefundRequest req)
    {
        requests.add(req);
    }

    public void ListRequest()
    {
        for(int i=0;i<requests.size();i++)
        {
            System.out.println("Request ID: "+requests.get(i).GetID());
            System.out.println("Request amount: "+requests.get(i).getRefundAmount());
            System.out.println("Request service: "+requests.get(i).getServiceName());
            System.out.println("---------------------");
        }
    }

    public boolean ReplyOnRequest(int id,char c)
    {
        if(c=='y'||c=='Y')
        {
            requests.remove(id-1);
            return true;
        }
        
        requests.remove(id-1);
        return false;
    }

}

