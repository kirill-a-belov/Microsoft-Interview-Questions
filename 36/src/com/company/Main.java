package com.company;

public class Main {

    public static void main(String[] args) {
	    LinkedList fixedList = new LinkedList();
        LinkedList anyOtherList = new LinkedList();

        fixedList.add(1);
        fixedList.add(4);
        fixedList.add(2);
        fixedList.add(3);
        fixedList.add(5);

        anyOtherList.add(0);
        anyOtherList.add(1);
        anyOtherList.add(2);
        anyOtherList.add(3);
        anyOtherList.add(4);
        anyOtherList.add(5);
        anyOtherList.add(6);
        anyOtherList.add(7);
        anyOtherList.add(8);
        anyOtherList.add(9);


        fixedList.print();
        anyOtherList.print();

        LinkedList.Link temp = anyOtherList.first;
        while (temp!=null){


            System.out.print("Is element "+temp.getData() +  " in list " + "anyOtherList? ");
            if (fixedList.isElementInList(temp) == true) {
                System.out.println(" Yes!");
            } else {
                System.out.println(" No!");
            }


            temp = temp.next;
        }



    }



}
