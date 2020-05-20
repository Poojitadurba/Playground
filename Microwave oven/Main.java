#include<iostream>
using namespace std;
int main()
{
  int items;
  float heatingtime,heat;
  std::cin>>items;
  std::cin>>heatingtime;
  switch(items)
  {
    case 2:heat=heatingtime+(0.5*heatingtime);
           std::cout<<heat;
      break;
    case 3:heat=2*heatingtime;
           std::cout<<heat;
      break;
    default:std::cout<<"Number of items is more";
      break;
  }
}