#include <iostream>
#include <string>

using namespace std;

class Shiritori
{
	private:
		string T[100];  //words limit
		int limit = 0;     //to control words limit
		bool GO = false;           //short of Game Over;
		CheckDup()
		{
			for(int i = 0; i < limit; i++)
			{
				if(T[i] == T[limit])
				{
					cout<<"The word '"<< T[limit] << "' is duplicated!"<<endl;
					cout<<"Game over!"<<endl;	
					cout<<""<<endl;
					cout<<"Do you want to restart the game?"<<endl;
					cout<<"Type 0 if you don't want or 1 if you want"<<endl;
					int R;
					cin>> R;
					if(R == 1)
					{
						limit = 0;
						GO = true;
						system("CLS");
						cout<<"Write a words"<<endl;
					}
					else
					{
						exit(0);
					}
				}
			}
		}
		CheckLetter()
		{
			int size = T[limit-1].size();  //I need to take previous and this word to take from these words first and last letter and compare them
			string prevword = T[limit-1];   //I can't do one big if for that - I tried
			char prevlitter = prevword[size-1];
			string thisword = T[limit];
			char thislitter = thisword[0];
			//cout<<prevlitter<<endl;
			//cout<<thislitter<<endl;
			if(prevlitter != thislitter)
			{
				cout<<"The first letter of word '" << T[limit] << "' is not the same letter as word '"<< T[limit -1] <<"'."<<endl;
				cout<<"Game over!"<<endl;
				cout<<""<<endl;
				cout<<"Do you want to restart the game?"<<endl;
				cout<<"Type 0 if you don't want or 1 if you want"<<endl;
				int R;
				cin>> R;
				if(R == 1)
				{
					limit = 0;
					GO = true;
					system("CLS");
					cout<<"Write a words"<<endl;
				}
				else
				{
					exit(0);
				}
			}
		}
		WriteWords()
		{
			for(int i = 0; i<=limit; i++)
			{
				cout<<T[i]<<", ";
			}
			cout<<endl;
		}
	public:
		Shiritori_Add(string gword)
		{
			T[limit] = gword;       //gword -> given word
			//cout<<T[limit]<<endl;
			if(limit > 0)    //no reason to check the first word
			{
				CheckLetter();
				CheckDup();	
			}
			if(GO == false)
			{
				WriteWords();
				limit++;	
			}
			else
			{
				GO = false;
			}
		}
};

int main()
{
	Shiritori Game;
	string word;
	cout<<"Write a words"<<endl;
	while(true)
	{
		cin>>word;
		Game.Shiritori_Add(word);	
	}
}
