#include<iostream>
int main()
{
  int n,x,i,k;
  std::cin>>n;
  x=6;
  i=5;
  k=1;
  while(n--)
  {
    std::cout<<x<<" ";
    x=x+i;
    k++;
    i=5*k;
  }
}