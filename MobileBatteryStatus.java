
import java.util.Scanner;
class MobileBatteryStatus
{
public static void main(String args[])
{
int power;	
Scanner sc = new Scanner(System.in);
System.out.print("Enter the Battery Percentage:");
power=sc.nextInt();

if (power >= 80)
{
	
	System.out.println("Battery Full");
}	
else if ((power >= 30)&&(power <= 79))
{
	
	System.out.println("Battery Normal");
}	
else
{
	
	System.out.println("Low Battery.Charge Now");
}
sc.close();
}
}	