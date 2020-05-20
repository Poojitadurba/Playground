#include<iostream>
using namespace std;
int main()
{
  int n,i,a[15],sume=0,sumo=0;
  std::cin>>n;
  for(i=0;i<n;i++)
  {
    std::cin>>a[i];
  }
  for(i=0;i<n;i++)
  {
    if(a[i]%2==0)
    {
      sume=sume+a[i];
    }
    else
    {
      sumo=sumo+a[i];
    }
  }
  std::cout<<"The sum of the even numbers in the array is "<<sume<<"\n"<<"The sum of the odd numbers in the array is "<<sumo;
}