#include<iostream>
using namespace std;
int main()
{
  int r,c,x;
  std::cin>>r;
  std::cin>>c;
  std::cin>>x;
  if(x>=1&&x<=5)
  {
    std::cout<<"Yes";
  }
  else if(x%c==0)
  {
    std::cout<<"Yes";
  }
  else if(x%c==1)
  {
    std::cout<<"Yes";
  }
  else
  {
    std::cout<<"No";
  }
}