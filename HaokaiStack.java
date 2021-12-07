import java.util.ArrayList;

public class HaokaiStack {
    // arrylist
    ArrayList<Integer> stackAsArray=new ArrayList<Integer>();
    
    // and 1 method
    public void push(int decrement) {
        stackAsArray.add(decrement);
    }

    public void ShowStack() {
        for (int iLoop : stackAsArray) {
            System.out.println(iLoop);
        }
    }
}
