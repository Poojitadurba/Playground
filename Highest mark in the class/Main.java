#include<iostream>
int main()
{
  int n,i,a[10],max=0;
  std::cin>>n;
  for(i=0;i<n;i++)
  {
    std::cin>>a[i];
  }
  for(i=0;i<n;i++)
  {
   if(a[i]>=max)
   {
     max=a[i];
   }
  }
  std::cout<<max;
}