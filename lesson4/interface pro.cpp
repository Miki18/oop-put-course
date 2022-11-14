#include <iostream>

using namespace std;

class price
{
	virtual int payment() = 0;
};

class shop: public price
{
	private:
		int apple_number;
		int pear_number;
		int apple = 3;
		int pear = 2;
	public:
		shop(int a, int b)
		{
			apple_number = a;
			pear_number = b;	
		}
		int payment()
		{
			int h;
			h = 3*apple_number + 2*pear_number;
			cout<<h;
		}		
};

int main()
{
	shop biedronka(2, 3);
	biedronka.payment();
}
