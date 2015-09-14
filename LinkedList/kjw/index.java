package kjw;
public class index
{
    public static void main(String a[])
    {
        MyLinkedList list=new MyLinkedList();
        list.add(22);
        list.add(23);
        list.add(24); 
        System.out.println(list.toString());
        list.delFirst(23);
        System.out.println(list.toString());
    }
}
