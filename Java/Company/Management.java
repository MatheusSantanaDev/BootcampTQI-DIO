package Company;

class Management {
    public static void main(String[] args) {
        
        Employee employee = new Employee();

        Employee manager = new Manager();
        Employee seller = new Seller();
        Employee janitor = new Janitor();

        Seller seller1 = (Seller) new Employee();
        
    }
}
