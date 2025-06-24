
import java.util.Scanner;

class linearsearch
{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.err.print("target value : ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int z=1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==a)
            {
                z=0;
                System.out.println(i);
                break;
            }
        }
        if(z==1)
        {
            System.out.println("element is not found");
        }
        
    }
    
}
