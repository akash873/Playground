#include<iostream>
using namespace std;
int calculatePower(int, int);
int main()
{
  int a, n, result;
  std::cout<<"Enter the value of a";
  std::cin>>a;
  std::cout<<"\nEnter the value of n";
  std::cin>>n;
  result = calculatePower(a, n);
std::cout<<"\nThe value of "<<a<<" power "<<n<<" is "<<result;
  return 0;
}
int calculatePower(int a, int n)
{
  if (n != 0)
    return (a*calculatePower(a, n-1));
  else
    return 1;
}