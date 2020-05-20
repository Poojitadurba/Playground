#include<iostream>
using namespace std;
int main()
{
  int n,i,a[100],loc,val;
  std::cout<<"Enter the number of elements in the array"<<"\n";
 std::cin>>n;
  std::cout<<"Enter the elements in the array"<<"\n";
  for(i=1;i<=n;i++)
  {
    std::cin>>a[i];
  }
  std::cout<<"Enter the location where you wish to insert an element"<<"\n";
  std::cin>>loc;
  if(loc>n)
  {
    std::cout<<"Invalid Input";
  }
  else
  {
  std::cout<<"Enter the value to insert"<<"\n";
  std::cin>>val;
  n=n+1;
  for(i=n;i>=loc;i--)
  {
    a[i]=a[i-1];
  }
  a[loc]=val;
  std::cout<<"Array after insertion is"<<"\n";
  for(i=1;i<=n;i++)
  {
    std::cout<<a[i]<<"\n";
  }
  }
}