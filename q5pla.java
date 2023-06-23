// inserion of element in beginning and ending of linked list

import java.util.LinkedList;
public class q5pla{
    public static void main(String args[]){
        LinkedList <String> l_list = new
        LinkedList<String>();
        l_list.add("Green");
        l_list.add("Blue");
        l_list.add("Yellow");
        System.out.println("Original Linked list is:"+l_list);

        l_list.addFirst("Black");
        l_list.addLast("Purple");
        System.out.println("Final Linked list is:"+l_list);
    }
}