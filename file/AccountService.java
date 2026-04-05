class AccountService {

    String name;
    int accNumber;
    String type;
    String branch;
    String city;

   
    AccountService() {
        this("Ravi", 1111);
        System.out.println("Default Constructor");
    }

 
    AccountService(String name, int accNumber) {
        this(name, accNumber, "Savings");
        System.out.println("Two Parameter Constructor");
    }

  
    AccountService(String name, int accNumber, String type) {
        this(name, accNumber, type, "Main Branch");
        System.out.println("Three Parameter Constructor");
    }

 
    AccountService(String name, int accNumber, String type, String branch) {
        this(name, accNumber, type, branch, "Bangalore");
        System.out.println("Four Parameter Constructor");
    
	
    AccountService(String name, int accNumber, String type, String branch, String city) {

        this.name = name;
        this.accNumber = accNumber;
        this.type = type;
        this.branch = branch;
        this.city = city;

        System.out.println("Name       : " + name);
        System.out.println("Acc Number : " + accNumber);
        System.out.println("Type       : " + type);
        System.out.println("Branch     : " + branch);
        System.out.println("City       : " + city);
    }
}