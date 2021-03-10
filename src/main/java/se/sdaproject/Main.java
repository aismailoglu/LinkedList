package se.sdaproject;

public class Main {

    public static void main(String[] args) {


        LinkedList List = new LinkedList();
        List.add(5);
        List.add(7);
        List.add(8);
        List.add(55);
        System.out.println(List.search(5));
        System.out.println(List.getIndex(99));
    }
}