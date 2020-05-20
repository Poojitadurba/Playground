#include<iostream>
int main()
{
  int a,b;
  std::cin>>a;
  std::cin>>b;
  if(a<b)
  {
    std::cout<<a<<" is smallest number"<<"\n";
  }
  if(a>b)
  {
    std::cout<<b<<" is smallest number"<<"\n";
  }
}