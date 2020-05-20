#include<iostream>
using namespace std;
int main()
{
  int i,j,m,n,a[10][10],max;
  std::cin>>m;
  std::cin>>n;
  for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++)
    {
      std::cin>>a[i][j];
    }
  }
  for(i=0;i<m;i++)
  {
    max=0;
    for(j=0;j<n;j++)
    {
      if(a[i][j]>max)
      {
        max=a[i][j];
      }
    }
    std::cout<<max<<"\n";
  }
}