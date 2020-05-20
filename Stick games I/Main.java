#include<iostream>
using namespace std;
int main()
{
  int n,m,i,j,row,stick,turn,arun,mani;
  std::cin>>n>>m;
  turn=0;
  stick=n+m;
  for(i=1;i<=n;i++)
  {
    row=1;
    for(j=1;j<=m;j++)
    {
      if(turn%2==0)
      {
        if(row==1)
        {
          stick=stick-row;
          row--;
        }
        if(stick==0)
        {
          arun=1;
          break;
        }
        stick--;
      }
      else
      {
        if(row==1)
        {
          stick=stick-row;
          row--;
        }
        if(stick==0)
        {
          mani=1;
          break;
        }
        stick--;
      }
      turn++;
    }
  }
  if(arun==1)
  {
    std::cout<<"Mani Iyer";
  }
  else
  {
    std::cout<<"Arun Gupta";
  }
}