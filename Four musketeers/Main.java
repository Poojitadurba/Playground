#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  float x1,y1,x2,y2,x3,y3;
  float x4,y4;
  std::cin>>x1;
  std::cin>>y1;
  std::cin>>x2;
  std::cin>>y2;
  std::cin>>x3;
  std::cin>>y3;
   x4=(x1+x2+x3)/3;
   y4=(y1+y2+y3)/3;
  std::cout<<x4<<"\n";
  std::cout<<y4;
}
  