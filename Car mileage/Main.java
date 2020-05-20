#include<iostream>
using namespace std;
int main()
{
  float milage;
  int petrol,distance;
  std::cin>>milage;
  std::cin>>petrol;
  std::cin>>distance;
  if(milage*petrol>=distance)
  {
    std::cout<<"Can reach";
  }
  else
  {
    std::cout<<"Cannot reach";
  }
  
  
}