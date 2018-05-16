using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static void Main(String[] args) {
        int n = Convert.ToInt32(Console.ReadLine());
        string[] arr_temp = Console.ReadLine().Split(' ');
        int[] arr = Array.ConvertAll(arr_temp,Int32.Parse);
        
        float pos=0,neg=0,zer=0;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                pos++;
            }else if(arr[i]<0){
                neg++;
            }else{
                zer++;
            }
        }
        
        Console.WriteLine(pos/n);
        Console.WriteLine(neg/n);
        Console.WriteLine(zer/n);
        
    }
}