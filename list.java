import java.util.*;
public class list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a= new ArrayList();
		for(int i=0;i<10;i++)
		{
			a.add(i);
		}
		System.out.println(a);
		System.out.println(a.get(1));
		a.set(0, 20);
		System.out.println(a);
		a.remove(0);
		System.out.println(a);
		System.out.println("Linked List");
		LinkedList l=new LinkedList();
		l.add(2);
		l.add(3);
		System.out.println(l);
		System.out.println(l.get(1));
		System.out.println(l.getFirst());
	}

}
