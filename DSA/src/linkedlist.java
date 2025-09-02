public class linkedlist {
    Node head;
    public void insert(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        if(head == null){
            head = node;
        }
        else{
            Node n = head;
            while(n.next != null){
                n = n.next;
            }
            n.next = node;
        }
    }
    public void show(){
        Node n = head;
        while(n.next != null){
            System.out.println(n.data + " ");
            n = n.next;
        }
        System.out.println(n.data);

    }
    public void InsertAtHead(int data){
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }
    public void insertAt(int data, int index){
        Node node = new Node();
        node.data = data;
        node.next = null;
        if(index == 0){
            InsertAtHead(data);
        }
        else{
            Node n = head;
            for(int i = 0; i < index - 1; i++){
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }
    public void delete(int index) {
        Node n = head;
        if (index == 0) {
            head = head.next;
        } else {
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            n.next = n.next.next;
        }
    }
}
