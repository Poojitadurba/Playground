#include<iostream>
using namespace std;
int n,s,a[100];
void printresult(int* a,int n,int s)
{
  int i;
  for(i=0;i<n;i++)
  {
    s=s-a[i];
  }
  if(s>=0)
  {
    std::cout<<"YES";
  }
  else
  {
    std::cout<<"NO";
  }
}
int main()
{
  int i;
  std::cin>>n>>s;
  for(i=0;i<n;i++)
  {
    std::cin>>a[i];
  }
  printresult(a,n,s);
}