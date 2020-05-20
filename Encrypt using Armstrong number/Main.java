#include<iostream>
#include<cmath>
int is_armstrong(int n)
{
  int temp=n,ans=0,count=0,r;
  int temp1=n;
  while(n!=0)
  {
    count++;
    n=n/10;
  }
  while(temp!=0)
  {
    r=temp%10;
    ans=ans+pow(r,count);
    temp=temp/10;
  }
  if(ans==temp1)
  {
    return 1;
  }
  else
  {
    return 0;
  }
}
int main()
{
  int c,n;
  std::cin>>n;
  c=is_armstrong(n);
  if(c==1)
  {
    std::cout<<"Kindly proceed with encrypting";
  }
  else
  {
    std::cout<<"It is not an Armstrong number";
  }
}