#include <iostream>
#include<cstring>
int main()
{
char str[100], rev[100];     
int count = 0, end, i,j;    
std::cin.getline(str,100);
for(i=strlen(str)-1,j=0;i>=0,j<strlen(str);i--,j++)
{
  rev[j]=str[i];
}
  for(i=0;i<strlen(str);i++)
  {
    std::cout<<rev[i];
  }
}