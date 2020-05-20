#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j,sum[100],sum1[100],max=0,a[100][100],index;
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
      sum[i]=sum[i]+a[i][j];
    }
  }
  for(j=0;j<c;j++)
  {
    for(i=0;i<r;i++)
    {
      sum1[j]=sum1[j]+a[i][j];
    }
  }
 std::cout<<"Sum of rows is ";
  for(i=0;i<r;i++)
  {
    std::cout<<sum[i]<<" ";
  }
  std::cout<<"\n";
  for(i=0;i<r;i++)
  {
    if(sum[i]>max)
    {
      max=sum[i];
      index=i;
    }
  }
  std::cout<<"Row "<<index+1<<" has maximum sum"<<"\n";
   std::cout<<"Sum of columns is ";

  for(i=0;i<c;i++)
  {
    std::cout<<sum1[i]<<" ";
  }
  std::cout<<"\n";
  max=0;
  for(i=0;i<c;i++)
  {
    if(sum1[i]>max)
    {
      max=sum1[i];
      index=i;
    }
  }
  std::cout<<"Column "<<index+1<<" has maximum sum"<<"\n";
  
}