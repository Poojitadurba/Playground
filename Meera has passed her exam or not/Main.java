#include<iostream>
int main()
{
  int n,i,a[10],m,c=0;
  std::cin>>n;
  for(i=0;i<n;i++)
  {
    std::cin>>a[i];
  }
  std::cin>>m;
  for(i=0;i<n;i++)
  {
    if(m==a[i])
    {
      c=1;
      break;
    }
  }
  if(c==1)
  {
    std::cout<<"She passed her exam";
  }
  else
  {
    std::cout<<"She failed";
  }
}