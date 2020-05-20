#include<iostream>
using namespace std;
int main()
{
  int i,j,m,n,a[10][10],sum;
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
    sum=0;
    for(j=0;j<n;j++)
    {
      sum=sum+a[i][j];
    }
    std::cout<<sum<<"\n";
  }
  
}