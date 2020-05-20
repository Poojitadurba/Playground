#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int birth,current,age;
  std::cin>>birth;
  std::cin>>current;
  if(birth>current)
  {
    age=(2000+current)-(1900+birth);
  }
  else
  {
    age=(2000+current)-(2000+birth);
  }
  std::cout<<age;
  
}