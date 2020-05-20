#include <bits/stdc++.h> 
using namespace std; 
const int MAX = 100; 
 int mat[100][100];
// Function to find the maximum 
// element of each column. 
void largestInColumn(int mat[][MAX], int rows, int cols) 
{ 
    for (int i = 0; i < cols; i++) { 
        // initialize the maximum element 
        // with 0 
        int maxm = mat[0][i]; 
  
        // Run the inner loop for rows 
        for (int j = 1; j < rows; j++) { 
            // check if any element is greater  
            // than the maximum element 
            // of the column and replace it 
            if (mat[j][i] > maxm) 
                maxm = mat[j][i]; 
        } 
  
        // print the largest element of the column 
        std::cout << maxm << endl; 
    } 
} 
  
// Driver code 
int main() 
{ 
  int n,m,i,j;
    std::cin>>n;
  std::cin>>m;
  for(i=0;i<n;i++)
  {
    for(j=0;j<m;j++)
    {
      std::cin>>mat[i][j];
    }
  }
    largestInColumn(mat, n, m); 
  
    return 0; 
} 