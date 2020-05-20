#include<iostream>
#include<cmath>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  float totalballs,totalruns,runsscored;
  int ballsbowled;
  float overs,totalrunrate,currentrunrate;
  std::cin>>totalballs;
  std::cin>>totalruns;
  std::cin>>runsscored;
  std::cin>>ballsbowled;
  std::cout<<50<<"\n";
  overs=(ballsbowled/6)+((ballsbowled%6)*0.1);
  totalrunrate=(totalruns/50);
  std::cout<<fixed << setprecision(1)<<overs<<"\n";
  currentrunrate=(runsscored/overs);
  std::cout<<fixed << setprecision(1)<<currentrunrate<<"\n";
  std::cout<<totalrunrate<<"\n";
  if(currentrunrate>totalrunrate)
  {
    std::cout<<"Eligible to Win";
  }
  else
  {
    std::cout<<"Not Eligible to Win";
  }
}