#include <iostream>
#include <fstream>
#include <string>

using namespace std;

class result
{
	private:
	fight_result=0;
	public:
	add_points(int p)
	{
		fight_result = fight_result + p;	
	}
	get_points()
	{
		cout<<fight_result;	
	}	
};

int main()
{
	fstream file;
	file.open("inputexample.txt", ios::in);
	if(file.good()==false)
	{
		cout<<"Something is wrong!"<<endl;
		exit(0);
	}
	string line;
	
	result match();
	
	while(getline(file,line))
	{
		cout<<line[0]<<" "<<line[2]<<endl;
		if(line[0] == 'A' and line[2]=='X')
		{
			//add points	
		}
		if(line[0] == 'B' and line[2]=='X')
		{
			//add points
		}
		if(line[0] == 'C' and line[2]=='X')
		{
			//add points
		}
		if(line[0] == 'A' and line[2]=='Y')
		{
			//add points
		}
		if(line[0] == 'B' and line[2]=='Y')
		{
			//add points
		}
		if(line[0] == 'C' and line[2]=='Y')
		{
			//add points
		}
		if(line[0] == 'A' and line[2]=='Z')
		{
			//add points
		}
		if(line[0] == 'B' and line[2]=='Z')
		{
			//add points
		}
		if(line[0] == 'C' and line[2]=='Z')
		{
			//add points
		}
	}
	match.get_points();
}
