import java.util.*;

public class SortingAlgorithms {
    public static void bubble(int[] a) {
        for (int i=0;i<a.length-1;i++)
            for (int j=0;j<a.length-1-i;j++)
                if (a[j]>a[j+1]) { int t=a[j]; a[j]=a[j+1]; a[j+1]=t; }
    }
    public static void insertion(int[] a) {
        for (int i=1;i<a.length;i++){
            int key=a[i], j=i-1;
            while (j>=0 && a[j]>key){ a[j+1]=a[j]; j--; }
            a[j+1]=key;
        }
    }
    public static void selection(int[] a) {
        for (int i=0;i<a.length;i++){
            int min=i;
            for (int j=i+1;j<a.length;j++) if (a[j]<a[min]) min=j;
            int t=a[i]; a[i]=a[min]; a[min]=t;
        }
    }
    public static void mergeSort(int[] a){ mergeSort(a,0,a.length-1,new int[a.length]); }
    private static void mergeSort(int[] a,int l,int r,int[] tmp){
        if (l>=r) return;
        int m=(l+r)/2;
        mergeSort(a,l,m,tmp); mergeSort(a,m+1,r,tmp);
        int i=l,j=m+1,k=l;
        while(i<=m && j<=r) tmp[k++]= (a[i]<=a[j])?a[i++]:a[j++];
        while(i<=m) tmp[k++]=a[i++];
        while(j<=r) tmp[k++]=a[j++];
        for (k=l;k<=r;k++) a[k]=tmp[k];
    }
    public static void quickSort(int[] a){ quick(a,0,a.length-1); }
    private static void quick(int[] a,int l,int r){
        if(l>=r) return;
        int i=l,j=r,p=a[l+(r-l)/2];
        while(i<=j){
            while(a[i]<p) i++; while(a[j]>p) j--;
            if(i<=j){ int t=a[i]; a[i]=a[j]; a[j]=t; i++; j--; }
        }
        if(l<j) quick(a,l,j); if(i<r) quick(a,i,r);
    }

    public static void main(String[] args) {
        int[] a={5,2,9,1,5,6};
        quickSort(a);
        System.out.println(Arrays.toString(a));
    }
}
