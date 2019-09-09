package EmailApp;

import java.util.Scanner;

public class Email {

    private final String firstname;
    private final String lastname;
    private final String password;
    private final String department;
    private String mailboxCapacity;
    private String alternateEmail;
    private final int defaultPasswordLength=10;
    private final int MailboxCapacity=500;
   
    private final String companySuffix="aeycompany.com";
    
    private final String email;
    
    //Countrutor to recive firstname or lastname
    public Email(String firstname,String lastname){
     this.firstname=firstname;
     this.lastname=lastname;
        System.out.println("Email Created:"+this.firstname+" "+this.lastname);
      
    
    // Call method asking for Department- return department
        this.department=setDepartment();
        System.out.println("Department: "+this.department);
       
      //call the method for random password
        this.password=randomPassword(defaultPasswordLength);
        System.out.println("Your Password is: "+this.password);
        
        email=firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department+companySuffix;
        System.out.println("Your Email address is:"+email);
                
    }  
    
    
     //Ask for departm
       private String setDepartment(){
        System.out.println("DEPARMENT CODES\n1 for Sales\n2 Development\n3 for Accounting\n0 for none\n Enter the deparment code:");
         Scanner in= new Scanner(System.in);
         int deepChoice=in.nextInt();
         if(deepChoice==1){return "Sales";}
         else if(deepChoice==2){return "Development";}
         else if(deepChoice==3){return "Accounting";}
         else{return "";}
        }
    
    //Generate password
    
       private String randomPassword(int length){
           String passwordSet= "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789#@%&*";
           char[] d = new char[length];
           for (int i = 0; i < length; i++) {
               int rand;
               rand = (int)(Math.random()*passwordSet.length());
              d[i]=passwordSet.charAt(rand);
               
           }
            return new String(d);   
           }
    //Set mailbox Capacity
     public void setMailboxCapacity(String altEmail){
        String capacity = null;
         this.mailboxCapacity=capacity;
     }

    //Set alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail=altEmail;
    }
     
     
     
    //Change the password
     
    public String getMailboxCapacity(){return mailboxCapacity;
    }
    public String getAlternateEmail(){return alternateEmail;}
    public String getPassword(){return password;
}
    
    public String showInfo(){
        return "Dispaly Name: " +firstname+ " "+lastname+
                "\nCompany Email: "+email+
                "\nMailbox Capacity: "+"mb";
    }
}