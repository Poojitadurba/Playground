#include<iostream>
using namespace std;
int main()
{
  int i,j,c=0;
  std::string s1,s2;
  std::cin>>s1;
  std::cin>>s2;
  for(i=0,j=s2.size()-1;i<s1.size(),j>=0;i++,j--)
  {
    if(s1.at(i)!=s2.at(j))
       {
         c=1;
         break;
       }
    }
       if(c==0)
       {
         std::cout<<"It is correct";
       }
       else
       {
         std::cout<<"It is wrong";
       }
       }