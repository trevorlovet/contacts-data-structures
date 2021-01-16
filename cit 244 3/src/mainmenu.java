/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Trevor
 */
import java.util.*;
public class mainmenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String repeat = ""; // string to start over with new system
        String anotherAction =""; // start over with another indiduvaual action
        
        int system; // choose system -> switch statement
        int action; // choose action -> switch statement
        

        Scanner scan = new Scanner(System.in);  
        System.out.println("Welcome to the Phonebook Information System! ");
        do {
            System.out.println("Type a number to choose a system to work with");
            System.out.println("Work with a Linked Hash Set - 1");
            System.out.println("Work with a Hash Set        - 2");
            System.out.println("Work with an Array List     - 3");
            System.out.println("Work with a Linked List     - 4");
            System.out.println("Work with a Queue           - 5");
            System.out.println("Work with a Stack           - 6");
            system = scan.nextInt();
            
            switch (system){
                case 1: 
                    System.out.println("Working with a Linked Hash Set");
                    LinkedHashSet<ContactNames> linkedset =  
                           new LinkedHashSet<ContactNames>();   
                 
                   do {
                   System.out.println("What action would you like to perform?");
                   System.out.println("Add Name and Number    - 1");
                   System.out.println("Delete Name and Number - 2");
                   System.out.println("Entry Count            - 3");
                   System.out.println("Name Search            - 4");
                   action = scan.nextInt();
                   
                   
                   switch (action){
                        case 1:
                            ContactNames contact = new ContactNames();
                            System.out.println("Add name and number");
                            System.out.println("Type in the name ");
                            contact.setContactName(scan.next());
                            System.out.println("Type in the number ");
                            contact.setPhoneNumber(scan.next());
                            linkedset.add(contact);
                            System.out.println(linkedset);

                            
                                break;
                        case 2:
                             ContactNames c = new ContactNames();

                            System.out.println("Delete name and number");
                            String nameWanted;
                            System.out.println("Type in the name to delete ");
                            nameWanted = scan.next();
                            System.out.println(linkedset);
                  for(Object b : linkedset){
                       c = (ContactNames) b;
                      if (c.getContactName().equalsIgnoreCase(nameWanted)){
                            linkedset.remove(c);
                      }
                  
                  }
                  System.out.println(linkedset);   
                             break;
                        case 3:
                            System.out.println("Entry Count");
                            System.out.println("Set count: "+linkedset.size());
                             break;
                        case 4:
                            
                              ContactNames d = new ContactNames();

                            System.out.println("Search name");
                            String nameWanted1;
                            System.out.println("Type in the name to search ");
                            nameWanted1 = scan.next();
                            System.out.println(linkedset);
                    for(Object e : linkedset){
                       d = (ContactNames) e;
                      if (d.getContactName().equalsIgnoreCase(nameWanted1)){
                      System.out.println("The number is"+d.getphoneNumber());

                      }
                  
                  }
                            
                            
                            
                             break;
                                   }
                   
                   System.out.println("Would like to perform another Action?");
                   System.out.println("Type yes or no ---> ");
                   anotherAction = scan.next();
                
                   }
                
                
                   while (anotherAction.equalsIgnoreCase("yes"));
                   
                    break;
                   
                
                
                
                
                
                
                
                case 2: 
                    
                    
                    
                    System.out.println("Working with a  Hash Set");
                    HashSet<ContactNames> HashedSet =  
                           new HashSet<ContactNames>();   
                 
                   do {
                   System.out.println("What action would you like to perform?");
                   System.out.println("Add Name and Number    - 1");
                   System.out.println("Delete Name and Number - 2");
                   System.out.println("Entry Count            - 3");
                   System.out.println("Name Search            - 4");
                   action = scan.nextInt();
                   
                   
                   switch (action){
                        case 1:
                            ContactNames contact = new ContactNames();
                            System.out.println("Add name and number");
                            System.out.println("Type in the name ");
                            contact.setContactName(scan.next());
                            System.out.println("Type in the number ");
                            contact.setPhoneNumber(scan.next());
                            HashedSet.add(contact);
                            System.out.println(HashedSet);

                            
                                break;
                        case 2:
                             ContactNames c = new ContactNames();

                            System.out.println("Delete name and number");
                            String nameWanted;
                            System.out.println("Type in the name to delete ");
                            nameWanted = scan.next();
                            System.out.println(HashedSet);
                  for(Object b : HashedSet){
                       c = (ContactNames) b;
                      if (c.getContactName().equalsIgnoreCase(nameWanted)){
                            HashedSet.remove(c);
                      }
                  
                  }
                  System.out.println(HashedSet);   
                             break;
                        case 3:
                            System.out.println("Entry Count");
                            System.out.println("Set count: "+HashedSet.size());
                             break;
                        case 4:
                            
                              ContactNames d = new ContactNames();

                            System.out.println("Search name");
                            String nameWanted1;
                            System.out.println("Type in the name to search ");
                            nameWanted1 = scan.next();
                    for(Object e : HashedSet){
                       d = (ContactNames) e;
                      if (d.getContactName().equalsIgnoreCase(nameWanted1)){
                      System.out.println("The number is"+d.getphoneNumber());

                      }
                  
                  }
                            
                            
                            
                             break;
                                   }
                   
                   System.out.println("Would like to perform another Action?");
                   System.out.println("Type yes or no ---> ");
                   anotherAction = scan.next();
                
                   }
                
                
                   while (anotherAction.equalsIgnoreCase("yes"));
                   
                    break;
                    
                    
      
                case 3: 
                    System.out.println("Working with a Array List ");
                    ArrayList<ContactNames> arry =  
                           new ArrayList<ContactNames>();   
                 
                   do {
                   System.out.println("What action would you like to perform?");
                   System.out.println("Add Name and Number    - 1");
                   System.out.println("Delete Name and Number - 2");
                   System.out.println("Entry Count            - 3");
                   System.out.println("Name Search            - 4");
                   action = scan.nextInt();
                   
                   
                   switch (action){
                        case 1:
                            ContactNames contact = new ContactNames();
                            System.out.println("Add name and number");
                            System.out.println("Type in the name ");
                            contact.setContactName(scan.next());
                            System.out.println("Type in the number ");
                            contact.setPhoneNumber(scan.next());
                            arry.add(contact);
                            System.out.println(arry);

                            
                                break;
                        case 2:
                             ContactNames c = new ContactNames();

                            System.out.println("Delete name and number");
                            String nameWanted;
                            System.out.println("Type in the name to delete ");
                            nameWanted = scan.next();
                            System.out.println(arry);
                  for(Object b : arry){
                       c = (ContactNames) b;
                      if (c.getContactName().equalsIgnoreCase(nameWanted)){
                            arry.remove(c);
                      }
                  
                  }
                  System.out.println(arry);   
                             break;
                        case 3:
                            System.out.println("Entry Count");
                            System.out.println("Set count: "+arry.size());
                             break;
                        case 4:
                            
                              ContactNames d = new ContactNames();

                            System.out.println("Search name");
                            String nameWanted1;
                            System.out.println("Type in the name to search ");
                            nameWanted1 = scan.next();
                    for(Object e : arry){
                       d = (ContactNames) e;
                      if (d.getContactName().equalsIgnoreCase(nameWanted1)){
                      System.out.println("The number is "+d.getphoneNumber());

                      }
                  
                  }
                            
                            
                            
                             break;
                                   }
                   
                   System.out.println("Would like to perform another Action?");
                   System.out.println("Type yes or no ---> ");
                   anotherAction = scan.next();
                
                   }
                
                
                   while (anotherAction.equalsIgnoreCase("yes"));                 
                   break;
                case 4: 
                   
                     System.out.println("Working with a LinkedList  ");
                    LinkedList<ContactNames> link =  
                           new LinkedList<ContactNames>();   
                 
                   do {
                   System.out.println("What action would you like to perform?");
                   System.out.println("Add Name and Number    - 1");
                   System.out.println("Delete Name and Number - 2");
                   System.out.println("Entry Count            - 3");
                   System.out.println("Name Search            - 4");
                   action = scan.nextInt();
                   
                   
                   switch (action){
                        case 1:
                            ContactNames contact = new ContactNames();
                            System.out.println("Add name and number");
                            System.out.println("Type in the name ");
                            contact.setContactName(scan.next());
                            System.out.println("Type in the number ");
                            contact.setPhoneNumber(scan.next());
                            link.add(contact);
                            System.out.println(link);

                            
                                break;
                        case 2:
                             ContactNames c = new ContactNames();

                            System.out.println("Delete name and number");
                            String nameWanted;
                            System.out.println("Type in the name to delete ");
                            nameWanted = scan.next();
                            System.out.println(link);
                  for(Object b : link){
                       c = (ContactNames) b;
                      if (c.getContactName().equalsIgnoreCase(nameWanted)){
                            link.remove(c);
                      }
                  
                  }
                  System.out.println(link);   
                             break;
                        case 3:
                            System.out.println("Entry Count");
                            System.out.println("Set count: "+link.size());
                             break;
                        case 4:
                            
                              ContactNames d = new ContactNames();

                            System.out.println("Search name");
                            String nameWanted1;
                            System.out.println("Type in the name to search ");
                            nameWanted1 = scan.next();
                    for(Object e : link){
                       d = (ContactNames) e;
                      if (d.getContactName().equalsIgnoreCase(nameWanted1)){
                      System.out.println("The number is "+d.getphoneNumber());

                      }
                  
                  }
                            
                            
                            
                             break;
                                   }
                   
                   System.out.println("Would like to perform another Action?");
                   System.out.println("Type yes or no ---> ");
                   anotherAction = scan.next();
                
                   }
                
                
                   while (anotherAction.equalsIgnoreCase("yes"));  
                    
                    
                    break;
                    
                    
                    
                    
                    
                    
                    
                    
                    
                case 5: 
                    System.out.println("Working with a Queue");
                    Queue<ContactNames> q =  
                           new LinkedList<ContactNames>();   
                 
                   do {
                   System.out.println("What action would you like to perform?");
                   System.out.println("Add Name and Number    - 1");
                   System.out.println("Delete Name and Number - 2");
                   System.out.println("Entry Count            - 3");
                   System.out.println("Name Search            - 4");
                   action = scan.nextInt();
                   
                   
                   switch (action){
                        case 1:
                            ContactNames contact = new ContactNames();
                            System.out.println("Add name and number");
                            System.out.println("Type in the name ");
                            contact.setContactName(scan.next());
                            System.out.println("Type in the number ");
                            contact.setPhoneNumber(scan.next());
                            q.add(contact);
                            System.out.println(q);

                            
                                break;
                        case 2:
                             ContactNames c = new ContactNames();
                             {
                            System.out.println("Delete Names -> (FIFO)");
                            q.remove();
                      }
                  
                  
                  System.out.println(q);   
                             break;
                       
                             case 3:
                            System.out.println("Entry Count");
                            System.out.println("Set count: "+q.size());
                            break;
                        case 4:
                            
                              ContactNames d = new ContactNames();

                            System.out.println("View the first contact");
                            q.peek();
                             break;

                      }
                  
                                   System.out.println("Would like to perform another Action?");
                   System.out.println("Type yes or no ---> ");
                   anotherAction = scan.next();
                   }
                   
                  
                   while (anotherAction.equalsIgnoreCase("yes"));  
                
                
                
                case 6: 
                    System.out.println("Working with a Stack");
                    
                     Stack<ContactNames> s =  
                           new Stack<ContactNames>();   
                 
                   do {
                   System.out.println("What action would you like to perform?");
                   System.out.println("Add Name and Number    - 1");
                   System.out.println("Delete Name and Number - 2");
                   System.out.println("Entry Count            - 3");
                   System.out.println("Name Search            - 4");
                   action = scan.nextInt();
                   
                   
                   switch (action){
                        case 1:
                            ContactNames contact = new ContactNames();
                            System.out.println("Add name and number");
                            System.out.println("Type in the name ");
                            contact.setContactName(scan.next());
                            System.out.println("Type in the number ");
                            contact.setPhoneNumber(scan.next());
                            s.push(contact);
                            System.out.println(s);

                            
                                break;
                        case 2:
                             ContactNames c = new ContactNames();
                             {
                            System.out.println("Delete Names -> (LIFO)");
                            s.pop();
                      }
                  
                  
                  System.out.println(s);   
                             break;
                       
                             case 3:
                            System.out.println("Entry Count");
                            System.out.println("Set count: "+s.size());
                            break;
                        case 4:
                            
                              ContactNames d = new ContactNames();

                            System.out.println("View the Last contact");
                            s.peek();
                             break;

                      }
                  
                                   System.out.println("Would like to perform another Action?");
                   System.out.println("Type yes or no ---> ");
                   anotherAction = scan.next();
                   }
                   
                  
                   while (anotherAction.equalsIgnoreCase("yes"));
                    
                    
                    
                    
                    
                    
                    
                    break; 
            
            
            
            }
            
           System.out.println("Would you like to work with a another structure?");
           System.out.println("Please enter yes or no. --> ");
           repeat = scan.next();
        
            
        }
        while(repeat.equalsIgnoreCase("yes"));

    }
    
}
