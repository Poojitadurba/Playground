#include<iostream>
using namespace std;
struct Employee
{
  std::string name;
  int id,age;
  std::string des;
  float salary;
};
  
int main()
{
  Employee e;
  std::cout<<"Enter name:"<<"\n";
  std::cin>>e.name;
  std::cout<<"Enter ID:"<<"\n";
  std::cin>>e.id;
  std::cout<<"Enter age:"<<"\n";
  std::cin>>e.age;
  std::cout<<"Enter designation:"<<"\n";
  std::cin>>e.des;
  std::cout<<"Enter Salary:"<<"\n";
  std::cin>>e.salary;
  std::cout<<"Employee Details"<<"\n";
  std::cout<<"Name of the Employee : "<<e.name<<"\n";
  std::cout<<"ID of the Employee : "<<e.id<<"\n";
  std::cout<<"Age of the Employee : "<<e.age<<"\n";
  std::cout<<"Designation of the Employee : "<<e.des<<"\n";
  std::cout<<"Salary of the Employee : "<<e.salary<<"\n";
}