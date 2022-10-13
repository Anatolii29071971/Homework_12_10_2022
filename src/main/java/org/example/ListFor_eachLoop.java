package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListFor_eachLoop {
    /*


используя ListIterator
для всех случаев сделать замер времени
результат вывести в консоль */


    public static void main(String[] args) {
        // 1. создать лист, наполнить его 10М> елементами
        int randomArrLenght = 20;

        long timeStart = System.nanoTime();
        int temp;
        List<Integer> myList = new ArrayList<>();
        System.out.print("myList: ");
        for (int j = 0; j < randomArrLenght; j++) {
            myList.add((int) (j * 10 * Math.random()));
            System.out.print(myList.get(j) + ", ");
        }
        System.out.println();


        //внутри тела кладем i- тый элемент в переменную temp
        // перебрать for-each loop
        timeStart = System.nanoTime();
        for (Integer i : myList
        ) {
            temp = i;
            System.out.print(temp + ", ");
        }
        System.out.println();
        System.out.println("Int List lenght " + randomArrLenght + " for-each loop tims = "
                + (System.nanoTime() - timeStart) + " ns");

        // classic for и вызываем list.size() для каждой итерации
        timeStart = System.nanoTime();
        for (int i = 0; i < myList.size(); i++) {
            temp = myList.get(i);
            System.out.print(temp + ", ");
        }
        System.out.println();
        System.out.println("Int List lenght " + randomArrLenght + " for + list.size() tims = "
                + (System.nanoTime() - timeStart) + " ns");

        //classic for, но list.size() определяем в переменную
        timeStart = System.nanoTime();
        for (int i = 0; i < randomArrLenght; i++) {
            temp = myList.get(i);
            System.out.print(temp + ", ");
        }
        System.out.println();
        System.out.println("Int List lenght " + randomArrLenght + " for + randomArrLenght tims = "
                + (System.nanoTime() - timeStart) + " ns");


        // classic for, list.size() определяем в переменную, перебираем с конца (i--)

        timeStart = System.nanoTime();

        for (int i=randomArrLenght; i<0; i--){
            temp = myList.get(i);
            System.out.print(temp + ", ");
        }
        System.out.println();
        System.out.println("Int List  lenght " + randomArrLenght + " for  randomArrLenght -- tims = "
                + (System.nanoTime() - timeStart) + " ns");


        //используя Itertor

        Iterator<Integer> iterMy= myList.iterator();
        timeStart = System.nanoTime();
        while (iterMy.hasNext()){
            temp = iterMy.next();
            System.out.print(temp + ", ");
        }
        System.out.println();
        System.out.println("Int List  lenght " + randomArrLenght + " iterator tims = "
                + (System.nanoTime() - timeStart) + " ns");



        //используя ListIterator

        ListIterator<Integer> listIteratorMy= myList.listIterator();
        timeStart = System.nanoTime();
        while (listIteratorMy.hasNext()){
            temp = listIteratorMy.next();
            System.out.print(temp + ", ");
        }
        System.out.println();
        System.out.println("Int List  lenght " + randomArrLenght + " listiterator tims = "
                + (System.nanoTime() - timeStart) + " ns");

    }

}