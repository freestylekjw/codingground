package kjw;
public class MyLinkedList{

    private class Node
    {
        Object data;
        Node next=null;
        Node(Object obj)
        {
            this.data=obj;
        }
        Node(Object obj,Node data)
        {
            this.data=obj;
            this.next=data;
        }
    }
    
    private Node firstNode=null;
    
    public void add(Object obj)
    {
        if(firstNode==null)
        {
            firstNode=new Node(obj);
        }
        else
        {
        	firstNode.next=new Node(obj,firstNode.next);
        }
    }
    
    public void delFirst(Object obj)
    {
    	if(firstNode!=null&&obj!=null)
    	{
    		if(obj.equals(firstNode.data))
    		{
    			firstNode=firstNode.next;
    		}
    		else
    		{
    			delFirst(obj,firstNode.next);
    		}
    	}
    }
    private void delFirst(Object obj,Node data)
    {
    	if(data!=null)
    	{
    		if(data.data.equals(obj))
    		{
    			data=data.next;
    		}
    	}
    }
    public Object getFirst()
	{
    	if(firstNode!=null)
    		return firstNode.data;
    	return null;
	}
    public String toString()
    {
    	if(firstNode!=null)
    	{
        	StringBuilder sb=new StringBuilder();
    		sb.append(firstNode.data);
    		nextToString(firstNode.next,sb);
    		return sb.toString();
    	}
    	else
    		return null;
    }
    private void nextToString(Node data,StringBuilder sb)
    {
    	if(data!=null)
    	{
    		sb.append(","+data.data);
    		nextToString(data.next, sb);
    	}
    	else
    		sb.append(".");
    }
}
