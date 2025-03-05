import java.util.Scanner;
class StartPhoneBook {
    Scanner input = new Scanner(System.in);
    Pb pb = new Pb();
    LL list = new LL();
    
    void StartPhoneBook () {
        System.out.println("Enter the amount of entries in phonebook: ");
        int entries = input.nextInt();
        getInfo(entries);
    }

    public void getInfo(int entries) {
        for (int i = 0; i < entries; i++) {
            
            System.out.println("Person " + (i + 1)  + " First Name:");
            pb.setFName(input.next());
            input.nextLine();
            System.out.println("Person " + (i + 1) + " Last Name:");
            pb.setLName(input.nextLine());
            System.out.println("Person " + (i + 1) + " Address:");
            pb.setAddr(input.nextLine());
            System.out.println("Person " + (i + 1) + " City:");
            pb.setCity(input.nextLine());
            System.out.println("Person " + (i + 1) + " Zipcode:");
            pb.setZip(input.nextLine());
            System.out.println("Person " + (i + 1) + " Phone Number:");
            pb.setPhoneNum(input.nextLine());
        
            list.insert(list, pb.returnString());
        }
        list.printList(list);    
        delete();
    }

    public void delete(){
        System.out.println("Which entry would you like to delete?");
        int key = input.nextInt() - 1;
        list.deleteAtPosition(list, key);
        System.out.println("New List: \n");
        list.printList(list);
    }
}