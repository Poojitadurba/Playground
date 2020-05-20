#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float famount,fdiscount,fshipcharge,samount,sdiscount,sshipcharge,aamount,adiscount,ashipcharge,amazon,flipkart,snapdeal;
  std::cin>>famount;
  std::cin>>fdiscount;
  std::cin>>fshipcharge;
  std::cin>>samount;
  std::cin>>sdiscount;
  std::cin>>sshipcharge;
  std::cin>>aamount;
  std::cin>>adiscount;
  std::cin>>ashipcharge;
  flipkart=(famount-(fdiscount/100)*famount)+fshipcharge;
  snapdeal=(samount-(sdiscount/100)*samount)+sshipcharge;
  amazon=(aamount-(adiscount/100)*aamount)+ashipcharge;
  std::cout<<"In Flipkart Rs."<<flipkart<<"\n";
  std::cout<<"In Snapdeal Rs."<<snapdeal<<"\n";
  std::cout<<"In Amazon Rs."<<amazon<<"\n";
  if(flipkart<=snapdeal&&flipkart<amazon)
  {
    std::cout<<"He will prefer Flipkart";
  }
  else if(snapdeal<flipkart&&snapdeal<amazon)
  {
    std::cout<<"He will prefer Snapdeal";
  }
  else
  {
    std::cout<<"He will prefer Amazon";
  }
}