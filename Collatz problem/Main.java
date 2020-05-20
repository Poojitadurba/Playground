#include<iostream>
using namespace std;
int main()
{
  int n,count=0;
  std::cin>>n;
  while(n!=1)
  {
    std::cout<<n<<"\n";
    if(n%2==0)
    {
      n=n/2;
    }
    else if(n%2!=0)
    {
      n=3*n+1;
    }
    count++;
  }
  std::cout<<1<<"\n";
  std::cout<<count;
  
}