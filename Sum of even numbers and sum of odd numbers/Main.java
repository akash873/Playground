#include<iostream>
using namespace std;
int main()
{
  int Size, i, a[10];
  int Even_Sum = 0, Odd_Sum = 0;
  std::cin>>Size;
  for(i =0; i < Size; i++)
  {
    std::cin>>a[i];
  }
  for(i = 0; i < Size; i++)
  {
    if(a[i] % 2 == 0)
    {
      Even_Sum = Even_Sum + a[i];
    }
    else
    {
      Odd_Sum = Odd_Sum + a[i];
    }
  }
  std::cout<<"The sum of the even numbers in the array is "<<Even_Sum;
  std::cout<<"\nThe sum of the odd numbers in the array is "<<Odd_Sum;
  return 0;
}
  