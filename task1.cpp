#include <iostream>

using namespace std;

class computer
{
public:
    int Ram;
    string GPU;
    string CPU;
    string color;
};

class human
{
public:    
    int age;
    int height;
    int weight;
    string name;
    string surname;
};


int main()
{
    computer dell;
    dell.Ram = 100;
    dell.GPU = "NvidiaGeForce980x";
    dell.CPU = "intelcore_i5";
    dell.color = "black";
    computer asus;
    asus.Ram = 200;
    asus.GPU = "NvidiaRTX3060";
    asus.CPU = "intelcore_i9";
    asus.color = "black_red";
    human Mikolaj;
    Mikolaj.age = 20;
    Mikolaj.height = 179;
    Mikolaj.weight = 60;
    Mikolaj.name = "Mikolaj";
    Mikolaj.surname = "Adamczak";
    return 0;
}
