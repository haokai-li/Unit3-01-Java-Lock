class Main {
    public static void main(String[] args) {
        HaokaiStack aStack = new HaokaiStack();

    	aStack.push(1);
    	System.out.println("Push: 1");
    	aStack.push(2);
    	System.out.println("Push: 2");
        aStack.push(3);
    	System.out.println("Push: 3");
        System.out.println("");

        aStack.ShowStack(aStack.stackAsArray);

        System.out.println("\nDone.");
    }
}