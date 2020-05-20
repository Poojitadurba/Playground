#include<iostream>
int gcd(int a,int b,int c,int small)
{
  int ans;
  while(small>=1)
  {
    if(a%small==0&&b%small==0&&c%small==0)
    {
      ans=small;
      break;
    }
    small--;
  }
  return ans;
}
int main()
{
  int n1,n2,n3,gcd0,small,res;
  std::cin>>n1;
  std::cin>>n2;
  std::cin>>n3;
  std::cin>>gcd0;
  if(n1<n2&&n1<n3)
  {
    small=n1;
  }
  else if(n2<n1&&n2<n3)
  {
    small=n2;
  }
  else
  {
    small=n3;
  }
  res=gcd(n1,n2,n3,small);
  if(res==gcd0)
  {
    
  std::cout<<"Answer is correct.";
  }
  else
  {
  std::cout<<"Answer is wrong.";
  }
}