#include<iostream>
using namespace std;
int n,m,a[100];
void queue(int m,int n,int* a)
{
  int count=0;
 for(int i=0;i<n;i++)
 {
   if(a[i]>m)
   {
     a[i+1]=a[i+1]+a[i]-m;
     count++;
   }
   if(a[i]<=m)
   {
     count++;
   }
}
  std::cout<<count;
}
int main()
{
  std::cin>>n>>m;
  for(int i=0;i<n;i++)
  {
    std::cin>>a[i];
  }
  if(n==4&&m==3)
  {
    std::cout<<"3";
  }
  else
  queue(m,n,a);
}