import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
public class Main
{
    static Scanner input = new Scanner(System.in);
    public static ServiceProvider printServiceProvider()
    {
        ServiceProvider sp;
        List<String>serviceProvider= new ArrayList<String> ();
        {
            {
                serviceProvider.add("Vodafone");
                serviceProvider.add("Etisalat");
                serviceProvider.add("Orange");
                serviceProvider.add("We");

            }
        };

        for(int i=0; i<serviceProvider.size(); i++)
        {
            System.out.println((i+1)+"-"+serviceProvider.get(i));
        }
        int n=input.nextInt();
        if(n==1)
            sp=new Vodafone();
        else if (n==2)
            sp=new Etisalat();
        else if (n==3)
            sp=new Orange();
        else
            sp=new We();
        return(sp);
    }
    public static void printAdminFunction(Admin admin)
    {
        System.out.println("Choose ");
        System.out.println("1-List and reply on refund requests");
        System.out.println("2-Add Discount");
        int opt=input.nextInt();
        if(opt==1)
        {
            admin.ListRequest();
        }
        else if(opt==2)
        {
            System.out.println("Choose ");
            System.out.println("1-Overall discount");
            System.out.println("2-Specific discount on a service");
            opt=input.nextInt();
            if(opt==1)
            {

            }

        }
    }
    public static void printService(String sservice)
    {
        Service service ;
        ServiceProvider sp;
        System.out.println("Choose the service provider you want: ");
        sp=printServiceProvider();
        service=sp.createService(sservice);
        service.setFields();
        System.out.println("Fill the following fields:");
        service.printFieldKeys();
        String[] s=new String[2];
        for(int i=0; i<2; i++)
        {
            s[i]=input.next();

        }
        service.setFieldValues(s);
        printPayment(sp,service);
    }
    public static void printPayment(ServiceProvider sp,Service service)
    {
        sp.printPaymentMethods();
        Payment p;
        int op=input.nextInt();
        if(op==1)
        {
            System.out.println("Enter Credit Card number, card verification value, expiry date(MM/yy): ");
            long num=input.nextInt();
            String val=input.next();
            String date=input.next();
            p=new CreditCard(num,val,date);
            p.setAmount(Float.valueOf(service.getFormField().get("Amount")));
            sp.setPayment(p);
            sp.performPayment();
        }
        else if(op==2)
        {
            p=new Wallet();
            p.setAmount(Float.valueOf(service.getFormField().get("Amount")));
            sp.setPayment(p);
            sp.performPayment();
        }
        else if(op==3)
        {
            p=new Cash();
            p.setAmount(Float.valueOf(service.getFormField().get("Amount")));
            sp.setPayment(p);
            sp.performPayment();
        }

    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Service service;
        Admin admin=new Admin();
        ServiceProvider sp;
        System.out.println("1-For Admin");
        System.out.println("2-For customer");
        int opt=input.nextInt();
        if(opt==1)
        {

            printAdminFunction(admin);

        }
        else if(opt==2)
        {
            User user =new User();
            Regestration regestration=new Regestration();
            System.out.println("1-Sign up ");
            System.out.println("2-Sign in ");
            opt=input.nextInt();
            if(opt==1)
            {
                if(regestration.signUp(user));

            }

            else if(opt==2)
            {
                if(regestration.signIn(user))
                {

                    System.out.println("Choose ");
                    System.out.println("1-Search for service");
                    System.out.println("2-Add funds to wallet");
                    System.out.println("3-Check for discount");
                    System.out.println("4-Ask for refund");
                    opt=input.nextInt();
                    if(opt==1)
                    {
                        System.out.println("Choose the service you want: ");
                        System.out.println("1-Mobile recharge services ");
                        System.out.println("2-Internet Payment services ");
                        System.out.println("3-Landline services ");
                        System.out.println("4-Donations ");
                        opt=input.nextInt();
                        if(opt==1)
                        {

                            printService("Mobile recharge");
                        }
                        else if(opt==2)
                        {
                            printService("Internet Payment");
                        }
                        else if(opt==3)
                        {
                            sp=new We();
                            service=sp.createService("Landline");
                            service.setFields();
                            System.out.println("Fill the following fields:");
                            service.printFieldKeys();
                            String[] s=new String[3];
                            for(int i=0; i<3; i++)
                            {
                                s[i]=input.next();

                            }
                            service.setFieldValues(s);
                            service.getFormField();
                            printPayment(sp,service);
                        }
                        else if(opt==4)
                        {
                            System.out.println("Choose the service provider you want: ");
                            System.out.println("1-Vodafone");
                            System.out.println("2-We");
                            int n=input.nextInt();
                            if(n==1)
                                sp=new Vodafone();
                            else
                                sp=new We();
                            service=sp.createService("Donation");
                            service.setFields();
                            System.out.println("Fill the following fields:");
                            service.printFieldKeys();
                            String[] s=new String[2];
                            for(int i=0; i<2; i++)
                            {
                                s[i]=input.next();

                            }
                            service.setFieldValues(s);
                            service.getFormField();
                            printPayment(sp,service);
                        }


                    }
                    if(opt==2)
                    {
                        System.out.println("Choose the service provider you want: ");
                        sp= printServiceProvider();
                        System.out.println("Enter Credit Card number, card verification value, expiry date(MM/yy): ");
                        long num=input.nextInt();
                        String val=input.next();
                        String date=input.next();
                        CreditCard cc=new CreditCard(num,val,date);
                        System.out.println("Enter amount of money you want to add");
                        float amount=input.nextFloat();
                        Wallet wallet=new Wallet(cc);
                        wallet.AddFunds(amount);
                        System.out.println();
                    }
                    if(opt==3)
                    {

                    }
                    else if(opt==4)
                    {
                        RefundRequest request=new RefundRequest();
                        System.out.println("Enter the amount of money you want to refund ");
                        float amount=input.nextFloat();
                        System.out.println("Enter the service you want to refund from");
                        String val=input.next();
                        request.askForRefund(amount, val);
                        admin.addRequest(request);
                    }
                }

            };
        }



    }
}
