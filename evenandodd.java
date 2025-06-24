public class evenandodd 
{
    public static void main(String[] args) 
    {
        int count=0;
        int count1=0;
        int arr[]={1,2,3,4,5};
        for(int i=0;i<5;i++)
        {
            if(arr[i]%2==0)
            {
             count++;   
            }
            else{
                count1++;
            }
        }
        System.out.println("no of even:"+ count);
        System.out.println("no of odd:"+ count1);
    }
    
}
