import java.util.ArrayList;
import java.util.Scanner;
import java.util.Calendar;
import java.text.DateFormat;
import java.util.Date;
public class Main {
	public static void main(String[] args)
	{
		ArrayList<Person> list_of_users= new ArrayList<Person>();
		ArrayList<Resource> list_of_resources= new ArrayList<Resource>();
		Calendar actual_date=Calendar.getInstance();
		actual_date.set(2016,Calendar.JANUARY,01);
		actual_date.set(Calendar.HOUR_OF_DAY,1);
		DateFormat formatdate = DateFormat.getDateInstance();
		Date date=actual_date.getTime();
		Scanner user_input=new Scanner(System.in);
		int n;
		n=1;
		String m;
		int number_of_users,number_of_normalclass,number_of_presentation,number_of_labclass,number_of_booked_resources;
		number_of_users=0;
		number_of_normalclass=0;
		number_of_presentation=0;
		number_of_labclass=0;
		number_of_booked_resources=0;
		while(n!=0)
		{
			date=actual_date.getTime();
			System.out.println("Date:"+formatdate.format(date));
			System.out.println("Hour:"+actual_date.get(Calendar.HOUR_OF_DAY));
			System.out.println("Choose an option:");
			System.out.println("1-Add a new user");
			System.out.println("2-Search");
			System.out.println("3-Book a resource");
			System.out.println("4-Change date and hour");
			System.out.println("5-Numbers");
			System.out.println("0-Terminate program");
			n = user_input.nextInt();
			if(n==1)
			{
				System.out.println("Which type of user is he/she?:");
				System.out.println("1-Teacher");
				System.out.println("2-Researcher");
				System.out.println("3-Graduation Student");
				System.out.println("4-Mastering Student");
				System.out.println("5-PhD Student");
				n = user_input.nextInt();
				if(n==1)
				{
					Teacher teacher=new Teacher();
					System.out.println("Enter a name:");
					teacher.setname(user_input.next());
					System.out.println("Enter an email:");
					teacher.setemail(user_input.next());
					list_of_users.add(teacher);
				}
				else if(n==2)
				{
					Researcher researcher=new Researcher();
					System.out.println("Enter a name:");
					researcher.setname(user_input.next());
					System.out.println("Enter an email:");
					researcher.setemail(user_input.next());
					list_of_users.add(researcher);
				}
				else if(n==3)
				{
					Graduation_Student graduation_student=new Graduation_Student();
					System.out.println("Enter a name:");
					graduation_student.setname(user_input.next());
					System.out.println("Enter an email:");
					graduation_student.setemail(user_input.next());
					list_of_users.add(graduation_student);
				}
				else if(n==4)
				{
					Mastering_Student mastering_student=new Mastering_Student();
					System.out.println("Enter a name:");
					mastering_student.setname(user_input.next());
					System.out.println("Enter an email:");
					mastering_student.setemail(user_input.next());
					list_of_users.add(mastering_student);
				}
				else if(n==5)
				{
					PhD_Student phd_student=new PhD_Student();
					System.out.println("Enter a name:");
					phd_student.setname(user_input.next());
					System.out.println("Enter an email:");
					phd_student.setemail(user_input.next());
					list_of_users.add(phd_student);
				}
				number_of_users++;
			}
			else if(n==2)
			{
				System.out.println("1-For an user");
				System.out.println("2-For a resource");
				n = user_input.nextInt();
				if(n==1)
				{
					System.out.println("Type the name of the user:");
					m=user_input.next();
					for(int i=0;i<list_of_users.size();i++)
					{
						if(list_of_users.get(i).getname().equals(m))
						{
							System.out.println("User found,showing his/her information");
							System.out.println("Name:"+list_of_users.get(i).getname());
							System.out.println("Email:"+list_of_users.get(i).getemail());
							System.out.println("Ocupation:"+list_of_users.get(i).getocupation());
							System.out.print("History of booked resources:");
							list_of_users.get(i).print_history_of_booked_resources();
						}
					}
				}
				else if(n==2)
				{
					System.out.println("Type the name of the resource:");
					m=user_input.next();
					for(int i=0;i<list_of_resources.size();i++)
					{
						if(list_of_resources.get(i).getidentity().equals(m))
						{
							System.out.println("Resource found,showing information about the responsible");
							m=list_of_resources.get(i).getresponsible();
							System.out.println("Name:"+m);
							for(int h=0;h<list_of_users.size();h++)
							{
								if(list_of_users.get(i).getname().equals(m))
								{
									System.out.println("Email:"+list_of_users.get(i).getemail());
									System.out.println("Ocupation:"+list_of_users.get(i).getocupation());
									System.out.print("History of booked resources:");
									list_of_users.get(i).print_history_of_booked_resources();
								}
							}
						}
					}
				}
			}
			else if(n==3)
			{
				System.out.println("Type your name to see if you are a valid user");
				m=user_input.next();
				for(int i=0;i<list_of_users.size();i++)
				{
					if(list_of_users.get(i).getname().equals(m))
					{
						System.out.println("Welcome "+m);
						System.out.println("Which resource you want to book?");
						System.out.println("1-Classroom");
						System.out.println("2-Laboratory");
						System.out.println("3-Auditorium");
						n = user_input.nextInt();
						if(list_of_users.get(i).getresponsibility())
						{
							if(n==1)
							{
								Classroom classroom=new Classroom();
								System.out.println("Name of classroom:");
								m=user_input.next();
								classroom.setidentity(m);
								classroom.setresponsible(list_of_users.get(i).getname());
								list_of_users.get(i).add_history_of_booked_resources(classroom);
								System.out.println("Year of start:");
								n = user_input.nextInt();
								classroom.setyearstart(n);
								System.out.println("Month of start:");
								n = user_input.nextInt();
								classroom.setmonthstart(n);
								System.out.println("Day of start:");
								n = user_input.nextInt();
								classroom.setdaystart(n);
								System.out.println("Hour of start:");
								n = user_input.nextInt();
								classroom.sethourstart(n);
								System.out.println("Year of end:");
								n = user_input.nextInt();
								classroom.setyearend(n);
								System.out.println("Month of end:");
								n = user_input.nextInt();
								classroom.setmonthend(n);
								System.out.println("Day of end:");
								n = user_input.nextInt();
								classroom.setdayend(n);
								System.out.println("Hour of end:");
								n = user_input.nextInt();
								classroom.sethourend(n);
								System.out.println("Which activity are you planning?");
								System.out.println("1-A normal class");
								System.out.println("2-A presentation");
								System.out.println("3-A laboratory class");
								n = user_input.nextInt();
								if(n==1 && list_of_users.get(i).getocupation()=="Teacher")
								{
									classroom.setactivity("Normal class");
									number_of_normalclass++;
								}
								else if(n==2)
								{
									classroom.setactivity("Presentation");
									number_of_presentation++;
								}
								else if(n==3 && list_of_users.get(i).getocupation()=="Teacher")
								{
									classroom.setactivity("Laboratory class");
									number_of_labclass++;
								}
								number_of_booked_resources++;
								list_of_resources.add(classroom);
							}
							else if(n==2)
							{
								Laboratory laboratory=new Laboratory();
								System.out.println("Name of laboratory:");
								m=user_input.next();
								laboratory.setidentity(m);
								laboratory.setresponsible(list_of_users.get(i).getname());
								list_of_users.get(i).add_history_of_booked_resources(laboratory);
								System.out.println("Year of start:");
								n = user_input.nextInt();
								laboratory.setyearstart(n);
								System.out.println("Month of start:");
								n = user_input.nextInt();
								laboratory.setmonthstart(n);
								System.out.println("Day of start:");
								n = user_input.nextInt();
								laboratory.setdaystart(n);
								System.out.println("Hour of start:");
								n = user_input.nextInt();
								laboratory.sethourstart(n);
								System.out.println("Year of end:");
								n = user_input.nextInt();
								laboratory.setyearend(n);
								System.out.println("Month of end:");
								n = user_input.nextInt();
								laboratory.setmonthend(n);
								System.out.println("Day of end:");
								n = user_input.nextInt();
								laboratory.setdayend(n);
								System.out.println("Hour of end:");
								n = user_input.nextInt();
								laboratory.sethourend(n);
								System.out.println("Which activity are you planning?");
								System.out.println("1-A normal class");
								System.out.println("2-A presentation");
								System.out.println("3-A laboratory class");
								n = user_input.nextInt();
								if(n==1 && list_of_users.get(i).getocupation()=="Teacher")
								{
									laboratory.setactivity("Normal class");
									number_of_normalclass++;
								}
								else if(n==2)
								{
									laboratory.setactivity("Presentation");
									number_of_presentation++;
								}
								else if(n==3 && list_of_users.get(i).getocupation()=="Teacher")
								{
									laboratory.setactivity("Laboratory class");
									number_of_labclass++;
								}
								number_of_booked_resources++;
								list_of_resources.add(laboratory);
							}
							else if(n==3)
							{
								Auditorium auditorium=new Auditorium();
								System.out.println("Name of auditorium:");
								m=user_input.next();
								auditorium.setidentity(m);
								auditorium.setresponsible(list_of_users.get(i).getname());
								list_of_users.get(i).add_history_of_booked_resources(auditorium);
								System.out.println("Year of start:");
								n = user_input.nextInt();
								auditorium.setyearstart(n);
								System.out.println("Month of start:");
								n = user_input.nextInt();
								auditorium.setmonthstart(n);
								System.out.println("Day of start:");
								n = user_input.nextInt();
								auditorium.setdaystart(n);
								System.out.println("Hour of start:");
								n = user_input.nextInt();
								auditorium.sethourstart(n);
								System.out.println("Year of end:");
								n = user_input.nextInt();
								auditorium.setyearend(n);
								System.out.println("Month of end:");
								n = user_input.nextInt();
								auditorium.setmonthend(n);
								System.out.println("Day of end:");
								n = user_input.nextInt();
								auditorium.setdayend(n);
								System.out.println("Hour of end:");
								n = user_input.nextInt();
								auditorium.sethourend(n);
								System.out.println("Which activity are you planning?");
								System.out.println("1-A normal class");
								System.out.println("2-A presentation");
								System.out.println("3-A laboratory class");
								n = user_input.nextInt();
								if(n==1 && list_of_users.get(i).getocupation()=="Teacher")
								{
									auditorium.setactivity("Normal class");
									number_of_normalclass++;
								}
								else if(n==2)
								{
									auditorium.setactivity("Presentation");
									number_of_presentation++;
								}
								else if(n==3 && list_of_users.get(i).getocupation()=="Teacher")
								{
									auditorium.setactivity("Laboratory class");
									number_of_labclass++;
								}
								number_of_booked_resources++;
								list_of_resources.add(auditorium);
							}
						}
						else
						{
							System.out.println("This user can't book a resource");
						}
					}
				}
			}
			else if(n==4)
			{
				System.out.println("New year:");
				n = user_input.nextInt();
				actual_date.set(Calendar.YEAR,n);
				System.out.println("New month");
				n = user_input.nextInt();
				if(n==1)
				{
					actual_date.set(Calendar.MONTH,Calendar.JANUARY); 
				}
				else if(n==2)
				{
					actual_date.set(Calendar.MONTH,Calendar.FEBRUARY);
				}
				else if(n==3)
				{
					actual_date.set(Calendar.MONTH,Calendar.MARCH);
				}
				else if(n==4)
				{
					actual_date.set(Calendar.MONTH,Calendar.APRIL);
				}
				else if(n==5)
				{
					actual_date.set(Calendar.MONTH,Calendar.MAY);
				}
				else if(n==6)
				{
					actual_date.set(Calendar.MONTH,Calendar.JUNE);
				}
				else if(n==7)
				{
					actual_date.set(Calendar.MONTH,Calendar.JULY);
				}
				else if(n==8)
				{
					actual_date.set(Calendar.MONTH,Calendar.AUGUST);
				}
				else if(n==9)
				{
					actual_date.set(Calendar.MONTH,Calendar.SEPTEMBER);
				}
				else if(n==10)
				{
					actual_date.set(Calendar.MONTH,Calendar.OCTOBER);
				}
				else if(n==11)
				{
					actual_date.set(Calendar.MONTH,Calendar.NOVEMBER);
				}
				else if(n==12)
				{
					actual_date.set(Calendar.MONTH,Calendar.DECEMBER);
				}
				System.out.println("New day");
				n = user_input.nextInt();
				actual_date.set(Calendar.DAY_OF_MONTH,n);
				System.out.println("New hour");
				n = user_input.nextInt();
				actual_date.set(Calendar.HOUR_OF_DAY,n);
			}
			else if(n==5)
			{
				System.out.println("Number of users:"+number_of_users);
				System.out.println("Number of normal classes:"+number_of_normalclass);
				System.out.println("Number of presentations:"+number_of_presentation);
				System.out.println("Number of laboratory classes:"+number_of_labclass);
				System.out.println("Number of booked resources:"+number_of_booked_resources);
			}
		}
		user_input.close();
	}
}
