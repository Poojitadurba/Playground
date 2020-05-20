#include<iostream>
int main()
{
  int n,i;
  float x;
  std::cin>>n;
  x=0.5,i=1;
  while(n--)
  {
   std::cout<<x<<" ";
    x=x+i;
    i=i*3;
  }
}