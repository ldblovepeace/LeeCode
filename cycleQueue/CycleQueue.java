import com.sun.glass.ui.SystemClipboard;

import MyCircularQueue;
public class CycleQueue {

	public static void main(String[] args) {
		MyCircularQueue2 c2 = new MyCircularQueue2(4);
		System.out.println(c2.enQueue(3));
		System.out.println(c2.Front());
		System.out.println(c2.isFull());
		System.out.println(c2.enQueue(7));
		System.out.println(c2.enQueue(2));
		System.out.println(c2.enQueue(5));
		System.out.println(c2.deQueue());
		System.out.println(c2.enQueue(4));
		System.out.println(c2.enQueue(2));
		System.out.println(c2.isEmpty());
		System.out.println(c2.Rear());
		// MyCircularQueue2 circularQueue = new MyCircularQueue2(3); // ���ó���Ϊ 3

		// System.out.println(circularQueue.enQueue(1)); // ���� true

		// System.out.println(circularQueue.enQueue(2)); // ���� true

		// System.out.println(circularQueue.enQueue(3)); // ���� true

		// System.out.println(circularQueue.enQueue(4)); // ���� false����������

		// System.out.println(circularQueue.Rear()); // ���� 3

		// System.out.println(circularQueue.isFull()); // ���� true

		// System.out.println(circularQueue.deQueue()); // ���� true

		// System.out.println(circularQueue.enQueue(4)); // ���� true

		// System.out.println(circularQueue.Rear()); // ���� 4

		// MyCircularQueue2 c1 = new MyCircularQueue2(6);
		// System.out.println(c1.enQueue(6));
		// System.out.println(c1.Rear());
		// System.out.println(c1.Rear());
		// System.out.println(c1.deQueue());
		// System.out.println(c1.enQueue(5));
		// System.out.println(c1.Rear());
		// System.out.println(c1.deQueue());
		// System.out.println(c1.Front());
		// System.out.println(c1.deQueue());
		// System.out.println(c1.deQueue());
		// System.out.println(c1.deQueue());
		//["MyCircularQueue","enQueue","Front","isFull","enQueue","enQueue","enQueue","deQueue","enQueue","enQueue","isEmpty","Rear"]
// [[4],[3],[],[],[7],[2],[5],[],[4],[2],[],[]]

	}
}
/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k); boolean param_1 =
 * obj.enQueue(value); boolean param_2 = obj.deQueue(); int param_3 =
 * obj.Front(); int param_4 = obj.Rear(); boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */

// ["MyCircularQueue","enQueue","Rear","Rear","deQueue","enQueue","Rear","deQueue","Front","deQueue","deQueue","deQueue"]
// [[6],[6],[],[],[],[5],[],[],[],[],[],[]]