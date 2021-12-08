/*
* This class creates an integer stack
*
* @author  Haokai
* @version 1.0
* @since   2021-12-01
*
*/

import java.util.ArrayList;

public class HaokaiStack {
    // arrylist
    private ArrayList<Integer> stackAsArray=new ArrayList<Integer>();
    
    // and 1 method
    public void push(int decrement) {
        stackAsArray.add(decrement);
    }

    public void ShowStack() {
        System.out.println("It is start list.");
        for (int iLoop : stackAsArray) {
            System.out.println(iLoop);
        }
        System.out.println("It is end list.\n");
    }
}
