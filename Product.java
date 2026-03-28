class Product {

    String name;
    double price;
    String brand;
    int quantity;
    String category;
    boolean available;
    int rating;

    void setProduct(String name, double price, String brand, int quantity,
                    String category, boolean available, int rating) {

        this.name = name;
        this.price = price;
        this.brand = brand;
        this.quantity = quantity;
        this.category = category;
        this.available = available;
        this.rating = rating;

		
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Quantity: " + quantity);
        System.out.println("Category: " + category);
        System.out.println("Available: " + available);
        System.out.println("Rating: " + rating);
        System.out.println("----------------------");
    }
}

