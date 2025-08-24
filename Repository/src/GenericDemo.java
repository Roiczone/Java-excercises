public class GenericDemo {
    public static void main(String[] args) {
        Repository<Product> productRepo = new Repository<>();
        productRepo.add(new Product("Laptop", 1200.0));
        productRepo.add(new Product("Phone", 800.0));

        System.out.println("Products:");
        for (Product p : productRepo.getAll()) {
            System.out.println(p);
        }
        Repository<Customer> customerRepo = new Repository<>();
        customerRepo.add(new Customer("Alice", "alice@email.com"));
        customerRepo.add(new Customer("Bob", "bob@email.com"));

        System.out.println("\nCustomers:");
        for (Customer c : customerRepo.getAll()) {
            System.out.println(c);
        }

    }
}
