#include<iostream>
using namespace std;
int main()
{
int m, n, c, d, first[10][10], second[10][10], sum[10][10];
  cin >> m >> n;
  for(c = 0; c < m; c++)
    for(d =0; d < n; d++)
      cin >> first[c][d];
  for(c = 0; c < m; c++)
    for(d = 0; d < n; d++)
      cin >> second[c][d];
  for(c = 0; c < m; c++)
    for(d = 0; d < n; d++)
      sum[c][d] = first[c][d] + second[c][d];
  for(c=0; c < m; c++)
  {
    for(d = 0; d < n; d++)
      cout<< sum[c][d]<<" ";
    cout<<endl;
  }
  return 0;
}