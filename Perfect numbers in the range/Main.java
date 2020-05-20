#include<iostream>
int main()
{
  int a,b,total,i,j;
  std::cin>>a;
  std::cin>>b;
  for(i=a;i<=b;i++)
  {
    total=0;
    for(j=1;j<i;j++)
    {
      if(i%j==0)
      {
        total=total+j;
      }
    }
    if(total==i)
    {
      std::cout<<i<<" ";
    }
  }
}