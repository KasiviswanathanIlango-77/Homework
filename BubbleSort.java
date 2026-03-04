import java.util.Arrays;
class BubbleSort {
    public static void main(String[] args) {
        int ar[]={5,1,4,2,8,3};
        for(int i=0;i<ar.length-1;i++)
        {
            for(int j=0;j<ar.length-1-i;j++)
            {
                if(ar[j]>ar[j+1])
                {
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(ar));
    }
}