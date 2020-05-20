#include<iostream>
int power(int a,int b)
{
  int i,ans=1;
  for(i=1;i<=b;i++)
  {
    ans=ans*a;
  }
  return ans;
}
  
int main()
{
  int m,n,req,ans;
  std::cin>>m;
  std::cin>>n;
  std::cin>>req;
  ans=power(m,n);
  if(ans>=req)
  {
    std::cout<<"Doctor, you can proceed with your experiment.";
  }
  else
  {
    std::cout<<"Sorry Doctor! You need more bacteria.";
  }
}
  
  