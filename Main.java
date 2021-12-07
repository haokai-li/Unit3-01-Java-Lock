class Main {
    public static void main(String[] args) {
        HaokaiStack aStack = new HaokaiStack();

        System.out.println("It is empty.\n");

    	System.out.println("Push: 1");
    	aStack.push(1);
        aStack.ShowStack();

    	System.out.println("Push: 2");
    	aStack.push(2);
        aStack.ShowStack();

    	System.out.println("Push: 3");
    	aStack.push(3);
        aStack.ShowStack();

        System.out.println("\nDone.");
    }
}