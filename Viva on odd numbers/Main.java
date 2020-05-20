#include<iostream>
using namespace std;
int main()
{

  float score=0;
  int n;
  int i=5;
while(i--)
{
  std::cin>>n;
  if(n>0&&n%2!=0)
  {
    score++;
  }
  if(n>0&&n%2==0)
  
  {
    score=score-0.5;
  }
  if(n<0)
  {
    score=score-1;
    break;
  }
  if(score==3)
  {
    break;
  }
}
  std::cout<<score;
}