#include<iostream>
using namespace std;
int main()
{
  float age,time,price;
  std::cin>>age;
  std::cin>>time;
  if(age>13)
  {
      if(time>11&&time<15)
      {
          price=5;
      }
      else
      {
          price=8;
      }
  }
  else if(age<13)
  {
      if(time>11&&time<15)
      {
          price=2;
      }
      else
      {
          price=4;
      }
  }
  std::cout<<"$"<<price<<".00";
}
      