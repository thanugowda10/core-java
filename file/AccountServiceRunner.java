class AccountServiceRunner {
    public static void main(String[] args) {

        AccountService a1 = new AccountService();

        System.out.println("------------------");

        AccountService a2 = new AccountService("Meena", 2222);

        System.out.println("------------------");

        AccountService a3 = new AccountService("Karthik", 3333, "Current");

        System.out.println("------------------");

        AccountService a4 = new AccountService("Divya", 4444, "Salary", "City Branch");

        System.out.println("------------------");

        AccountService a5 = new AccountService("Arun", 5555, "Business", "Corporate Branch", "Hyderabad");
    }
}