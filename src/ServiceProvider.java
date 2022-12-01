import java.util.HashMap;
import java.util.Map;

public class ServiceProvider {
	 HashMap<String, String> form  = new HashMap<>();
	 String name;
	 boolean acceptCash=false;
	 public void setName(String n)
	 {
		 this.name=n;
	 }
	 public String getName()
	 {
		 return this.name;
	 }
	 public void setAcceptCash(boolean b)
	 {
		 this.acceptCash=b;
	 }
	 public boolean getAcceptCash()
	 {
		 return this.acceptCash;
	 }
	 public void setFormField(String key)//for add new service provider
	 {
		 form.put(key,"");
	 }
	 public void getFormField()
	 {
		 System.out.println("Fields : " + form);
	 }
	 public void printFieldKeys()
	 {
		
		 for (Map.Entry<String, String> entry : form.entrySet()) {
				String k = entry.getKey();
				System.out.println( "-"+k );
			}
	 }
	 public void setFieldValues(String[] s)
	 {
		 int i=0;
		
		 for (Map.Entry<String, String> entry : form.entrySet()) {
				entry.setValue(s[i++]);
			}
	 } 
	 public int getNumFields()
	 {
		 return form.size();
	 }
}