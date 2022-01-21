
package data;


public class Book {
    private String name;
    private int pageNumber;
    private double price;
    
    
    public Book(String name, int pageNumber, double price){
        this.name = name;
        this.pageNumber = pageNumber;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" + "name=" + name + ", pageNumber=" + pageNumber + ", price=" + price + '}';
    }
    public void showProfiles(){
        System.out.printf("|%-30s|%-5d|%-9.2f $|\n",name,pageNumber,price);
    }
    
    
    
}
