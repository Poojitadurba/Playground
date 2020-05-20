#include<iostream>
int sum(int n)
{
  int sum,count;
  while(1)
  {
    sum=0;
    count=0;
    while(n!=0)
    {
      sum=sum+n%10;
      count++;
      n=n/10;
    }
    n=sum;
    if(count==1)
    {
      break;
    }
  }
  return sum;
}
int main()
{
  int n;
  std::cin>>n;
  std::cout<<sum(n);
}
  