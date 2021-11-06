package org.campus02.lahovnik.stack;

public class Stack
{
    private int[] array;
    private int counter;

    public Stack(int[] array)
    {
        this.array = array;
        counter = 0;
    }

    public void push(int value)
    {
        if (counter > array.length)
        {
            //stack schon voll
            System.out.println("Stack is full");
            return;
        }
        array[counter] = value;
        counter++;
    }

    public int pop()
    {
        if (counter == 0)
        {
            //falls pop vor push aufgerufen wird
            System.out.println("Stack is empty");
            return -1;
        }
        counter--;
        return array[counter];

    }
}
