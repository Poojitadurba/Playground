#include<iostream>
using namespace std;
int main()
{
  int i,vc=0,cc=0,syc=0,dc=0,sc=0;
  std::string str;
  std::getline(std::cin,str);
  for(i=0;i<str.size();i++)
  {
    if(str.at(i)=='a'||str.at(i)=='e'||str.at(i)=='i'||str.at(i)=='o'||str.at(i)=='u'||str.at(i)=='A'||str.at(i)=='E'||str.at(i)=='I'||str.at(i)=='O'||str.at(i)=='U')
    {
      vc++;
    }
    else if(str.at(i)>=48&&str.at(i)<=57)
    {
      dc++;
    }
    else if(str.at(i)==32)
    {
      sc++;
    }
    else if((str.at(i)>=65&&str.at(i)<=90)||(str.at(i)>=97&&str.at(i)<=122))
    {
     cc++;
    }
    else
    {
      syc++;
    }
  }
    std::cout<<"Vowels:"<<vc<<"\n";
    std::cout<<"Consonants:"<<cc<<"\n";
    std::cout<<"White Spaces:"<<sc<<"\n";
    std::cout<<"Digits:"<<dc<<"\n";
    std::cout<<"Symbols:"<<syc<<"\n";
}