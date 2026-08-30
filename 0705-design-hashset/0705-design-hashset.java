class MyHashSet {
    int[] table;
    int sz=15000;
    public MyHashSet() {
        table=new int[sz];
        Arrays.fill(table,-1);
    }
    
    public void add(int key) {
        int hash=key%sz;
        if(table[hash]==key) return;
        if(table[hash]==-1 || table[hash]==-2) table[hash]=key;
        else{
            int i=1;
            int idx=hash;
            while(table[idx]!=-1 && table[idx]!=-2){
                idx=(hash+i*i)%sz;
                if(table[idx]==key) return;
                i++;
            }table[idx]=key;
        }
    }
    
    public void remove(int key) {
        int hash=key%sz;
        if(table[hash]==key) table[hash]=-2;
        else{
            int idx=hash;
            for(int i=1;i<=sz;i++){
                idx=(hash+i*i)%sz;
                if(table[idx]== -1) return;
                if(table[idx]== key) table[idx]=-2;
            }
        }
    }
    
    public boolean contains(int key) {
        int hash=key%sz;
        if(table[hash]==key) return true;
        else{
            int idx=hash;
            for(int i=1;i<=sz;i++){
                idx=(hash+i*i)%sz;
                if(table[idx]==-1) return false;
                if(table[idx]==key) return true;
            }
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */