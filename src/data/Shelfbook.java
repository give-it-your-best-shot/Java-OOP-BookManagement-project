
package data;

import java.util.Scanner;


public class Shelfbook {
    private String kindOfBook;
    private String color;
    private Scanner sc =  new Scanner(System.in);
    private int count = 0;
    private Book list[] = new Book[300];
    
    
    
    public Shelfbook(String kindOfBook,String color){
        this.kindOfBook = kindOfBook;
        this.color = color;
    }
    public void inputBook(){
        String name;
        int pageNumber ;
        double price;
        System.out.println("Input book " + (count+1) + "/" + list.length);
        System.out.println("Input book's name: ");
        name = sc.nextLine();
        System.out.println("Input book's pageNumber: ");
        pageNumber = Integer.parseInt(sc.nextLine());
        System.out.println("Input book's price");
        price = Double.parseDouble(sc.nextLine());
        System.out.println("NEXT BOOK");
        list[count] = new Book(name, pageNumber, price);
        count ++;
    }
     public void printBookList(){
        System.out.println("BOOK LIST : \n");
        for (int i = 0; i < count; i++) {
            list[i].showProfiles();
        }   
    }
    
    
    
    public void sortPriceBook(){
        for (int i = 0; i < count-1; i++) {
            for (int j = i+1; j < count; j++) {
                if(list[i].getPrice()>list[j].getPrice()){
                    Book temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                    
                }
            }
        }System.out.println("SORTED!!!");
    }
    public void deleteBook(){
        int del;
        System.out.println("WHAT BOOK YOU WANT TO DELETE?"); 
        del = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < count; i++) {
            if(del == i +1){
                for (int j = i; j < count; j++) {
                    list[i] = list[i+1];
                }
                count--;
                
            }else System.out.println("Can't find the book you want to delete !!!");
        }
}   
   
    
}
