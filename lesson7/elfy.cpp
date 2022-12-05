#include <iostream>
#include <fstream>
#include <string>

using namespace std;

class elf
{
	private:
	int calories=0;
	public:
	add_calories(int food)
	{
		calories = 	food + calories;
	}
	show_calories()
	{
		cout<<calories<<endl;
	}
	get_calories()
	{
		return calories;
	}	
};

int main()
{
	fstream file;
	file.open("Day01.txt", ios::in);
	if(file.good()==false)
	{
		cout<<"Something is really bad.";
		exit(0);
	}
	
	elf n[1000];
	int count = 0;
	int cal;
	int most_cal_elf=0;
	int now_cal=0;
	
	string line;
	while(getline(file, line))
	{
		if(line=="")
		{
			if(cout==0)
			{
				most_cal_elf = 0;
			}
			else
			{
				now_cal=n[count].get_calories();
				if(now_cal > n[most_cal_elf].get_calories())
				{
					most_cal_elf = count;
				}	
			}
			count = count+1;
		}
		else
		{
			cal = stoi(line);
			n[count].add_calories(cal);
			//n[count].show_calories();
		}
	}
	cout<<most_cal_elf<<" is carrying the most calories - "<<n[most_cal_elf].get_calories()<<" ."<<endl;
}
