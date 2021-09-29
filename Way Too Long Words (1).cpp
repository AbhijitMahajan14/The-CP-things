#include <iostream>
using namespace std;
void count(string s)
{
    string ans="";
    int c=0;
    for(int i=0;i<s.length();i++)
    {
        c++;
    }
    c=c-2;
    ans.push_back(s[0]);
    ans+=to_string(c);
    ans.push_back(s[c+1]);
    if(s.length()>10)
    cout<<ans<<endl;
    else
    cout<<s<<endl;
}
int main() {
    string s;
    int n,l;
    cin>>n;
    
    for(int i=0;i<n;i++)
    {
        cin>>s;
        count(s);
        
    }
}
