#include<iostream>
void swap(int &a,int &b)
{
  int temp;
  temp=a;
  a=b;
  b=temp;
  std::cout<<"After swapping a= "<<a<<" and b="<<b;
}
int main()
{
  int a,b;
  std::cin>>a>>b;
  std::cout<<"Before swapping a= "<<a<<" and b="<<b<<"\n";
  swap(a,b);
}