#include<iostream>
using namespace std;
int main()
{
  int n,sq,temp,count=0,r,sum,remaining=0,rev=0;
  std::cin>>n;
  sq=n*n;
  temp=n;
  while(temp!=0)
  {
    count++;
    temp=temp/10;
  }
  while(count>0)
  {
    r=sq%10;
    remaining=(remaining*10)+r;
    sq=sq/10;
    count--;
  }
  while(remaining!=0)
  {
    r=remaining%10;
      rev=(rev*10)+r;
    remaining=remaining/10;
  }
  sum=sq+rev;
  //std::cout<<sum<<"\n";
  if(sum==n)
  {
    std::cout<<"Kaprekar Number";
  }
  else
  {
    std::cout<<"Not a Kaprekar Number";
  }
}
  
    
  
