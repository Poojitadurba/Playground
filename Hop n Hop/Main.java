#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int x,y;
  std::cin>>x;
  std::cin>>y;
  int sol=((x-3)*(x-3))+((y-4)*(y-4));
  int steps=sqrt(sol);
  std::cout<<steps;
  
}