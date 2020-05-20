#include<iostream>
using namespace std;
int main()
{
  int num,r,sume=0,sumo=0;
  std::cin>>num;
  while(num!=0)
  {
    r=num%10;
    if(r%2==0)
    {
      sume=sume+r;
    }
    else if(r%2!=0)
    {
      sumo=sumo+r;
    }
    num=num/10;
  }
  if(sume==sumo)
  {
    std::cout<<"Yes";
  }
  else
  {
    std::cout<<"No";
  }
}