#include <iostream>
using namespace std;
int checkAdv(int a[],int n,int i1)
{
    int ans=0;
    for(int i=0;i<n;i++)
    {
    if(a[i]>=a[i1-1]&&a[i]>0)
    {
        ans++;}
    }
    return ans;
}
int main() {
   int n,i1;
   cin>>n>>i1;
   int arr[n];
   int i=0;
   while(i<n)
   {
       cin>>arr[i];
       i++;
   }

   int ans=checkAdv(arr,n,i1);
   cout<<ans;
}
