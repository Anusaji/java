import java.util.Scanner;

class Sort
{

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        int i,j;

        System.out.println("Enter the array elements : ");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("Array before sorting : ");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]+ "  ");
        }


        int temp;

        System.out.println("Array after sorting : ");

        for (i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {

                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
                
            }
        }

        for(i=0;i<n;i++)
        {
            System.out.println(a[i]+ "  ");
        }

    }
     

}