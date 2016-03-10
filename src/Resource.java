import java.util.Calendar;
public class Resource {
	private String identity;
	public void setidentity(String identity)
	{
		this.identity=identity;
	}
	public String getidentity()
	{
		return this.identity;
	}
	private String title;
	public void settitle(String title)
	{
		this.title=title;
	}
	public String gettitle()
	{
		return this.title;
	}
	private String description;
	public void setdescription(String description)
	{
		this.description=description;
	}
	public String getdescription()
	{
		return this.description;
	}
	private String material;
	public void setmaterial(String material)
	{
		this.material=material;
	}
	public String getmaterial()
	{
		return this.material;
	}
	private String responsible;
	public void setresponsible(String responsible)
	{
		this.responsible=responsible;
	}
	public String getresponsible()
	{
		return this.responsible;
	}
	private String activity;
	public void setactivity(String activity)
	{
		this.activity=activity;
	}
	public String getactivity()
	{
		return this.activity;
	}
	Calendar date_of_start=Calendar.getInstance();
	Calendar date_of_end=Calendar.getInstance();
	public void setyearstart(int n)
	{
		date_of_start.set(Calendar.YEAR,n);
	}
	public int getyearstart()
	{
		return date_of_start.get(Calendar.YEAR);
	}
	public void setmonthstart(int n)
	{
		if(n==1)
		{
			date_of_start.set(Calendar.MONTH,Calendar.JANUARY); 
		}
		else if(n==2)
		{
			date_of_start.set(Calendar.MONTH,Calendar.FEBRUARY);
		}
		else if(n==3)
		{
			date_of_start.set(Calendar.MONTH,Calendar.MARCH);
		}
		else if(n==4)
		{
			date_of_start.set(Calendar.MONTH,Calendar.APRIL);
		}
		else if(n==5)
		{
			date_of_start.set(Calendar.MONTH,Calendar.MAY);
		}
		else if(n==6)
		{
			date_of_start.set(Calendar.MONTH,Calendar.JUNE);
		}
		else if(n==7)
		{
			date_of_start.set(Calendar.MONTH,Calendar.JULY);
		}
		else if(n==8)
		{
			date_of_start.set(Calendar.MONTH,Calendar.AUGUST);
		}
		else if(n==9)
		{
			date_of_start.set(Calendar.MONTH,Calendar.SEPTEMBER);
		}
		else if(n==10)
		{
			date_of_start.set(Calendar.MONTH,Calendar.OCTOBER);
		}
		else if(n==11)
		{
			date_of_start.set(Calendar.MONTH,Calendar.NOVEMBER);
		}
		else if(n==12)
		{
			date_of_start.set(Calendar.MONTH,Calendar.DECEMBER);
		}
	}
	public int getmonthstart()
	{
		return date_of_start.get(Calendar.MONTH);
	}
	public void setdaystart(int n)
	{
		date_of_start.set(Calendar.DAY_OF_MONTH,n); 
	}
	public int getdaytart()
	{
		return date_of_start.get(Calendar.DAY_OF_MONTH);
	}
	public void sethourstart(int n)
	{
		date_of_start.set(Calendar.HOUR_OF_DAY,n);
	}
	public int gethourstart()
	{
		return date_of_start.get(Calendar.HOUR_OF_DAY);
	}
	public void setyearend(int n)
	{
		date_of_end.set(Calendar.YEAR,n);
	}
	public int getyearend()
	{
		return date_of_end.get(Calendar.YEAR);
	}
	public void setmonthend(int n)
	{
		if(n==1)
		{
			date_of_end.set(Calendar.MONTH,Calendar.JANUARY); 
		}
		else if(n==2)
		{
			date_of_end.set(Calendar.MONTH,Calendar.FEBRUARY);
		}
		else if(n==3)
		{
			date_of_end.set(Calendar.MONTH,Calendar.MARCH);
		}
		else if(n==4)
		{
			date_of_end.set(Calendar.MONTH,Calendar.APRIL);
		}
		else if(n==5)
		{
			date_of_end.set(Calendar.MONTH,Calendar.MAY);
		}
		else if(n==6)
		{
			date_of_end.set(Calendar.MONTH,Calendar.JUNE);
		}
		else if(n==7)
		{
			date_of_end.set(Calendar.MONTH,Calendar.JULY);
		}
		else if(n==8)
		{
			date_of_end.set(Calendar.MONTH,Calendar.AUGUST);
		}
		else if(n==9)
		{
			date_of_end.set(Calendar.MONTH,Calendar.SEPTEMBER);
		}
		else if(n==10)
		{
			date_of_end.set(Calendar.MONTH,Calendar.OCTOBER);
		}
		else if(n==11)
		{
			date_of_end.set(Calendar.MONTH,Calendar.NOVEMBER);
		}
		else if(n==12)
		{
			date_of_end.set(Calendar.MONTH,Calendar.DECEMBER);
		}
	}
	public int getmonthend()
	{
		return date_of_end.get(Calendar.MONTH);
	}
	public void setdayend(int n)
	{
		date_of_end.set(Calendar.DAY_OF_MONTH,n); 
	}
	public int getdayend()
	{
		return date_of_end.get(Calendar.DAY_OF_MONTH);
	}
	public void sethourend(int n)
	{
		date_of_end.set(Calendar.HOUR_OF_DAY,n);
	}
	public int gethourend()
	{
		return date_of_end.get(Calendar.HOUR_OF_DAY);
	}
}
