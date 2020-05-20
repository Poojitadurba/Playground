#include<iostream>
int main()
{
  int maxweight,weight;
  std::cin>>maxweight;
  std::cin>>weight;
  if(weight<maxweight)
  {
    std::cout<<"Yes, you can enter.";
  }
  else if(weight==maxweight)
  {
    std::cout<<"Yes, you can enter. Kindly use a rope.";
  }
  else
  {
    std::cout<<"Sorry, you can't enter";
  }
}