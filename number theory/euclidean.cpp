#include<iostream>

using namespace std;
// https://www.youtube.com/watch?v=Z8m0vfnkYQw

int t;
int x, y, d;
typedef unsigned long long ll;

int extendedEuclid(int a, int b){
  if(b==0){ x=1;  y=0; return a;}
  d = extendedEuclid(b, a%b);
  int _x = x;
  x = y;
  y = _x - (a/b)*y;
  return d;
}

int main(){
		int T;
    ll a, b;
    cin >> a;          //3 
    cin >> b;          //5
    extendedEuclid(a, b);
    cout << x << "\n"; // x0 = -1
    cout << y << "\n"; // y0 = 2
}

