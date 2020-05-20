#include<iostream>
int main()
{
  int n,p,i,j,res,k;
  std::cin>>n;
  k=1;
  for(i=1,p=1;i<=n,p<=n;i++,p++)
  {
    for(j=1;j<=n;j++)
    {
      if(j<=p)
      {
        if(i==1||j==p)
        {
        std::cout<<k<<" ";
        }
        else
        {
          std::cout<<k<<"*";
        }
      }
    }
    std::cout<<"\n";
    k++;
  }
  res=k-1;
  for(i=1,p=n;i<=n,p>=1;i++,p--)
  {
    for(j=1;j<=n;j++)
    {
      if(j<=p)
      {
        if(j==p)
        {
        std::cout<<res<<" ";
        }
        else
        {
          std::cout<<res<<"*";
        }
      }
    }
    std::cout<<"\n";
    res--;
  }
}