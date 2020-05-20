#include<iostream>
int main()
{
  int encrypt,num,sum,total=0,i;
  std::cin>>encrypt;
  std::cin>>num;
  sum=encrypt+num;
  for(i=1;i<sum;i++)
  {
    if(sum%i==0)
    {
      total=total+i;
    }
  }
  if(total==sum)
  {
    std::cout<<"They can read the message";
  }
  else
  {
    std::cout<<"They can't read the message";
  }
}