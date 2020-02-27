package cse360assign2;

public class Main {
	public static void main(String[] args) {
        SimpleList list = new SimpleList();
        
        for (int i = 0; i < 11; i++) {
            list.add(i);
        }
        System.out.println(list.toString());
        list.count();
        
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        System.out.println(list.toString());
        list.count();
        
        list.remove(4);
        System.out.println(list.toString());
        list.count();
        list.length();
        
        list.remove(10);
        System.out.println(list.toString());
        list.count();
        list.length();
        
        list.remove(1);
        System.out.println(list.toString());
        list.count();
        list.length();
        
        list.remove(0);
        System.out.println(list.toString());
        list.count();
        list.length();
        
        list.remove(6);
        System.out.println(list.toString());
        list.count();
        list.length();
        
        list.remove(7);
        System.out.println(list.toString());
        list.count();
        list.length();
        
        list.add(4);
        list.add(5);
        System.out.println(list.toString());
        list.count();
        list.length();
        
        list.add(7);
        System.out.println(list.toString());
        list.count();
        list.length();
	}
}
