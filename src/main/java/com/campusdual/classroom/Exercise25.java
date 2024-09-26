package com.campusdual.classroom;

import java.util.Stack;

public class Exercise25 {
    public static Stack<String> createStack() {
        Stack<String> stack = new Stack<>();

        //Se añaden los elementos al Stack
        stack.add("Smith");
        stack.add("Montessori");
        stack.add("Peralta");
        stack.add("House");

        return stack;
    }

    public static void printAndEmptyStack(Stack<String> stack) {
        while (!stack.isEmpty()) {
            // Imprime el elemento en la parte superior y lo elimina
            System.out.println(stack.pop());
        }
    }

    public static void main(String[] args) {

    }



}
