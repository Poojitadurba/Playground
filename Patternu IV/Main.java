#include <iostream>
using namespace std;
int main() {
  int n,i,j,k,res;
  std::cin>>n;
  k=1;
    for(i=1;i<=n;i++)
    {
      if(i%2!=0)
      {
        for(j=1;j<=n;j++)
        {
          if(j==n)
          {
            k++;
          }
          std::cout<<k;
        }
      }
      else if(i%2==0)
      {
        for(j=1;j<=n;j++)
        {
          if(j==1)
          {
            k++;
            std::cout<<k;
          }
          else
          {
            res=k-1;
          std::cout<<res;
          }
        }
      }
      std::cout<<"\n";
    }
    return 0;
}