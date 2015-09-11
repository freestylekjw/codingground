public class MyLinkedList{

    private class Data
    {
        Object data;
        Data next=null;
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
    public Object getFirst()
	{
		return fistData.data;
	}
}
