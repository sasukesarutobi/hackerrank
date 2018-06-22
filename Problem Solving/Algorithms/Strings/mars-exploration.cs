using System.CodeDom.Compiler;
using System.Collections.Generic;
using System.Collections;
using System.ComponentModel;
using System.Diagnostics.CodeAnalysis;
using System.Globalization;
using System.IO;
using System.Linq;
using System.Reflection;
using System.Runtime.Serialization;
using System.Text.RegularExpressions;
using System.Text;
using System;

class Solution {

    // Complete the marsExploration function below.
    static int marsExploration(string s) {
            int count = 0;
            for (int i = 0; i < s.Length; i++)
            {
                char currentChar = s.ElementAt(i);
                int p = i % 3;
                if((currentChar!='S' && (p==0 || p==2)) || (currentChar!='O' && p==1))
                {
                    count++;
                }

            }
            return count;
    }

    static void Main(string[] args) {
        TextWriter textWriter = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH"), true);

        string s = Console.ReadLine();

        int result = marsExploration(s);

        textWriter.WriteLine(result);

        textWriter.Flush();
        textWriter.Close();
    }
}
