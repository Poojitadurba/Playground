#include<iostream>
using namespace std;
int main()
{
  string door;
  int rail;
  std::cin>>door;
  std::cin>>rail;
  if(door=="front")
  {
    if(rail==1)
    std::cout<<"Left Handed";
    else
    std::cout<<"Right Handed";
  }
  else if(door=="rear")
  {
    if(rail==1)
    std::cout<<"Right Handed";
    else
    std::cout<<"Left Handed";
  }
}