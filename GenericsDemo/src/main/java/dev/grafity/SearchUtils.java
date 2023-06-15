package dev.grafity;

public class SearchUtils<T> {
    public int search(T[] arrays, T key){
        for(int i=0;i<arrays.length;i++){
            if(arrays[i].equals(key)){
                return i;
            }
        }
        return -1;
    }
   /* public int search(String[] arrays, String key){
        for(int i=0;i<arrays.length;i++){
            if(arrays[i].equals(key)){
                return i;
            }
        }
        return -1;
    }*/
}
