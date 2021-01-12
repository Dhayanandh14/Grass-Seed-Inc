#include <iostream>
#include<stdio.h>

using namespace std;

int main(){
    double C,area;
    cin>>C;
    if(0<C && C<=100){
      int L;
      cin>>L;
      if (0<L && C<=100){
        area = 0;
        for(int i=1;i<=L;i++){
          double w,l;
          cin>>w>>l;
          area = area + w*l;
        }
        printf("%0.7f",area*C);
      }
    }
   
  }

