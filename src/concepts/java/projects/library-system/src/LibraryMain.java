import java.util.*;

public class LibraryMain {
    public static void main(String[] args){
        Library lib = new Library();
        lib.add(new Book("111","Clean Code"));
        lib.add(new Book("222","Effective Java"));
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1) List 2) Add 3) Borrow 4) Return 5) Exit");
            int ch = Integer.parseInt(sc.nextLine().trim());
            if (ch==1) lib.list().forEach(System.out::println);
            else if (ch==2){
                System.out.print("ISBN: "); String i=sc.nextLine();
                System.out.print("Title: "); String t=sc.nextLine();
                lib.add(new Book(i,t));
            } else if (ch==3){
                System.out.print("ISBN to borrow: "); System.out.println(lib.borrow(sc.nextLine())?"OK":"Fail");
            } else if (ch==4){
                System.out.print("ISBN to return: "); System.out.println(lib.giveBack(sc.nextLine())?"OK":"Fail");
            } else break;
        }
    }
}
