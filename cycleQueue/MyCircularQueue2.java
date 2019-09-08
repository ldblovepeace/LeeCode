class MyCircularQueue2{
    private Integer[] data;
    private int head;
    private int tail;
    private int size;

    public MyCircularQueue2(int k){
        head = 0;
        tail = -1;
        data = new Integer[k];
        size = k;
    }

    public boolean enQueue(int value){
        if(isFull()) return false;
        else{
            tail = right(tail);
            data[tail] = value;
            return true;
        }
    }

    public boolean deQueue(){
        if(isEmpty()) return false;
        else{
            data[head] = null;
            if(tail==head){
                head = 0;
                tail = -1;
                return true;
            }else{
                head = right(head);
                return true;
            }
        }
    }

    public int Front(){
        if (this.isEmpty()) return -1;
        else return data[this.head];
    }

    public int Rear(){
        if (this.isEmpty()) return -1;
        else return data[this.tail];
    }

    public boolean isEmpty(){
        if (this.tail == -1) return true;
        else return false;
    }

    public boolean isFull(){
        if (tail == -1) return false;
        else{
            if (right(tail) == head) return true;
            else return false;
        }
    }

    private int right(int ends){
        if(ends==this.size-1) return 0;
        else return ends+1;
    }

}