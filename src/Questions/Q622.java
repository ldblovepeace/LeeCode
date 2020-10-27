package Questions;

public class Q622 {
	int front;
	int rear;
	int[] queue;
	
	/** Initialize your data structure here. Set the size of the queue to be k. */
    public Q622(int k) {
    	front = -1;
    	rear = -1;
    	queue = new int[k];
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
    	if(front == -1) {
    		front = 0;
    		rear = 0;
    		queue[rear] = value;
    		return true;
    	} else if(isFull()) {
    		return false;
    	} else {
    		if(rear == queue.length-1) {
    			rear = 0;
    		} else {
    			rear = rear + 1;
    		}
    		queue[rear] = value;
    		return true;
    	}
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
    	if(isEmpty()) {
    		return false;
    	} else if(rear == front) {
    		rear = -1;
    		front = -1;
    		return true;
    	}
    	else {
    		if(front == queue.length-1) {
    			front = 0;
    		} else {
    			front = front + 1;
    		}
			return true;
    	}
    }
    
    /** Get the front item from the queue. */
    public int Front() {
    	if (isEmpty()) {
    		return -1;
    	}
    	return queue[front];
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
    	if (isEmpty()) {
    		return -1;
    	}
    	return queue[rear];
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
    	if(front == -1) {
    		return true;
    	} else 
    		return false;
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
    	if(front == rear+1) {
    		return true;
    	} else if(Math.abs(front-rear) == queue.length-1) {
    		return true;
    	}else
    		return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */