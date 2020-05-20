#include<iostream>
using namespace std;
int main()
{
  int weight,adults,children,wa,wc;
  std::cin>>weight;
  std::cin>>adults;
  std::cin>>children;
  wa=adults*75;
  wc=children*30;
  if(wa+wc<=weight)
  {
    std::cout<<"Boat is stable";
  }
  else
  {
    std::cout<<"Boat will drow";
  }
}