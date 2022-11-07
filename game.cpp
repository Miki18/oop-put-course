#include <iostream>

using namespace std;

class authors
{
	private:
		string studio_name;
		string studio_CEO;
		int studio_create_year;
	public:
		authors()
		{
			//
		}
		authors(string a, string b, int c)
		{
			studio_name = a;
			studio_CEO = b;
			studio_create_year = c;
		}
		authors_read()
		{
			cout<<"Studio name: "<<studio_name<<endl;
			cout<<"Studio CEO: "<<studio_CEO<<endl;
			cout<<"Studio create year: "<<studio_create_year<<endl;
		}	
};

class game
{
	private:
		string title;
		string genre;
		int release_year;
		authors studio;
	public:
		game(authors aut, string a, string b, int c)
		{
			studio = aut;
			title = a;
			genre = b;
			release_year = c;
		}
		game_read()
		{
			cout<<"Game title: "<<title<<endl;
			cout<<"Genre: "<<genre<<endl;
			cout<<"Release year: "<<release_year<<endl;
			cout<<" "<<endl;
			studio.authors_read();
		}
};

int main()
{
	authors studio("CD Project Red", "Adam Kicinski", 1994);
	game witcher(studio, "The Witcher 3", "RPG", 2016);
	witcher.game_read();
}
