package com.smirnovas.datastructures;

import java.util.Iterator;

public class CircularDoublyLinkedList {

   private class Node {

       Object data;
       Node next;
       Node prev;

       Node( Object data, Node next, Node prev ){
           this.data = data;
           this.next = next;
           this.prev = prev;
       }
   }

   private Node front;
   private Node rear;
   private int count;

   public CircularDoublyLinkedList(){
       head = null;
       tail = null;
       count = 0;
   }

   public void addFront( Object data ){
       Node temp = front;
       front = new Node( data, front, null);
       front.next = temp;
       if( temp != null )
           temp.prev = front;
       if( tail == null )
           tail = front;
       count++;
   }

   public void addRear( Object data ) {

   }

   public Object removeFront(){

   }

   public Object removeRear(){

   }

   public void remove( Object data ) {

   }

   public void removeAll(){
       front = null;
       rear = null;
       count = 0;
   }

   public Object peekFront(){
       return front;
   }

   public Object peekRear(){
       return rear;
   }

  public Object[] retrieveAllValuesAsArray(){
       Object[] allValues = new Object[count];
       //implementation
       return allValues;
  }

  public int retrieveSize(){
       return count;
  }

  public boolean contains( Object data ){

  }

  public boolean hasDuplicates(){

  }

  public boolean isReadOnly(){

  }

  public void setAsReadOnly(){

  }

  public Iterator retrieveIterator(){

  }

  public String toString(){

  }

}
