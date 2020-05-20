#include<iostream>
using namespace std;
int main()
{
  int pa,rate,years;
  std::cin>>pa;
  std::cin>>rate;
  std::cin>>years;
  double interest=(pa*rate*years)/100;
 double total_amount=pa+interest;
  double discount=(0.02*interest);
  double discount_amount=total_amount-discount;
  std::cout<<interest<<"\n";
  std::cout<<total_amount<<"\n";
  std::cout<<discount<<"\n";
  std::cout<<discount_amount<<"\n";
}
  
  

  
