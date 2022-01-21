package bookmanagement;

import data.Book;
import java.util.Scanner;

import data.Shelfbook;

public class Library {

    public static void main(String[] args) {
        int n, choose;
        Scanner sc = new Scanner(System.in);
        Shelfbook roman = new Shelfbook("ROMAN", "PINK");
//        Shelbook hoso = new Shelfbook("HO SO SINH VIEN", "BLUE");
        
        do {
            System.out.println("1.  INPUT BOOK \n2.  SHOW BOOK\n3.  SORT PRICE OF ALL BOOK\n4.  DELETE BOOK");

            System.out.println("Choose: ");
            choose = Integer.parseInt(sc.nextLine());

            switch (choose) {
                case 1:
                    roman.inputBook();

                    break;

                case 2:
                    roman.printBookList();// in sach
                    break;

                case 3:
                    roman.sortPriceBook();//sort giá sách
                    break;
                case 4:
                    roman.deleteBook();
                    break;
                case 5:
                    
                default:
                    System.out.println("Choose again ");
                    break;

            }

        } while (true);
    }
}
