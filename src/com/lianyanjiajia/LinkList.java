package com.lianyanjiajia;

import java.security.PublicKey;
import java.util.Scanner;

public class LinkList {
    class Node
    {
        public  int data;
        public Node next;
        public Node()
        {
            next=null;
        }
    }
    public Node head;
    public LinkList()
    {
        head=new Node();
    }
    public void create()
    {
        System.out.println("请输入创建节点个数：");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Node newnode=new Node();
        Node p=head;
        for(int i=0;i<n;i++)
        {
            System.out.println("请输入该节点数据");
            newnode.data=sc.nextInt();
            p.next=newnode;
            p=newnode;
            newnode=new Node();
        }
        System.out.println("节点创建结束");
    }
    public void printallnode()
    {
        Node p=head.next;
        int i=1;
        while (p!=null)
        {
            System.out.println(i+"; "+p.data);
            i++;
            p=p.next;
        }
    }
    public void insert(int position,int value)//从1开始
    {
        Node p=head.next;
        int i=1;
        while (p!=null)
        {
           if(i+1==position)
           {
               break;
           }
            i++;
            p=p.next;
        }
        Node q=new Node();
        q.data=value;
        q.next=p.next;
        p.next=q;
    }
    public void delete(int position)
    {
        Node p=head.next;
        int i=1;
        while (p!=null)
        {
            if(i+1==position)
            {
                break;
            }
            i++;
            p=p.next;
        }
        p.next=p.next.next;
    }
    public int find(int e)
    {
        Node p=head.next;
        int i=1;
        while (p!=null)
        {
            if(p.data==e)
                return i;
            i++;
            p=p.next;
        }
        return -1;
    }
    public Node get(int position)
    {
        Node p=head.next;
        int i=1;
        while (p!=null)
        {
            if(i==position)
            {
                return p;
            }
            i++;
            p=p.next;
        }
        return null;
    }
    public static void main(String[] args) {
	// write your code here
        LinkList l=new LinkList();
        l.create();
        l.printallnode();
        System.out.println(l.find(2));
        System.out.println(l.get(3).data);
    }
}
