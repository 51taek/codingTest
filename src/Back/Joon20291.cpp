#include <bits/stdc++.h>

using namespace std;

int main() {
  ios_base::sync_with_stdio(false); cin.tie(NULL);
  
  int n, pos;
  string s;
  vector<string> v1;
  map<string, int> m;

  cin >> n;
  for(int i=0;i<n;i++){
    cin >> s;
    pos = s.find(".");
    string news = s.substr(pos+1);
    v1.push_back(news);
  }

  for(int i=0;i<n;i++){
    if(m.count(v1[i])){
      m[v1[i]]++;
    }else{
      m.insert({v1[i], 1});
    }
  }

  map<string, int> sorted_m(m.begin(), m.end());
  
  for(auto it: m){
    cout << it.first << " " << it.second << endl;
  }
 
  
}
