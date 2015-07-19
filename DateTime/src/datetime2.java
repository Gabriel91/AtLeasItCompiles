import java.util.Date;
import java.text.SimpleDateFormat;

public class datetime2
{
	public static void main(String[] args)
	{
		String dateStart = "07:00:00 AM";//loginTime
		String dateStop = "05:59:59 PM";     //logoutTim// get Date format in AM­PM
SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss a");
Date d1=null;
Date d2=null;
try
{
d1=format.parse(dateStart);
d2=format.parse(dateStop);
//Caluculate Time difference in milli seco
long timeDiff=d2.getTime()-d1.getTime();// Caluculate ours difference
long usedTime=timeDiff/(60 * 60 * 1000) ;
//check time
if(usedTime<12)
{
int timeLeft=(int) (12-usedTime);
System.out.print("You still have"+timeLeft+" hours left");
}
else
{
System.out.print("Please logout");
}
}
catch(Exception e)
{
e.printStackTrace();
}
}
}