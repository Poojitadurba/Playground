#include<iostream>
int main(){
  int n,i,male=0,female=0;
  std::cin>>n;
  int* arr=(int*)malloc(n*sizeof(int));
  for(i=0;i<n;i++)
  {
    std::cin>>*(arr+i);
  }
  for(i=0;i<n;i++)
  {
    if(*(arr+i)%2!=0)
    {
      male++;
    }
    else
    {
      female++;
    }
  }
  std::cout<<male<<"\n";
  std::cout<<female;
  return 0;
}