// https://www.hackerrank.com/contests/applied-course/challenges/swap-the-k-th-node-and-k1-th-node-of-the-end-of-linked-list/problem
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Node{
    int data;
    Node next;
}
public class Main {
     Node head;
     Node tail;
    
    public Main(){
        head = new Node();
        head.data = -1;
        tail = new Node();
    }
    public void insert(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        // System.out.println(head.data);
        if(head.data==-1){
            head = newNode;
            tail = newNode;
            // System.out.println(head.data+"***");
        }
        else{
            // System.out.print("asdf");
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void print(){
        Node p = head;
        while(p!=null){
            System.out.print(p.data + " ");
            p = p.next;
        }
    }
    public void kth(int k){
        Node dummy = new Node();
        dummy.next = head;
        Node slow = dummy;
        Node fast = head;
        for(int i=0; i<k; i++){
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        Node temp = slow.next;
        slow.next = temp.next;
        temp.next = temp.next.next;
        slow.next.next = temp;
         
    }
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        Main list = new Main();
        int n = sc.nextInt();
        int k = sc.nextInt();
        // System.out.print(n + " "+ k);
        for(int i=0; i<n; i++){
            int val = sc.nextInt();
            // System.out.print(val+ " ");
            list.insert(val);
        }
        // list.print();
        list.kth(k);
        list.print();
    }
}
