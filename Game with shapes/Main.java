#include<iostream>
using namespace std;
int main()
{
  float r,l,diam;
  std::cin>>r;
  std::cin>>l;
  diam=2*r;
  if(diam<=l)
  {
    std::cout<<"circle can be inside a square";
  }
  else
  {
    if(diam>l)
    std::cout<<"circle cannot be inside a square";
  }
}