#include<iostream>
using namespace std;
int main()
{
  int d1,d2,c1,c2,totalc,totald,dollar,cent=0;
  std::cin>>d1;
  std::cin>>c1;
  std::cin>>d2;
  std::cin>>c2;
  totald=d1+d2;
  totalc=c1+c2;
  dollar=totalc/100;
  totalc=totalc%100;
  
  //std::cout<<dollar<<"\n";
  totald=totald+dollar;
  std::cout<<totald<<"\n";
  std::cout<<totalc;

}