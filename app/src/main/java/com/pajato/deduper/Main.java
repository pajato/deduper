/*
 * Copyright (C) 2016 Pajato Technologies LLC.
 *
 * This file is part of Pajato deduper.

 * deduper is free software: you can redistribute it and/or modify it under the terms of the GNU
 * General Public License as published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.

 * deduper is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.

 * You should have received a copy of the GNU General Public License along with deduper.  If not,
 * see http://www.gnu.org/licenses
 */

package com.pajato.deduper;

import com.pajato.deduper.util.Node;

import java.io.*;
import java.util.*;

/** Implement the application program, deduper, to remove duplicate values in a linked list. */
public class Main {

    /** Return the head of a list with no duplicate nodes. */
    public static Node removeDuplicates(Node head) {
        // Process the given list.
        Node node = head;
        while (node != null) {
            Node tmp = node.next;
            while (tmp != null && tmp.data == node.data) {
                node.next = tmp.next;
                tmp = tmp.next;
            }
            node = node.next;
        }
        return head;
    }

    // The following code is supplied by the HackerRank folks.  Yuck.

    public static  Node insert(Node head,int data) {
        Node p=new Node(data);
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else {
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;
        }
        return head;
    }

    public static void display(Node head) {
        Node start=head;
        while(start!=null) {
            System.out.print(start.data+" ");
            start=start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        Node head=null;
        int T=sc.nextInt();
        while (T-->0) {
            int ele=sc.nextInt();
            head=insert(head,ele);
        }
        head=removeDuplicates(head);
        display(head);
    }
}
