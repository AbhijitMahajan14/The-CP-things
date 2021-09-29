#include <iostream>
using namespace std;
int main() {
    int n,a,b,c;
    cin>>n;
    int count=0;

    while(n--)
    {
       cin>>a>>b>>c; 
       if(a+b+c>=2)
       count++;

    }
    cout<<count;
}
