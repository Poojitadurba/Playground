#include<iostream>
int main()
{
  int num,i,turn=0,sum=0,count=0,n;
  std::cin>>num;
  for(count=0;sum<num;count++)
    {
        std::cin>>n;
        sum=sum+n; 
    }
  std::cout<<"The number of turns is "<<count;
}