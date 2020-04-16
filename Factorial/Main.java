#include<iostream>
using namespace std;
int main()
{
  int factorial(int);
  int fact,value;
  std::cin>>value;
  fact=factorial(value);
  cout<<"The factorial of " <<value<<" is "<<fact<<endl;
  return 0;
}
int factorial(int n)
{
  if(n<0)
    return(-1);
    if(n==0)
      return(1);
  else
  {
    return(n*factorial(n-1));
  }
}

  