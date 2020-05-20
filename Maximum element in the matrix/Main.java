#include<iostream>
using namespace std;
int main()
{
  int m,n,i,j,max=0,a[10][10];
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
    for(j=0;j<n;j++)
    {
      if(a[i][j]>max)
      {
        max=a[i][j];
      }
    }
  }
  std::cout<<"The maximum element is "<<max;
}