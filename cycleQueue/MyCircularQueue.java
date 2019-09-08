import java.util.List;
import java.util.ArrayList;

public class MyCircularQueue {
		
    private List<Integer> data;
    private int head;
    private int tail;
    private int size;
    private int used;

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        data = new ArrayList<Integer>();
        head = -1;
        tail = -1;
        size = k;
        used = 0;
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(!this.isFull()){
            tail = right(tail);
            if(this.used == 1){
                data.set(tail, value);
            } else {
                head = 0;
                data.add(tail, value);
            }
            return true;
        } else {
            return false;
        }
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(!this.isEmpty()){
            //data.remove(head);
            data.set(head,null);
            if(head==tail) {tail = -1;head= -1;}
            else head = right(head);
            //tail = left(tail);
            return true;
        } else {
            return false;
        }
    }
    
    /** Get the front item from the queue. */
    public int Front() {
        if(this.isEmpty()) return -1;
        else return data.get(head);
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
        if(this.isEmpty()) return -1;
        else return data.get(tail);
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        if (tail == -1) return true;
        else return false;
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        if (tail>=0 && (this.head - this.tail) == (this.size-1) || (this.tail - this.head) == (this.size-1)) return true;
        else return false;
    }

    private int right(int ends){
        if (ends == this.size-1){
            this.used = 1;
            return 0;
        } else {
            return ends+1;
        }
    }

    private int left(int ends){
        if (ends == 0){
            return this.size-1;
        } else{
            return ends-1;
        }
    }
}