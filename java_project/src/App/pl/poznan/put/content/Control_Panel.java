package App.pl.poznan.put.content;

import java.util.Scanner;

public class Control_Panel {
	public void Control()
	{
		Scanner scan = new Scanner(System.in);;
		System.out.println("How many people work in your company?");
		int l;
		l=scan.nextInt();
		Worker[] arr;
		arr = new Worker[l];
		int choice;
		System.out.println("Do you want to fill the data base automatically?");
		System.out.println("1. Yes");
		System.out.println("2. No");
		do
		{
			choice = scan.nextInt();
			scan.nextLine();
			if(choice < 1 || choice > 2)
			{
				System.out.println("This option doesn't exist!");
				System.out.println("Please type 1 or 2.");
			}
		}while(choice < 1 || choice > 2);
		if(choice == 1)
		{
			System.out.println("What do you want to fill?");
			System.out.println("1. Nothing");
			System.out.println("2. Only name and surname");
			System.out.println("3. Only status");
			System.out.println("4. Name, surname and status");
			do
			{
				choice = scan.nextInt();
				scan.nextLine();
				if(choice < 1 || choice > 4)
				{
					System.out.println("This option doesn't exist!");
					System.out.println("Please type 1, 2, 3 or 4.");
				}
			}while(choice < 1 || choice > 4);
			if(choice == 1)
			{
				for(int i=0; i<l; i++)
				{
					arr[i] = new Worker ();
				}
				choice = 100;
			}
			else if(choice == 2)
			{
				String pre_name;
				String pre_surname;
				System.out.println("Insert name:");
				pre_name = scan .nextLine();
				System.out.println("Insert surname");
				pre_surname = scan .nextLine();
				for(int i=0; i<l; i++)
				{
					arr[i] = new Worker (pre_name, pre_surname);
				}
			}
			else if(choice == 3 || choice ==4)
			{
				String pre_name;
				String pre_surname;
				int pre_id = 0;
				String pre_status;
				if(choice == 4)
				{
					System.out.println("Insert name:");
					pre_name = scan .nextLine();
					System.out.println("Insert surname:");
					pre_surname = scan .nextLine();
				}
				else
				{
					pre_name = "unnamed";
					pre_surname = "unsurnmed";
				}
				System.out.println("Insert status:");
				pre_status = scan.nextLine();
				for(int i=0; i<l; i++)
				{
					arr[i] = new Worker (pre_name, pre_surname, pre_id, pre_status);
				}
			}
		}
		else
		{
			for(int i=0; i<l; i++)
			{
				arr[i] = new Worker ();
			}
		}
		int controlling = 0;
		while(true)
		{
			System.out.println("What do you want to do?");
			System.out.println("1. Show database");
			System.out.println("2. Edit database");
			System.out.println("3. Exit system");
			do
			{
				choice = scan.nextInt();
				scan.nextLine();
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
						scan.nextLine();
						if(choice < 1 || choice > 2)
						{
							System.out.println("This option doesn't exist!");
							System.out.println("Please type 1 or 2.");
						}
					}while(choice < 1 || choice > 2);
					
					if(choice==1)
					{
						for(int i=0; i<l; i++)
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
								scan.nextLine();
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
					scan.nextLine();
					if(choice < 1 || choice > 2)
					{
						System.out.println("This option doesn't exist!");
						System.out.println("Please type 1 or 2.");
					}
				}while(choice < 1 || choice > 2);
				
				if(choice == 1)
				{
					int help;
					help = controlling;
					System.out.println(help);
					if(controlling < l)
					{
						controlling = controlling + 1;
						arr[controlling-1].Add(controlling);
					}
					else
					{
						System.out.println("Database is full!");
					}
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
						scan.nextLine();
						if(choice > controlling || choice < 1)
						{
							System.out.println("There is no " + choice + " ID!");
						}
						else
						{
							for(int i = choice-1; i<l-1; i++)
							{
								arr[i] = arr[i+1];
								arr[i].ChangeID(i);
							}
							arr[l-1].Clean();
						}
						choice = 0;
						controlling = controlling - 1;
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