#include<iostream>
int main()
{
  int n,x;
  std::cin>>n;
  x=11;
  while(n--)
  {
   std::cout<<x*x<<" ";
    x=x+4;
  }
}