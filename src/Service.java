import java.util.HashMap;
import java.util.Map;
public abstract class Service {
    HashMap<String, String> form  = new HashMap<>() ;
	abstract public void setFields();
	public void setFieldValues(String[] s)
	{
		 int i=0;
		
		 for (Map.Entry<String, String> entry : form.entrySet()) {
				entry.setValue(s[i++]);
			}
	}
	public void printFieldKeys()
	{
		
		 for (Map.Entry<String, String> entry : form.entrySet()) {
				String k = entry.getKey();
				System.out.println( "-"+k );
			}
	 }
	public HashMap<String, String> getFormField()
	{
		return form;
	}
}
