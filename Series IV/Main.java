#include<iostream>
int main()
{
  int n,j,k,i,t;
  std::cin>>n;
  if(n==1)
  {
    
  std::cout<<"0"<<" ";
  }
  else
  {
    std::cout<<"0"<<" ";
    std::cout<<"2"<<" ";
  i=6;
  n=n-2;
  k=2;
  if(n%2==0)
  {
    for(j=n;j>=2;j=j-2)
    {
      t=2;
      while(t--)
      {
      k=k+i;
      std::cout<<k<<" ";
      }
      i=i+4;
    }
  }
  else
  {
    for(j=n;j>=1;j=j-2)
    {
      t=2;
      while(t--)
      {
        k=k+i;
        std::cout<<k<<" ";
        if(j==1)
        {
          break;
        }
      }
      i=i+4;
    }
  }
  }
}