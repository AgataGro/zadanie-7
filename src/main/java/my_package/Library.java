package my_package;
import java.util.Scanner;

public class Library {

    public static void main(String[] args) {
        int comm = 0, i = 2;
        boolean b=true,test;
        Client[] clients=new Client[100];
        Inventory inv=new Inventory();
        Scanner myScanner = new Scanner(System.in);
        String s,s2;
        clients[0]=new Client("John","Doe",true);
        clients[1]=new Client("Anna","Teacup",false);
        inv.add("Lord of the Rings",20);
        inv.add("Harry Potter",7);
        int x;
        while (b==true){
            System.out.println("Choose an action:" +
                    "\n1-Add book to inventory" +
                    "\n2-Remove book from inventory" +
                    "\n3-Register Client" +
                    "\n4-Add favourite book to last client" +
                    "\n5-exit");
            comm=myScanner.nextInt();
            myScanner.nextLine();
            switch(comm){
                case 1:
                    System.out.println("Type book title");
                    s=myScanner.nextLine();
                    myScanner.nextLine();
                    System.out.println("Type amount");
                    x= myScanner.nextInt();
                    myScanner.nextLine();
                    inv.add(s,x);
                    break;
                case 2:
                    System.out.println("Type book title");
                    s=myScanner.nextLine();
                    myScanner.nextLine();
                    System.out.println("Type amount");
                    x= myScanner.nextInt();
                    myScanner.nextLine();
                    inv.remove(s,x);
                    break;
                case 3:
                    System.out.println("Type first name");
                    s=myScanner.nextLine();
                    myScanner.nextLine();
                    System.out.println("Type last name");
                    s2=myScanner.nextLine();
                    myScanner.nextLine();
                    System.out.println("Is adult? Type true or false");
                    test=myScanner.nextBoolean();
                    myScanner.nextLine();
                    clients[i]=new Client(s,s2,test);
                    i++;
                    break;
                case 4:
                    System.out.println("Type book title");
                    s=myScanner.nextLine();
                    myScanner.nextLine();
                    if(i>0){
                        clients[i-1].setFavourite(inv.getBook(s));
                    }
                    else System.out.println("No clients");
                    break;
                case 5:
                    b=false;
                    break;
            }
        }
    }
}
