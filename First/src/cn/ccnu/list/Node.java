package cn.ccnu.list;

public class Node {
	private String data;
	private Node next;
	
	public Node(String data){
		this.data=data;
	}
	public String getData(){
		return data;
	}
	public void setNext(Node next){
		this.next=next;
	}
	public Node getNext(){
		return next;
	}
}
