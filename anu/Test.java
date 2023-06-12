class Product
{
    String pname,pcode;
    double price;

    public void readData(String pc,String pn,double pr)
    {
        pname=pn;
        pcode=pc;
        price=pr;

    }
}

class Test
{
    public static void main(String [] args)
    {
        Product p1=new Product();
        Product p2=new Product();
        Product p3=new Product();

        p1.readData("aaa","cola",123);
        p2.readData("bbb","pepsi",456);
        p3.readData("ccc","maaza",545);

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