#include<iostream>
using namespace std;
int main()
{
  int r,c,a[100][100],b[100][100],sum=0,i,j;
  std::cin>>r;
  std::cin>>c;
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      std::cin>>a[i][j];
    }
  }
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      std::cin>>b[i][j];
    }
  }
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      sum=a[i][j]+b[i][j];
      std::cout<<sum<<" ";
    }
    std::cout<<"\n";
}
}