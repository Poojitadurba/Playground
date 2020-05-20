#include<iostream>
using namespace std;
struct College
{
  std::string n,c;
  int es;
  float pp;
}c[100];
int main()
{
  int i,n;
  cout<<"Enter the number of colleges"<<"\n";
  std::cin>>n;
  for(i=0;i<n;i++)
  {
    cout<<"Enter the details of college "<<i+1<<"\n";
    cout<<"Enter name"<<"\n";
    cin>>c[i].n;
    cout<<"Enter city"<<"\n";
    cin>>c[i].c;
    cout<<"Enter year of establishment"<<"\n";
    cin>>c[i].es;
    cout<<"Enter pass percentage"<<"\n";
    cin>>c[i].pp;
  }
  cout<<"Details of colleges"<<"\n";
  for(i=0;i<n;i++)
  {
   cout<<"College:"<<i+1<<"\n";
    cout<<"Name:"<<c[i].n<<"\n";
    cout<<"City:"<<c[i].c<<"\n";
    cout<<"Year of establishment:"<<c[i].es<<"\n";
    cout<<"Pass percentage:"<<c[i].pp<<"\n";
  }
}