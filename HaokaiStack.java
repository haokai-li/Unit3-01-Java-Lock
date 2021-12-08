/*
* This class creates an integer stack
*
* @author  Haokai
* @version 1.0
* @since   2021-12-01
*
*/

import java.util.ArrayList;

/**
* This is the standard "Towers of Hanoi" program.
*/
public class HaokaiStack {
    private ArrayList<Integer> stackAsArray = new ArrayList<Integer>();

    /**
    * and 1 method.
    *
    * @param decrement
    *
    */
    public void push(final int decrement) {
        stackAsArray.add(decrement);
    }

    /**
    * show stack.
    */
    public void showStack() {
        System.out.println("It is start list.");
        for (int iLoop : stackAsArray) {
            System.out.println(iLoop);
        }
        System.out.println("It is end list.\n");
    }
}
