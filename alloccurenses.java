
import java.util.*;

public class alloccurenses {
    public static void main(String[] args) {
        int []arr={1,2,3,2,4,2,5};
        int target=2;
        ArrayList<Integer> obj=new ArrayList<>();
        for(int i=0;i<7;i++)
        {
            if(arr[i]!=target)
            {
                obj.add(arr[i]);
            }
        }
        for(int i=0;i<obj.size();i++)
        {
            System.out.print(obj.get(i)+" ");
        }

    }
}
