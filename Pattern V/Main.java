#include <iostream> 
  
using namespace std; 
  
int main() 
{ 
  
    int num ; 
    int space; 
      std::cin>>num;
    int i, j, lterm, rterm; 
  
    // The terms on the LHS of the pattern  
    lterm = 1;  
  
    // The terms on the RHS of the pattern 
    rterm = num * num + 1; 
  
    for (i = num; i > 0; i--) { 
  
        // To print number of spaces  
        for (space = num; space > i; space--) 
          std::cout << "--"; 
  
        for (j = 1; j <= i; j++) { 
           std:: cout << lterm; 
           std:: cout << "*"; 
            lterm++; 
        } 
        for (j = 1; j <= i; j++) { 
            std::cout << rterm; 
            if (j < i) 
                std::cout<<"*"; 
            rterm++; 
        } 
  
        // To get the next term on RHS of the Pattern  
        rterm = rterm - (i - 1) * 2 - 1; 
        std::cout << endl; 
    } 
} 
