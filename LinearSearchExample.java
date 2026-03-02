// An integer array and a target element are given.
// 👉 Use Linear Search to find the index of the target element.
// 👉 If the element is not found, print -1.

// 2. Sample Input
// 5
// 10 20 30 40 50
// 30

// 3. Sample Output
// Index: 2

class LinearSearchExample
{
	public static void main(String args[])
	{
		int ar[] = {10,20,30,40,50};
		int target=30;
		boolean found=false;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==target)
			{
				found=true;
				System.out.println("The element is found at index "+i);
			}
			
		}
		if(!found)
			{
				System.out.println("-1");
			}
	}
}