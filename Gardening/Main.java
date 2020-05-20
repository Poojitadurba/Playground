#include<iostream>
using namespace std;
int main()
{
  int r,c,num;
  std::cin>>r;
  std::cin>>c;
  std::cin>>num;
  int value=(r*r)-10;
  
  if(num>r&&num<=2*r)
  {
    std::cout<<"It is a mango tree";
  }
  else if(num>value&&num<=(value+r))
  {
    std::cout<<"It is a mango tree";
    }
  else
  {
    std::cout<<"It is not a mango tree";
  }
}
