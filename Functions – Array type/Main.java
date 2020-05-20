#include<iostream>
using namespace std;
int fun(int n,int* a)
{
  int c1,c2;
  for(int i=0;i<n;i++)
  {
    if(a[i]%2==0)
    {
      c1=1;
    }
    if(a[i]%2!=0)
    {
      c2=1;
    }
  }
  if(c1==1&&c2==0)
  {
    return 1;
  }
  else if(c1==0&&c2==1)
  {
    return 2;
  }
  else if(c1==1&&c2==1)
  {
    return 3;
  }
}
int main()
{
  int n,i,a[100],ans=0;
  std::cout<<"Enter the number of elements in the array"<<"\n";
 std::cin>>n;
  std::cout<<"Enter the elements in the array"<<"\n";
 for(i=0;i<n;i++)
 {
   std::cin>>a[i];
 }
 ans=fun(n,a);
 if(ans==1)
 {
   std::cout<<"The array is Even";
 }
  else if(ans==2)
  {
   std::cout<<"The array is Odd"; 
  }
  else
  {
    std::cout<<"The array is Mixed";
  }
}