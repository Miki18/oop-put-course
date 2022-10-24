#include <iostream>

using namespace std;

class magnet 
{
	private:
		int force;
		int size;
		int weight;
		int price;
	
	public:
		magnet(int a,int b,int c,int d)
		{
			force = a;
			size = b;
			weight = c;
			price = d;
		}
};

class needle
{
	private:
		int lenght;
		int price;
		string type;
	
	public:
		needle(int a, int b, string c)
		{
			lenght = a;
			price = b;
			type = c;
		}
};

int main()
{
	magnet iron(1, 2, 3, 4);
	needle small(1, 2, "type");
}
