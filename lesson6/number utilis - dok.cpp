#include <iostream>

using namespace std;

class NumberUtils
{
	private:
		int a;
		int b;
	public:
		NumberUtils(int p, int d)
		{
			a = p;
			b = d;
		}
		maximum()
		{
			if(a > b)
			{
				cout<<a<<endl;
			}
			else
			{
				cout<<b<<endl;
			}
		}
		minimum()
		{
			if(a < b)
			{
				cout<<a<<endl;
			}
			else
			{
				cout<<b<<endl;
			}
		}
		average()
		{
			int c = (a+b) / 2;
			cout<<c<<endl;
		}
};

int main()
{
	int p;
	int d;
	cout<<"Insert first number:"<<endl;
	cin>>p;
	cout<<"Insert second number:"<<endl;
	cin>>d;
	NumberUtils cpp(p, d);
	cpp.maximum();
	cpp.minimum();
	cpp.average();
}
