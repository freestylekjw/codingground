public class MyLinkedList{

    private class Data
    {
        private Object data;
        private Data next=null;
        Data(Object obj)
        {
            this.data=obj;
        }
        Data(Object obj,Data data)
        {
            this.data=obj;
            this.next=data;
        }
    }
    
    private Data firstData=null;
    
    public void add(Object obj)
    {
        if(firstData==null)
        {
            firstData=new Data(obj);
        }
    }
    
}
