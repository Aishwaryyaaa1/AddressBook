
import java.text.*;
import java.util.*;
class AddressBook {

    private String fullname;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phone;

  public AddressBook() {
        super();
    }
    
    public AddressBook(String fullname, String address, String city, String state, String zip, String phone) { 
        this.fullname = fullname;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone; 

    }

    public String getFullname() {
        return fullname;
    }
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getZip() {
        return zip;
    }
    public void setZip(String zip) {
        this.zip = zip;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toString() {
        return "Employee [name=" + this.fullname + ", Address=" + this.address + ", City="
                + this.city + ", state=" + this.state + ", zip=" + this.zip
                + ", phone=" + this.phone + "]";
    }



}



public class AddressBookMain {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        boolean T = true;
        do {
        
        System.out.println("Enter A to Add Person ");
        System.out.println("Enter D to Delete Person");
        System.out.println("Enter M to Modify Person");
        System.out.println("Enter S to Search Address Book ");
        System.out.println("Enter L to List ALL (sorted) ");
        System.out.println("Enter Q to Quit");
        System.out.print("Please enter your choice: ");
        char choice = sc.nextLine().toUpperCase().charAt(0);


        while ((choice != 'A') && (choice != 'D') && (choice != 'M')  && (choice != 'S') && (choice != 'L')&& (choice != 'Q')) {
            System.out.println("Invalid choice, Please select (A)dd, (D)elete, (M)odify, (S)earch, (L)ist or (Q)uit: ");
            choice = sc.nextLine().toUpperCase().charAt(0);
        }


        AddressBook newPerson = new AddressBook();
        ArrayList<AddressBook> person = new ArrayList<>(); 

        switch (choice) {
        case 'A' :      
        System.out.println("ADD DETAILS");

        System.out.print("Enter Fullname: ");
        newPerson.setFullname(sc.nextLine());

        System.out.print("Enter Address: ");
        newPerson.setAddress(sc.nextLine());

        System.out.print("Enter City: ");
        newPerson.setCity(sc.nextLine());

        System.out.print("Enter State: ");
        newPerson.setState(sc.nextLine());

        System.out.print("Enter Zip: ");
        newPerson.setZip(sc.nextLine());

        System.out.print("Enter Phone Number: ");
        newPerson.setPhone(sc.nextLine());



        person.add(new AddressBook(newPerson.getFullname(), newPerson.getAddress(), newPerson.getCity(), newPerson.getState(), newPerson.getZip(), newPerson.getPhone()));
        System.out.println(person.get(0));


        System.out.println("one person successfully added ");

        break;

   
        case 'B':

        }

    }
        while (T != false);

    }}
