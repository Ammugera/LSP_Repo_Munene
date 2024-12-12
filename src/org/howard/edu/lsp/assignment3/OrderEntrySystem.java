package org.howard.edu.lsp.assignment3;

//Main Class to test the system
public class OrderEntrySystem {
 public static void main(String[] args) {
     Customer individualCustomer = new IndividualCustomer("John Doe", "123 Elm Street", "123-456-7890", "DL12345");
     Customer companyCustomer = new CompanyCustomer("TechCorp", "456 Oak Avenue", "987-654-3210", "Jane Smith", 10.0);

     Product product1 = new Product("Laptop", "High-performance laptop", 1200.0, 12, "Supplier A", "http://catalog.com/laptop", 2.5);
     Product product2 = new Product("Mouse", "Wireless mouse", 25.0, 6, "Supplier B", "http://catalog.com/mouse", 0.2);

     Order order = new Order(1001, individualCustomer, "12-10-2024", "Ground", "Processing");
     order.addItem(product1, 1);
     order.addItem(product2, 2);

     order.printOrderDetails();
 }
}

//Abstract class representing a Customer
abstract class Customer {
 private String name;
 private String address;
 private String phone;

 public Customer(String name, String address, String phone) {
     this.name = name;
     this.address = address;
     this.phone = phone;
 }

 public String getName() {
     return name;
 }

 public abstract String getCustomerDetails();
}

//Individual Customer class
class IndividualCustomer extends Customer {
 private String licenseNumber;

 public IndividualCustomer(String name, String address, String phone, String licenseNumber) {
     super(name, address, phone);
     this.licenseNumber = licenseNumber;
 }

 @Override
 public String getCustomerDetails() {
     return "Individual Customer: " + getName() + ", License: " + licenseNumber;
 }
}

//Company Customer class
class CompanyCustomer extends Customer {
 private String contactPerson;
 private double discount;

 public CompanyCustomer(String name, String address, String phone, String contactPerson, double discount) {
     super(name, address, phone);
     this.contactPerson = contactPerson;
     this.discount = discount;
 }

 @Override
 public String getCustomerDetails() {
     return "Company: " + getName() + ", Contact: " + contactPerson + ", Discount: " + discount + "%";
 }
}

// Product class
class Product {
 private String name;
 private String description;
 private double price;
 private int warrantyPeriod; // in months
 private String supplier;
 private String catalogURL;
 private double weight;

 public Product(String name, String description, double price, int warrantyPeriod, String supplier, String catalogURL, double weight) {
     this.name = name;
     this.description = description;
     this.price = price;
     this.warrantyPeriod = warrantyPeriod;
     this.supplier = supplier;
     this.catalogURL = catalogURL;
     this.weight = weight;
 }

 public String getName() {
     return name;
 }

 public double getPrice() {
     return price;
 }
}

//Order class
class Order {
 private int orderId;
 private Customer customer;
 private String orderDate;
 private String shippingMode;
 private String status;
 private OrderItem[] items = new OrderItem[10];
 private int itemCount = 0;

 public Order(int orderId, Customer customer, String orderDate, String shippingMode, String status) {
     this.orderId = orderId;
     this.customer = customer;
     this.orderDate = orderDate;
     this.shippingMode = shippingMode;
     this.status = status;
 }

 public void addItem(Product product, int quantity) {
     if (itemCount < 10) {
         items[itemCount++] = new OrderItem(product, quantity);
     } else {
         System.out.println("Cannot add more than 10 items to an order.");
     }
 }

 public void printOrderDetails() {
     System.out.println("Order ID: " + orderId);
     System.out.println("Customer: " + customer.getCustomerDetails());
     System.out.println("Order Date: " + orderDate);
     System.out.println("Shipping Mode: " + shippingMode);
     System.out.println("Status: " + status);
     System.out.println("Items:");
     for (int i = 0; i < itemCount; i++) {
         System.out.println(" - " + items[i].getItemDetails());
     }
 }
}

//OrderItem class
class OrderItem {
 private Product product;
 private int quantity;

 public OrderItem(Product product, int quantity) {
     this.product = product;
     this.quantity = quantity;
 }

 public String getItemDetails() {
     return product.getName() + " x " + quantity + " ($" + (product.getPrice() * quantity) + ")";
 }
}
