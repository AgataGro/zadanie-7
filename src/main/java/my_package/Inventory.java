package my_package;

public class Inventory {
    Book[] books;
    int[] amount;
    public Inventory()
    {
        books=new Book[20];
        amount=new int[20];
        for(int i=0;i<20;i++){
            books[i]= new Book("");
            amount[i]=0;
        }
    }
    public void add(String name, int x){
        int i=0;
        while(books[i].title!=""&&books[i].title!=name&&i<20){
            i++;
        }
        if(i==20){
            System.out.println("Not enough space in inventory");
        }
        else if(books[i].title==""){
            books[i].title=name;
            amount[i]=x;
            check_inventory(i);
        }
        else{
            amount[i]+=x;
            check_inventory(i);
        }
    }
    public void remove(String name, int x){
        int i=0;
        while(books[i].title!=name&&i<20){
            i++;
        }
        if(i==20){
            System.out.println("Doesn't exist");
        }
        else{
            if(amount[i]-x>=0){
                amount[i]-=x;
                check_inventory(i);
            }
            else{
                System.out.println("Not enough in inventory\ncurrent amount: "+amount[i]);
            }
        }
    }
    void check_inventory(int n){
        if(amount[n]==0)System.out.println("Out of stock");
        else if(amount[n]<10)System.out.println("Small amount left. Might need to order");
        else if(amount[n]>50)System.out.println("More than necessary");
    }
    Book getBook(String name){
        int i=0;
        while(books[i].title!=name&&i<20){
            i++;
        }
        if(i==20){
            System.out.println("Doesn't exist");
            return new Book("");
        }
        else{
            return books[i];
        }
    }
}
