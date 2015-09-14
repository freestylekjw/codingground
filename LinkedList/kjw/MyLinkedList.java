package kjw;

import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;


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
    			delFirst(obj,firstNode);
    		}
    	}
    }
    private void delFirst(Object obj,Node data)
    {
    	if(data!=null)
    	{
    		if(data.next.data.equals(obj))
    		{
    			data.next=data.next.next;
    			return ;
    		}
    		else
    		{
    			delFirst(obj, data.next);
    		}
    	}
    }
    public void delAll(Object obj)
    {
    	if(firstNode!=null&&obj!=null)
    	{
    		if(firstNode.equals(obj))
    		{
    			firstNode=firstNode.next;
    			delAll(obj);
    		}
    		else
    		{
    			System.out.println(new SimpleDateFormat("hh:mm:ss:SSSSSSSS").format(new Date()));
    			delAll(obj,firstNode);
    			System.out.println(new SimpleDateFormat("hh:mm:ss:SSSSSSSS").format(new Date()));
    		}
    		
    	}
    }
    private void delAll(Object obj,Node data)
    {
    	if(data.next!=null)
    	{
    		if(data.next.data.equals(obj))
    		{
    			data.next=data.next.next;
        		delAll(obj, data);
        		return;
    		}
    		else
    		{
    			if(data.next!=null)
    			{
    				delAll(obj,data.next);
    			}
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
    		return;
    	}
    	else
    		sb.append(".");
    }
}
