#include<iostream>
int main()
{
  int i,n,count=0;
 std::cin>>n;
  for(i=1;i<=n;i++)
  {
    if(n%i==0)
    {
      count++;
    }
  }
  if(count==2)
  {
    std::cout<<"Eligible";
  }
  else
  {
    std::cout<<"Not eligible";
  }
}