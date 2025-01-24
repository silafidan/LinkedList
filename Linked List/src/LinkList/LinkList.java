package LinkList;

public class LinkList {
    private Link head;
    private Link tail;

    public LinkList() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
        //head == null ise true gonderilir
    }

    public void insertToHead(long d) {
        Link newLink = new Link(d);
        //head null mı kontrol edilir
        if (isEmpty()) {
            tail = newLink;
        }
        //mevcut head yeni kaydın nexti ya da
        newLink.next = head;
        head = newLink;
    }

    public void insertLast(long d) {
        Link newLink = new Link(d);
        if (isEmpty()) {
            head = newLink;
        } else {
            //mevcut tailın nexti yeni linki gösterecek
            tail.next = newLink;
            //tail artık yeni link olacak
            tail = newLink;
        }

    }
    public long deleteFromHead(){
        long temp=head.data;
        if (head.next==null){
            tail=null;
        }
        head=head.next;
        return temp;
    }
    //listeleme
    public void displayList(){
        System.out.print("Liste (head -->tail): ");
        Link current = head;
        while (current!=null){
            current.displayLink();
            current=current.next;
        }
        System.out.println("");
    }


















}
