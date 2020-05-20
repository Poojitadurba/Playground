#include<iostream>
#include<string>
int main() 
{ 
  char i;
 std::string s;
  std::getline(std::cin,s);
  for(i=s.size()-1;i>=0;i--)
  {
    std::cout<<s[i];
  }
}