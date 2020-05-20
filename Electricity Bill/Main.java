#include<iostream>
using namespace std;
int main()
{
  float units,cost;
  std::cin>>units;
  if(units<=200)
  {
    cost=units*0.5;
  }
  else if(units<=400)
  {
    cost=(units*0.65)+100;
  }
  else if(units<=600)
  {
    cost=(units*0.80)+200;
  }
  else
  {
    cost=(units*1.25)+425;
  }
  std::cout<<"Rs."<<(int)cost;
}