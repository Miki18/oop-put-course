#include <iostream>

using namespace std;

class Game
{
	protected:
		int Score;
	public:
	virtual void result()
	{
		cout<<"Give me a score!"<<endl;
		cin>>Score;
	}
};

class FootballGame: public Game
{
	public:
	getScore()
	{
		return Score;
	}
};

class FakeFootballGame: public Game
{
	private:
		int Fake_Score;
	public:
	
	void result()
	{
		cout<<"Give me a fake score!"<<endl;
		cin>>Fake_Score;
	}
	getFakeScore()
	{
		return Fake_Score;
	}
};


int main()
{
	FootballGame FG;
	FakeFootballGame FFG;
	FG.result();
	FFG.result();
	int a, b;
	a = FG.getScore();
	cout<<a<<endl;
	b = FFG.getFakeScore();
	cout<<b<<endl;
	if(a == b)
	{
		cout<<"Fake score is a real score!"<<endl;
	}
	else
	{
		cout<<"Fake score is not a real score!"<<endl;
	}
}
