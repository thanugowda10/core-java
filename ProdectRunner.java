class ProductRunner {
    public static void main(String[] args) {

        Product p = new Product();

        
        p.setProduct("Laptop", 55000, "Dell", 10, "Electronics", true, 5);
        p.setProduct("Mobile", 20000, "Samsung", 15, "Electronics", true, 4);
        p.setProduct("TV", 45000, "LG", 5, "Appliances", true, 5);
        p.setProduct("Fridge", 30000, "Whirlpool", 3, "Appliances", false, 4);
        p.setProduct("Shoes", 2000, "Nike", 25, "Fashion", true, 4);
        p.setProduct("Watch", 5000, "Fastrack", 12, "Accessories", true, 3);
        p.setProduct("Bag", 1500, "Skybags", 20, "Travel", true, 4);
    }
}