package App.pl.poznan.put.content;

import java.util.Scanner;

public class Worker implements Cleaning {
	private String name;
	private String surname;
	private int number_id;
	private String status;
	public Worker(String name, String surname)
	{
		this.name = name;
		this.surname = surname;
		number_id = 0;
		status = "unemployed";
	}
	public Worker()
	{
		name = "unnamed";
		surname = "unsurnamed";
		number_id = 0;
		status = "unemployed";
	}
	public Worker(String name, String surname, int number_id, String status)
	{
		this.name = name;
		this.surname = surname;
		number_id = 0;
		this.status = status;
	}
	public void Read()
	{
		System.out.println(name);
		System.out.println(surname);
		System.out.println(number_id);
		System.out.println(status);
		System.out.println("");
	}
	public void Add(int id)
	{
		String buf;
		System.out.println("Insert name");
		Scanner scan = new Scanner(System.in);
		buf = scan .nextLine();
		if(buf.equals(""))
		{
			//
		}
		else
		{
			name = buf;
		}
		System.out.println("Insert surname");
		buf = scan .nextLine();
		if(buf.equals(""))
		{
			//
		}
		else
		{
			surname = buf;
		}
		number_id = id;
		System.out.println("Insert status");
		buf = scan .nextLine();
		if(buf.equals(""))
		{
			//
		}
		else
		{
			status = buf;
		}
	}
	public void Clean()
	{
		name = "unnamed worker";
		surname = "unsurnamed worker";
		number_id = 0;
		status = "unemployed";
	}
	public void ChangeID(int id)
	{
		number_id = id+1;
	}
}
