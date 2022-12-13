package test;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);;
		System.out.println("How many people work in your company?");
		int L;
		L=scan.nextInt();
		Worker[] arr;
		arr = new Worker[L];
		for(int i=0; i<L; i++)
		{
			arr[i] = new Worker();
		}
		int controlling = 0;
		while(true)
		{
			System.out.println("What do you want to do?");
			System.out.println("1. Show database");
			System.out.println("2. Edit database");
			System.out.println("3. Exit system");
			int choice;
			do
			{
				choice = scan.nextInt();
				if(choice < 1 || choice > 3)
				{
					System.out.println("This option doesn't exist!");
					System.out.println("Please type 1, 2 or 3.");
				}
			}while(choice < 1 || choice > 3);
			if(choice == 1)
			{
				if(controlling < 1)
				{
					System.out.println("The database is empty");
				}
				else
				{
					System.out.println("1. Show whole database");
					System.out.println("2. Show one record");
					do
					{
						choice = scan.nextInt();
						if(choice < 1 || choice > 2)
						{
							System.out.println("This option doesn't exist!");
							System.out.println("Please type 1 or 2.");
						}
					}while(choice < 1 || choice > 2);
					
					if(choice==1)
					{
						for(int i=0; i<L; i++)
						{
							arr[i].Read();
						}
					}
					else
					{
						System.out.println("Insert worker ID");
						{
							do
							{
								choice = scan .nextInt();
								if(choice > controlling || choice < 1)
								{
									System.out.println("No worker with that id!");
								}
							}while(choice > controlling || choice < 1);
							arr[choice-1].Read();
							choice = 0;
						}
					}
					choice = 0;
				}
			}
			if(choice == 2)
			{
				System.out.println("1. Add worker");
				System.out.println("2. Delete worker");
				do
				{
					choice = scan.nextInt();
					if(choice < 1 || choice > 2)
					{
						System.out.println("This option doesn't exist!");
						System.out.println("Please type 1 or 2.");
					}
				}while(choice < 1 || choice > 2);
				
				if(choice == 1)
				{
					controlling = controlling + 1;
					arr[controlling-1].Add(controlling);
				}
				if(choice == 2)
				{
					if(controlling == 0)
					{
						System.out.println("No records in the database!");
					}
					else if(controlling == 1)
					{
						arr[0].Clean();
						controlling = 0;
					}
					else
					{
						System.out.println("Insert worker ID to remove from database:");
						choice = scan .nextInt();
						if(choice > controlling || choice < 1)
						{
							System.out.println("There is no " + choice + " ID!");
						}
						else
						{
							for(int i = choice-1; i<L-1; i++)
							{
								arr[i] = arr[i+1];
								arr[i].ChangeID(i);
							}
							arr[L-1].Clean();
						}
						choice = 0;
					}
				}

			}
			if(choice == 3)
			{
				System.exit(0);
			}
		}
		}
}