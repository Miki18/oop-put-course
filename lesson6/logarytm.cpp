#include "Logarithm.h"
#include "cmath"
#include <iostream>

using namespace std;

// Before refactor
double Logarithm::doubleValue() {
	try{
		if (log(this->base)==0 or argument==0)
		{
			cout<<"hello"<<endl;
			throw "log(Base) or log(Argument) is equal 0!";
		}
		else
		{
			return log(this->argument) / log(this->base);      //count logarithm (that base)	
		}
	}
	catch (const char* message) {
		cout << message << endl;
	}
}

Logarithm::Logarithm(double inputBase, double inputArgument) {
  this->base = inputBase;
  cout<<base<<" base"<<endl;
  this->argument = inputArgument;
  cout<<argument<<" argument"<<endl;
}

main()
{
	cout<<"Insert a"<<endl;
	double a;
	cin>>a;
	cout<<"Insert b"<<endl;
	double b;
	cin>>b;
	Logarithm log(a, b);
	cout<<log.doubleValue();
}
