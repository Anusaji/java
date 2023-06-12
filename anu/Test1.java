class Product
{
    String pname,pcode;
    double price;

    Product(String pc,String pn,double pr)
    {        pname=pn;
        pcode=pc;
        price=pr;

    }
}

class Test1
{
    public static void main(String [] args)
    {
        Product p1=new Product("aaa","cola",123);
        Product p2=new Product("bbb","pepsi",456);
        Product p3=new Product("ccc","maaza",545);

      
        if(((p1.price<p2.price) && (p1.price<p3.price)))
        {
            System.out.println("Lowest Price : "+p1.price);
        }

        else if((p2.price<p1.price) && (p2.price<p3.price))
        {
            System.out.println("Lowest Price : "+p2.price);
        }
        else
        {
            System.out.println("Lowest Price : "+p3.price);
        }

    }
}
