#include<iostream>
int fact(int n)
{
  if(n==1||n==0)
  {
    return 1;
  }
  else
  {
    return n*fact(n-1);
  }
}
int main()
{
  int n,ans;
 std::cin>>n;
  ans=fact(n);
  std::cout<<"The factorial of "<<n<<" is "<<ans;
}