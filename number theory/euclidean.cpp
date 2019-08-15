#include<iostream>

using namespace std;

int t;
int x, y, d;
typedef unsigned long long ll;

int extendedEuclid(int a, int b){
  if(b==0){
	  x=1;
	  y=0;
	  return a;
  }
  d = extendedEuclid(b, a%b);
  int _x = x;
  x = y;
  y = _x - (a/b)*y;
  return d;
}

int main(){
	int T;
    cin >> T;

		while (T-- > 0) {			
			ll ca, cn, ca1, cn1;      
      cin >> ca;
      cin >> cn;          

      cin >> ca1;
      cin >> cn1;
			extendedEuclid(cn, cn1);

			if ((ca - ca1) % d != 0) {
				cout << "no solution" << endl;
			} else {				
        ca = ca + x * (ca1 - ca) / d * cn;
				cn = cn * cn1 / d;
				cout << ca << " " << cn << endl;
			}
		}
}
