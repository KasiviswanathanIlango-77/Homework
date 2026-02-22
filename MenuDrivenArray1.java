import java.util.Scanner;
class MenuDrivenArray1
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the array length:");
n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
	System.out.println("Enter the "+i+"index value");
    arr[i]=sc.nextInt();	
}
System.out.println("Menu-Driven Java Program Using arrays");
byte choice;
do
{
	System.out.println("\n--- MENU ---");
    System.out.println("1. Find Maximum");
    System.out.println("2. Find Minimum");
    System.out.println("3. Find Second Maximum");
    System.out.println("4. Find Second Minimum");
    System.out.println("5. Reverse the Array");
    System.out.println("6. Find Average");
	System.out.println("Enter Your Choice");
    choice=sc.nextByte();
	switch(choice)
	{
		case 1:
		int max=arr[0];
		for(int i=0;i<n;i++){
         if(arr[i]>max)
		   max=arr[i];
		 
		} 
		System.out.println("Maximum element in the array:"+max);
		break;
		case 2:
		int min=arr[0];
		for(int i=0;i<n;i++){
         if(arr[i]<min)
		   min=arr[i];
		 
		} 
		System.out.println("Minimum element in the array:"+min);
		break;
		case 3:
		int firstmax=Integer.MIN_VALUE;
        int secondmax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>firstmax)
            {
                secondmax=firstmax;
                firstmax=arr[i];
            }
            else if(arr[i]>secondmax&&arr[i]!=firstmax)
            {
            secondmax=arr[i];
            }
            
        }
        System.out.println("second maximum element:"+secondmax);
		break;
		case 4:
		int firstmin=Integer.MAX_VALUE;
        int secondmin=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<firstmin)
            {
                secondmin=firstmin;
                firstmin=arr[i];
            }
            else if(arr[i]<secondmin&&arr[i]!=firstmin)
            {
            secondmin=arr[i];
            }
            
        }
        System.out.println("second minimum element:"+secondmin);
		break;
		case 5:
		int temp;
        
        for(int i=0;i<arr.length/2;i++)
        {
           temp=arr[i];
           arr[i]=arr[arr.length-1-i];
           arr[arr.length-1-i]=temp;
              
        }
        System.out.println("Reversed Array");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" "); 
        }
		break;
		case 6: 
		int sum=0;
        
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        double average=(double) sum/n;
        System.out.println("Average: "+average);
		break;
		case 7:
		System.out.println("Exit");
		break;
		default:
		System.out.println("Invalid Choice");
	}
}while(choice!=7);
sc.close();
}
}