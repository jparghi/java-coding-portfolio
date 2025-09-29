package concepts.java.algorithms;

import java.util.*;

public class RecursionExamples {
    public static long factorial(int n){ return n<=1?1:n*factorial(n-1); }
    public static long fib(int n){ if(n<=1) return n; return fib(n-1)+fib(n-2); }
    public static void permute(char[] s,int l,int r, java.util.List<String> out){
        if(l==r){ out.add(new String(s)); return; }
        for(int i=l;i<=r;i++){
            swap(s,l,i); permute(s,l+1,r,out); swap(s,l,i);
        }
    }
    private static void swap(char[] a,int i,int j){ char t=a[i]; a[i]=a[j]; a[j]=t; }

    public static void main(String[] args){
        System.out.println(factorial(5));
        System.out.println(fib(10));
        List<String> out = new ArrayList<>();
        permute("abc".toCharArray(),0,2,out);
        System.out.println(out);
    }
}
