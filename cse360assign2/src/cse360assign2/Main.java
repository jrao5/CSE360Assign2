package cse360assign2;

public class Main {
	public static void main(String[] args) {
        SimpleList list = new SimpleList();
        
//        for (int i = 1; i < 11; i++) {
//        	System.out.println("Adding " + i);
//            list.add(i);
//        }
//        
//        System.out.println(list.toString());
//        list.count();
//        
//        for (int i = 0; i < 5; i++) {
//        	System.out.println("Adding " + i);
//            list.add(i);
//        }
//        System.out.println(list.toString());
//        list.count();
//        
//        System.out.println("\n======== Removing 4 ========");
//        list.remove(4);
//        System.out.println(list.toString());
//        list.count();
//        
//        list.remove(10);
//        System.out.println(list.toString());
//        list.count();
//        
//        list.remove(1);
//        System.out.println(list.toString());
//        list.count();
//        
//        list.remove(0);
//        System.out.println(list.toString());
//        list.count();
//        
//        list.remove(6);
//        System.out.println(list.toString());
//        list.count();
//        
//        list.remove(7);
//        System.out.println(list.toString());
//        list.count();
//        
//        list.add(4);
//        list.add(5);
//        System.out.println(list.toString());
//        list.count();
//        
//        list.add(7);
//        System.out.println(list.toString());
//        list.count();
//        
//        System.out.println("\n======== Appending 14 ========");
//        list.append(14);
//        System.out.println(list.toString());
//        list.count();
//        
//        System.out.println("\nFirst value in list: " + list.first());
//        System.out.println("\nLast value in list: " + list.last());
//        System.out.println("\nSize of the list: " + list.size());
//        
//        list.remove(14);
//        
//        System.out.println(list.toString());
//        list.count();
        
        list.add(5);
		list.add(3);
		list.add(2);
		list.add(5);
		list.add(7);
		list.add(12);
		list.add(15);
		list.add(16);
		list.add(2);
		list.add(4);
		
		list.remove(4);
		
		System.out.println(list.toString());
	}
}
