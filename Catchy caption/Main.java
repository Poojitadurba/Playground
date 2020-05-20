#include <cstring>
#include <iostream>
#include<string>
int main()
{
   std::string str;
  std::getline(std::cin,str);
   if(str.size()<=50)
  {
    std::cout<<"Caption eligible for the contest";
  }
  else
  {
    std::cout<<"Caption not eligible for the contest";
  }
}