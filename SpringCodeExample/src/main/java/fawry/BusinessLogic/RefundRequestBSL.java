package fawry.BusinessLogic;

import static fawry.DataBase.RefundRequestDB.requests;

import java.util.List;


import fawry.model.RefundRequest;

public class RefundRequestBSL {
	private RefundRequest refundRequest;
	public RefundRequestBSL()
	{
		refundRequest=new RefundRequest();
	}
	public String addRequest(float amount,String service )
    {
		refundRequest.askForRefund(amount, service);
		if(requests.add(refundRequest))
			return "Request has been added successfully";
		else
		{
			return "Something went wrong";
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

	public List<RefundRequest> ListRequest()
    {
		return requests;
    }

}
