#include<iostream>
using namespace std;
int power(int a,int b)
{
  if(b==0)
  {
    return 1;
  }
  else
  {
  return a*power(a,b-1);
  }
}
int main()
{
  int a,b;
  std::cout<<"Enter the value of a"<<"\n";
  std::cin>>a;
  std::cout<<"Enter the value of n"<<"\n";
  std::cin>>b;
  std::cout<<"The value of "<<a<<" power "<<b<<" is "<<power(a,b);
}
  
