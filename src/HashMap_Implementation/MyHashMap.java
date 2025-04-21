package HashMap_Implementation;

import java.util.HashMap;

public class MyHashMap<K,V> {
    private static final int initialCapcity=16;
    private static final int maxCapcity=1>>30;

    //put
    //get
   public Entry[] hashtable;

    public MyHashMap() {
        this.hashtable = new Entry[initialCapcity];
    }
    public MyHashMap(int capacity) {
        int  tableSize=tablesize(capacity);
        this.hashtable = new Entry[tableSize];
    }

    final int tablesize(int capacity) {
        int n=capacity-1;
        n|=n>>>1;
        n|=n>>>2;
        n|=n>>>4;
        n|=n>>>8;
        n|=n>>>16;
        if(n<0){
            return 1;
        }
        if(n>=maxCapcity){
            return maxCapcity;
        }
        else{
            return n+1;
        }


    }

    public void put(K i, V bc) {
        int hashcode=i.hashCode()%hashtable.length;
        Entry node=hashtable[hashcode];

        if(node==null){
            Entry newnode=new Entry<>(i,bc);
            hashtable[hashcode]=newnode;
        }
        else{
            Entry previousNode=node;
            while(node!=null){
                if(node.key.equals(i)){
                    node.value=bc;
                    return;
                }
                previousNode=node;
                node=node.next;
            }
            Entry newNode=new Entry<>(i,bc);
            previousNode.next=newNode;
        }
    }

    public V get(K i){
       int hashcode=i.hashCode()%hashtable.length;
       Entry node=hashtable[hashcode];
       while(node!=null){
           if(node.key==i){
               System.out.println(node.value);
               return (V) node.value;
           }
           node=node.next;
       }
       return null;
    }


}
