class Pattern3
{
	public static void main(String[] args)
	{
		int row= 6;
		for(int i=1;i<=row;i++)
		{
			for(int k=row-i;k>=0;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i-1);j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		 for (int i = row - 1; i >= 1; i--) {
            // Spaces
            for (int k = 1; k <= row - i; k++) {
                System.out.print(" ");
            }
            // Stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
	}
}