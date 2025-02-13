import java.util.Scanner;

public class Product
{
    int ID,price;
    String name;
    Scanner s=new Scanner(System.in);
    Product()
    {
        System.out.println("Product Id : ");
        ID=s.nextInt();
        s.nextLine();
        System.out.println("Name : ");
        name=s.nextLine();
        System.out.println("Price : ");
        price=s.nextInt();
        s.close();
    }
    void display()
    {
        System.out.println("Product Id : " + ID);
        System.out.println("Name : " + name);
        System.out.println("Price : "+ price);
    }
    public static void main(String args[])
    {
        Product p = new Product();
        p.display();
    }
}