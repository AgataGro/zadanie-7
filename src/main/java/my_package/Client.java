package my_package;

public class Client {
    Book favourite;
    boolean is_adult;
    String first_name, last_name;
    public Client(String a, String b, boolean q){
        first_name=a;
        last_name=b;
        is_adult=q;
        System.out.println("Client added");
    }

    public void setFavourite(Book favourite) {
        if(favourite.title!="") {
            this.favourite = favourite;
        }
        else System.out.println("Taka książka nie istnieje");
    }
}
