#include<iostream>
#include<cstring>
using namespace std;
struct Student
{
  char name[30];
  char dpt[20];
  int year;
  float cgpa;
};
int main()
{
  int i,n,res,j;
  Student s[100],t;
  std::cout<<"Enter the number of students"<<"\n";
  std::cin>>n;
  for(i=0;i<n;i++)
  {
  std::cout<<"Enter the details of student "<<i+1<<"\n";
  std::cout<<"Enter name"<<"\n";
  std::cin>>s[i].name;
  std::cout<<"Enter department"<<"\n";
    std::cin>>s[i].dpt;
  std::cout<<"Enter year of study"<<"\n";
  std::cin>>s[i].year;
  std::cout<<"Enter cgpa"<<"\n";
  std::cin>>s[i].cgpa;
  }
  for(i=0;i<n;i++)
    {
        for(j=0;j<n-1;j++)
        {
            if(strcmp(s[j].name,s[j+1].name)>0)
            {
                t=s[j];
                s[j]=s[j+1];
                s[j+1]=t;
            }
        }
    }
  std::cout<<"Details of students"<<"\n";
  for(i=0;i<n;i++)
  {
    std::cout<<"Student "<<i+1<<"\n";
    std::cout<<"Name:"<<s[i].name<<"\n";
    std::cout<<"Department:"<<s[i].dpt<<"\n";
    std::cout<<"Year of study:"<<s[i].year<<"\n";
    std::cout<<"CGPA:"<<s[i].cgpa<<"\n";
  }
}