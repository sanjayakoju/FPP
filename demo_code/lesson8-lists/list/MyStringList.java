package lesson8.list;

import java.util.Arrays;

public class MyStringList {
	private final int INITIAL_LENGTH = 4;
	private String[] strArray; 
	private int size;
	
	public MyStringList() {
		strArray = new String[INITIAL_LENGTH];
		size = 0;
	}
	// Add element in last
	public void add(String s){
		if(s==null) return;
		if(size == strArray.length) resize();
		strArray[size++] = s;
	}
	
	public String get(int i){
		if(i < 0 || i >= size){
			return null;
		}
		return strArray[i];
	}
	
	public boolean find(String s){
		if(s==null) return false;
		 for(int i = 0; i<size; i++)
		{
			 if(strArray[i].equals(s)) return true;
		}
		return false; // The element is not in the list
	}
	
	public void insert(String s, int pos){
		if(pos > size || pos<0 ) return;
		if(pos == strArray.length||size+1 > strArray.length) {
			resize();
		}
		String[] temp = new String[strArray.length+1];
		System.arraycopy(strArray,0,temp,0,pos); // src, spos,des,dspos,number of elements
		temp[pos] = s;
		
		System.arraycopy(strArray,pos,temp,pos+1, strArray.length - pos);
		strArray = temp;
		++size;
	}
	
/*	 public void insert(String s, int pos) {
	 if(pos<0 || pos > size) return;
		if(pos == strArray.length||size+1 > strArray.length) {
			resize ();
		}
		String[] temp = new String[strArray.length+1];
       for(int i = 0; i < pos; i++)
        temp[i] = strArray[i];
    temp[pos] = s;
    for(int i = pos + 1; i < strArray.length; i++)
        temp[i] =strArray[i - 1];
    strArray = temp;
		++size;
}*/
	
	public boolean remove(String s){
		if(size == 0) return false; // list is empty
		if(s==null) return false;
		int index = -1;
		for(int i = 0; i < size; ++i ){
			if(strArray[i].equals(s)){
				index = i;
				break;
			}
		}
		if(index==-1) return false; // s is not found in the list
		String[] temp = new String[strArray.length];
		System.arraycopy(strArray,0,temp,0,index);
		System.arraycopy(strArray,index+1,temp,index,strArray.length-(index+1));
		strArray = temp;
		--size;
		return true;
	}

	private void resize(){
		System.out.println("resizing");
		int len = strArray.length;
		int newlen = 2*len;
		String[] temp = new String[newlen];
		System.arraycopy(strArray,0,temp,0,len);
                // strArray = Arrays.copyOf(strArray, newlen);
		strArray = temp;
	}
	public String toString(){
		StringBuilder sb = new StringBuilder("[");
		for(int i = 0; i < size-1; ++i){
			sb.append(strArray[i]+", ");
		}
		sb.append(strArray[size-1]+"]");
		return sb.toString();
	}
	public int size() {
		return size;
	}
	public boolean isEmpty(){
		return(size==0);
	}
    public Object clone()
    {
    	String[] temp = Arrays.copyOf(strArray, size);
    	return temp;
    	
    }
		public static void main(String[] args) {
			MyStringList l = new MyStringList();
			l.add("Bob");
			l.add("Steve");
			l.add("Susan");
			l.add("Mark");
			l.insert("Renuka", 2);
			System.out.println(l);
			l.add("Dave");
			System.out.println("The list of size "+l.size()+" is "+l);
			l.remove("Mark");
			l.remove("Bob");
			System.out.println("The list of size "+l.size()+" is "+l);
			l.insert("Richard",3);
			System.out.println("The list of size "+l.size()+" after inserting Richard into pos 3 is "+l);
			l.insert("Tonya",0);
			System.out.println("The list of size "+l.size()+" after inserting Tonya into pos 0 is "+l);		
          //  String[] x = (String[]) l.clone();
          //  System.out.println(Arrays.toString(x));
	}

}