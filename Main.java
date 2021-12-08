/*
* This program uses the HaokaiStack class
*
* @author  Haokai
* @version 1.0
* @since   2021-12-01
*
*/

class Main {
    /**
    * The three.
    */
    public static final int THREE = 3;

    static void main(final String[] args) {
        HaokaiStack aStack = new HaokaiStack();

        System.out.println("It is empty.\n");
        aStack.showStack();

    	System.out.println("Push: 1");
    	aStack.push(1);
        aStack.showStack();

    	System.out.println("Push: 2");
    	aStack.push(2);
        aStack.showStack();

    	System.out.println("Push: 3");
    	aStack.push(THREE);
        aStack.showStack();

        System.out.println("\nDone.");
    }
}
