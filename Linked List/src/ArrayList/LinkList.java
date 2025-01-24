package ArrayList;

public class LinkList {
    private Link head;

    public LinkList() {
        head=null;
    }
    //Basa eleman ekleme
    public void insertToHead(int id,double dd){
        Link newLink =new Link(id, dd);
        newLink.next =head;
        head =newLink;

    }

    //Bastan eleman silme
    public Link deleteFirst(){
        Link temp =head;
        head=head.next;
        return temp;
    }

    //Listeleme
    public void displayList(){
        System.out.println("Liste");
        Link current =head;
        while (current !=null){
            current.displayLink();
            current=current.next;
        }
        System.out.println("");
    }
    //Bos olup olmama kontrolu
    public boolean isEmpty(){
        return (head==null);
    }















}
