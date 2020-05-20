#include<iostream>
using namespace std;
int main()
{
  int i=0;
  std::string s,s1;
  std::cin>>s;
  while(i<s.size())
  {
    if((s.at(i)>=65&&s.at(i)<=90)||(s.at(i)>=97&&s.at(i)<=122))
    {
      s1=s1+s.at(i);
    }
    i++;
  }
    std::cout<<s1;
}