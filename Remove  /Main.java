#include<iostream>
using namespace std;
int main()
{
  int found,i=0,p;
  std::string str;
  std::getline(std::cin,str);
  std::string word="the";
  if (str.find(word) != string::npos) 
    { 
        size_t p = -1; 
  
        // To cover the case 
        // if the word is at the 
        // beginning of the string 
        // or anywhere in the middle 
        string tempWord = word + " "; 
        while ((p = str.find(word)) != string::npos) 
            str.replace(p, tempWord.length(), ""); 
  
        // To cover the edge case 
        // if the word is at the 
        // end of the string 
        tempWord = " " + word; 
        while ((p = str.find(word)) != string::npos) 
            str.replace(p, tempWord.length(), ""); 
    } 
  std::cout<<str;
  
}