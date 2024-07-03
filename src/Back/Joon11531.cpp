#include <bits/stdc++.h>

using namespace std;

int main() {
  ios_base::sync_with_stdio(false); cin.tie(NULL);
  
  int score;
  string s, c;
  int sum = 0;
  int count =0;

  vector <int> v1;
  vector <string> v2;
  vector <string> v3;

  while(1){
    cin >> score;
    if(score == -1){
      break;
    }
    cin >> s >> c;
    v1.push_back(score);
    v2.push_back(s);
    v3.push_back(c);
  }

  for(int i=v3.size()-1; i>=0; i--){
    if(v3[i] == "right"){
      sum += v1[i];
      count++;
      for(int j=0; j<i; j++){
        if(v2[i] == v2[j]){
          sum += 20;
        }
      }
    }
  }
  cout << count << " " << sum << endl;
 
  
}
