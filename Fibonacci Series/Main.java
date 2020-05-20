#include<iostream>
int main()
{
  int a,b,c,n;
  int temp;
  std::cin>>n;
  temp=n;
  n=n-2;
  a=0,b=1;
  while(n--)
  {
    c=a+b;
    a=b;
    b=c;
  }
  std::cout<<"The term "<<temp<<" in the fibonacci series is "<<c;
}