/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Trevor
 */
public class ContactNames {
    private String contactName;
    private String phoneNumber;

    // Constructor
    
    public ContactNames(){
        contactName = "";
        phoneNumber = "";
    
    }
    
    public ContactNames(String contactName,
                       String phoneNumber)
{
        this.contactName = contactName;
        this.phoneNumber = phoneNumber;
}
    // Constructor
    public ContactNames(ContactNames ContactNamesObject)
    {
        contactName = ContactNamesObject.contactName;
        phoneNumber = ContactNamesObject.phoneNumber;
    }

    //Method to set the domain name
    public void setContactName(String contactName)
    {
        this.contactName = contactName;
    }

    //Method to get the domain name
    public String getContactName()
    {
        return contactName;
    }

    //Method to set the internet protocol address
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    //Method to get the internet protocol address
    public String getphoneNumber()
    {
        return phoneNumber;
    }
    
    // Method to return the state of the current object
    @Override
    public String toString()
    {
        String contactInfo = "The contact name is  " + contactName +
                                   "  The phone number is "  + 
                                    phoneNumber;
        return contactInfo;
    }
    
}
