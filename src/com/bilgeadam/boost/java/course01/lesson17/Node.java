package com.bilgeadam.boost.java.course01.lesson17;

public class Node {
	int data;			// veri kýsmý. Her çeþit veri olabilir
	Node next;			// bir sonraki düðüm (node)
	
	void setData(int data) {
		this.data = data;
	}
	
	int getData() {
		return this.data;
	}
	
	void setNext(Node next) {
		this.next = next;
	}
	
	Node getNext() {
		return this.next;
	}

	public String content() {
		return "Düðümün içeriði: [data=" + data + ", next=" + next + "]";
	}
	
	public String allContent() {
		String retVal = "";
		Node temp = this;
		while (temp != null) {
			retVal += temp.data  + " --> ";
			temp = temp.next;
		}
		return retVal;
	}

}
