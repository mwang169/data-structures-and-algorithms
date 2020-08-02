package learn.data.structures.chapter06;

import learn.data.structures.chapter03.SinglyLinkedList;

/**
 *
 * @author rogerio
 */
public class LinkedQueue<E> implements Queue<E> {

   private SinglyLinkedList<E> list = new SinglyLinkedList<>();

   @Override
   public void enqueue(E element) {
      list.addLast(element);
   }

   @Override
   public E dequeue() {
      return list.removeFist();
   }

   @Override
   public E first() {
      return list.first();
   }

   @Override
   public int size() {
      return list.getSize();
   }

   @Override
   public boolean isEmpty() {
      return list.isEmpty();
   }

}
