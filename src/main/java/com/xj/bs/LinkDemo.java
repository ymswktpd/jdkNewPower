package com.xj.bs;


class Link{
    int val;
    Link next;
    Link(int va,Link li){
        this.val = va;
        this.next = li;
    }
    Link(int va){
        this.val = va;
    }
}

/**
 * @author xijie
 * @version V1.0
 * Date 2021/1/24 0:04
 * @Description:
 */
public class LinkDemo
{


    public static void main(String[] args) {
        //删除链表中某一元素
//        LinkDemo.delElement();
        LinkDemo.delOrderRepeatElement();

    }

    //删除链表中某一元素
    public static void delElement(){
        Link link0 = new Link(0);
        Link link1 = new Link(1,new Link(1,new Link(6, null)));
        link0.next = link1;
        Link link = link0;
        while (link != null && link.next != null){
            if(link.next.val == 6){
                link.next = link.next.next;
            }
            link = link.next;
        }
        link0 = link0.next;
        while (link0 != null){
            System.out.println(link0.val);
            link0 = link0.next;
        }
    }

    //删除排序链表中重复元素
    public static void delOrderRepeatElement(){
        Link link0 = new Link(0);
        Link link = new Link(1,new Link(1,new Link(2,new Link(6,new Link(6,null)))));
        link0.next = link;
        while (link != null && link.next !=null){
           if(link.val == link.next.val){
               link.next = link.next.next;
           }else {
               link = link.next;
           }
        }
        link0 = link0.next;
        while (link0 != null){
            System.out.println(link0.val);
            link0 = link0.next;
        }
    }
}
