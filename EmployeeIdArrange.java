
package advancedjavaapplication;
/*
ids = [15, 8, 3, 12, 9, 6, 1]
 
Output.   [1, 12, 3, 8, 9, 6, 15]
 */
import java.util.Arrays;
public class EmployeeIdArrange {
         
    public static void main(String[] args) {
        int[] ids = {15,8,3,12,9,6,1};
         int n=ids.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(ids[i]%2==1&&ids[j]%2==1)
                {
                if(ids[i]>ids[j])
                {
                    int temp=ids[i];
                    ids[i]=ids[j];
                    ids[j]=temp;
                }
                }
               if(ids[i]%2==0&&ids[j]%2==0)
               {
                if(ids[i]<ids[j])
                {
                    int temp=ids[i];
                    ids[i]=ids[j];
                    ids[j]=temp;
                }
            }
        }
        }
          System.out.println(Arrays.toString(ids));
    }
}
