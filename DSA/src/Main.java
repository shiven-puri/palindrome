import java.util.*;
public class Main {
    public static void main(String[] args){
        linkedlist list = new linkedlist();
        list.insert(5);
        list.insert(6);
        list.insert(7);
        list.InsertAtHead(9);
        list.insertAt(22,2);
        list.delete(0);

        list.show();
    }
}