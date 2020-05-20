#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,s,hcf,st;
  std::cin>>a;
  std::cin>>b;
  std::cin>>c;
  if(a>b&&a>c)
  {
    if(b>c)
    {
      s=b;
    }
    else
    {
      s=c;
    }
  }
  else if(b>a&&b>c)
  {
    if(a>c)
    {
      s=a;}
    else
    {
      s=c;
    }
  }
  else
  {
    if(b>a)
    {
      s=b;
    }
    else
    {
      s=a;
    }
  }
  std::cout<<"The treasure is in box which has number "<<s<<"\n";
  st=a<b?(a<c?a:c):(b<c?b:c);
 
	 for (hcf=st;hcf>=1;hcf--)
 	{
  	  if (a%hcf==0 && b%hcf==0 && c%hcf==0)
  		 break;
 	} 
  std::cout<<"The code to open the box is "<<hcf;
}

  
