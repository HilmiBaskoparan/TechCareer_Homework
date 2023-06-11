public class MyList<T> {    
    // MyList() : Boş contructor kullanılırsa dizinin başlangıç boyutu 10 olmalıdır.
    // MyList(int capacity) : Dizinin başlangıç değeri capacity parametresinden alınmalıdır.
    // size() : dizideki eleman sayısını verir.
    // getCapacity() : dizinin kapasite değerini verir.
    // add(T data) : sınıfa ait diziye eleman eklemek için kullanılmalıdır. Eğer dizide yeteri kadar yer yok ise, dizi boyutu * 2 
    // get(int index): verilen indisteki değeri döndürür. Geçersiz indis girilerse null döndürür.
    // remove(int index): verilen indisteki veriyi silmeli ve silinen indis sonrasında ki verileri sol doğru kaydırmalı. Geçersiz indis girilerse null döndürür.
    // set(int index, T data) : verilen indisteki veriyi yenisi ile değiştirme işlemini yapmalıdır. Geçersiz indis girilerse null döndürür.
    // String toString() : Sınıfa ait dizideki elemanları listeleyen bir metot.
    // int indexOf(T data) : Parametrede verilen nesnenin listedeki indeksini verir. Nesne listede yoksa -1 değerini verir.
    
    
    
    private int capacity = 10;
    private T[] array;
    private int lastIndex = 0;

    public MyList() {
        this.array = (T[]) new Object[capacity];
    }

    public MyList(int capacity) {
        this.capacity = capacity;
        this.array = (T[]) new Object[this.capacity];
    }
    
    public int size() {
        return lastIndex;
    }
    
    public void add(T data) {
        if (lastIndex == this.capacity) {
            T[] newArr = (T[]) new Object[this.capacity * 2];
            for (int i = 0; i < this.capacity; i++) {
                newArr[i] = this.array[i];
            }
            this.capacity = this.capacity * 2;
            this.array = newArr;
        }
        this.array[lastIndex] = data;
        lastIndex++;
    }
    
    public T get(int index) {
        return this.array[index];
    }
    
    public void remove(int index) {
        for (int i = index; i < this.capacity-1; i++) {
            this.array[i] = this.array[i+1];
        }
    }
    
    public void set(int index, T data) {
        this.array[index] = data;
    }
    
    public String toStringList() {
        String str = "";
        for (int i = 0; i < this.capacity; i++) {
            if (this.array[i] != null) {
                if (i == this.capacity - 1) {
                    str += this.array[i];
                }else {
                    str += this.array[i] + ",";
                }
            }
        }
        return "[" + str + "]";
    }
    
    /*public int indexOf(T data) {
        int index = -1;
        for (int i = 0; i < this.capacity; i++) {
            if (this.array[i].equals(data)) {
                index = r
                return i;
            }else {
                return -1;
            }
        }
    }*/
    
    public MyList<T> subList(int start, int finish) {
        MyList<T> newList = new MyList<>();
        for (int i = start; i <= finish; i++) {
            newList.add(this.array[i]);
        }
        return newList;
    }
    
    public boolean contains(T data) {
        boolean flag = false;
        int count = 0;
        for (int i = 0; i < this.capacity; i++) {
            if (this.array[i] == data) {
                flag = true;
                count++;
            }
        }
        System.out.println("How many contains: " + count);
        return flag;
    }
    
    
    
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
}
