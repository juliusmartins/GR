import java.util.ArrayList;

abstract class Person {
	private String name;
	public String getname()
	{
		return this.name;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	private String email;
	public String getemail()
	{
		return this.email;
	}
	public void setemail(String email)
	{
		this.email=email;
	}
	abstract boolean getresponsibility();
	abstract String getocupation();
	ArrayList<Resource> history_of_booked_resources= new ArrayList<Resource>();
	public void add_history_of_booked_resources(Resource resource)
	{
		history_of_booked_resources.add(resource);
	}
	public void print_history_of_booked_resources()
	{
		for(int i=0;i<history_of_booked_resources.size();i++)
		{
			System.out.println(history_of_booked_resources.get(i).getidentity()+" "+history_of_booked_resources.get(i).getactivity());
		}
	}
}
