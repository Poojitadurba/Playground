#include<iostream>
int main()
{
    int i,j,k,n,p,m;
    std::cin>>n;
    k=n;
    for(i=1,p=1;i<=4,p<=4;i++,p++)
    {
        for(j=1;j<=4;j++)
        {
            if(j<=p)
            {
                std::cout<<k;
            }
            else
            {
                std::cout<<" ";
            }
        }
        k++;
        std::cout<<"\n";
    }
    m=n+3;
    for(i=1,p=4;i<=4,p>=1;i++,p--)
    {
        for(j=1;j<=4;j++)
        {
            if(j<=p)
            {
                std::cout<<m;
            }
            else
            {
                std::cout<<" ";
            }
        }
        m--;
        std::cout<<"\n";
    }
    
}