#include <iostream>
#include<string>
struct student
{
    std::string name;
    int roll;
    float marks;
};
int main() 
{
  student s1;
  std::getline(std::cin,s1.name);
  std::cin>>s1.roll;
  std::cin>>s1.marks;
  std::cout<<"\n";
    std::cout<<"Student Details"<<"\n";
  std::cout<<"Name: "<<s1.name<<"\n";
  std::cout<<"Roll: "<<s1.roll<<"\n";
  std::cout<<"Marks: "<<s1.marks<<"\n";
  
}