#include<iostream>
using namespace std;
int main()
{
  int n;
  std::cin>>n;
  int last=n%10;
  n=n/10;
  int three=n%10;
  n=n/10;
  int two=n%10;
  n=n/10;
  int first=n%10;
  int sum=last+first;
  std::cout<<sum;
}
