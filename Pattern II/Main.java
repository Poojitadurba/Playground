#include<iostream>
int main()
{
  int i,n,j,k,l,p;
  std::cin>>n;
  for(k=i=p=1;i<=n,p<=n;i++,p++)
  {
    l=k+i-1;
    for(j=1;j<=n;j++)
    {
      if(j<=p)
      {
      if(i%2==1)
      {
        if(i==1||j==p)
        std::cout<<k;
        else
        {
          std::cout<<k<<"*";
        }
        
      }
      else
        if(i==1||j==p)
        std::cout<<l;
        else
        {
          std::cout<<l<<"*";
        }
      k++;
      l--;
      }
    }
    std::cout<<"\n";
  }
  return 0;
}
