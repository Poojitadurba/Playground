#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  int v;
  char s1[10],s2[10];
  std::cin>>s1;
  std::cin>>s2;
  v=strcmp(s1,s2);
  if(v==0)
  {
    std::cout<<"It is correct";
  }
  else
  {
    std::cout<<"It is wrong";
  }
  
}