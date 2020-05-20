#include<iostream>
using namespace std;
int main()
{
  int month,i,c,a,b,s[20];
  std::cin>>month;
  a=0;
  b=1;
  s[1]=0;
  s[2]=1;
  for(i=3;i<=month;i++)
  {
    c=a+b;
    s[i]=c;
    a=b;
    b=c;;
  }
  std::cout<<s[month];
}