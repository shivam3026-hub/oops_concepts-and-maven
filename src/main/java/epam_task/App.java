package epam_task;

/**
 * Hello world!
 *
 */
import java.util.*;
interface  Sweets
{

    public int getNumber_of_sweets();

    public String getName();

}
class Chocolates implements Sweets
{
    private int no_of_chocolates;
    private String name;
    public float price;
    Chocolates(){}
    Chocolates(int number,String name)
    {
        this.no_of_chocolates=number;
        this.name=name;
    }
    public int getNumber_of_sweets()
    {
        return no_of_chocolates;
    }
    public void getNumber_of_sweets(String numbers)
    {
        System.out.println("The number of chocolates are :"+ numbers);
    }
    public String getName()
    {
        return name;
    }
    public void setPrice(float price)
    {
        this.price=price;
    }
    public float getPrice()
    {
        return price;
    }

}
class Candies implements Sweets
{
    private int no_of_candies;
    private String name_of_candy;
    private double weight = 5.0;
    Candies(int number,String name)
    {
        this.name_of_candy=name;
        this.no_of_candies=number;    }
    public int getNumber_of_sweets()
    {
        return no_of_candies;
    }
    public double getWeight()
    {
        return weight;
    }
    public String getName()
    {
        return name_of_candy;
    }
}
class DairyMilk extends Chocolates
{

    private int no_of_dairymilk;
    private  int price=10;
    public double weight=20.0;
    DairyMilk(int number)
    {
        this.no_of_dairymilk=number;
    }
    public int getNumber_of_sweets()
    {
        return no_of_dairymilk;
    }
    public int getprice()
    {
        return price;
    }
    public double getWeight()
    {
        return weight;
    }

}
public class App 
{
    public static void main( String[] args )
    {

Chocolates c=new Chocolates(12,"dairymilk");
System.out.println(c.getNumber_of_sweets());
c.getNumber_of_sweets("twelve ");
Chocolates cd=new DairyMilk(6);
DairyMilk dairy=new DairyMilk(8);
//overriding
        System.out.println("the number of dairymilk choclates are : "+cd.getNumber_of_sweets());
        System.out.println();
        //accessing the private variables
        System.out.println("total weight of dairymilk chocolates is :"+ dairy.getNumber_of_sweets()*dairy.getWeight());

        Candies candies=new Candies(4,"lollipop");
int d=c.getNumber_of_sweets() + candies.getNumber_of_sweets();
        System.out.println("total weight of candies is :"+ candies.getNumber_of_sweets()*candies.getWeight());
        System.out.println("total number of sweets  are :"+ d );
    }
}
