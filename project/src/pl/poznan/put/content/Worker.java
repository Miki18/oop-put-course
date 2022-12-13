package test;

import java.util.Scanner;

public class Worker implements cleaning {
	private String name;
	private String surname;
	private int number_id;
	private String status;
	public Worker()
	{
		name = "unnamed worker";
		surname = "unsurnamed worker";
		number_id = 0;
		status = "unemployed";
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
		System.out.println("Insert name");
		Scanner scan = new Scanner(System.in);
		name = scan .nextLine();
		System.out.println("Insert surname");
		surname = scan .nextLine();
		number_id = id;
		System.out.println("Insert status");
		status = scan .nextLine();
		
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
