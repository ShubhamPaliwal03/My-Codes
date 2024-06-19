import java.util.Scanner;

public class ProblemCClockConversion
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		int t = kb.nextInt();

		while(t-->0)
		{
			String s = kb.next();

			String[] time_in_24_hr_format = s.split(":");

			int hrs = Integer.parseInt(time_in_24_hr_format[0]);

			String half = "";

			if(hrs >= 0 && hrs <= 11)
			{
				half = "AM";
			}
			else
			{
				half = "PM";
			}

			int new_hrs = 0;

			if(hrs == 0)
			{
				new_hrs = 12;
			}
			else if(hrs > 12)
			{
				new_hrs = hrs - 12;
			}
			else
			{
				new_hrs = hrs;
			}

			String hours = "";

			if(new_hrs < 10)
			{
				hours = "0"+String.valueOf(new_hrs);
			}
			else
			{
				hours = String.valueOf(new_hrs);
			}

			String time_in_12_hr_format_string = hours + ":" + time_in_24_hr_format[1] + " " + half;

			System.out.println(time_in_12_hr_format_string);
		}
	}
}