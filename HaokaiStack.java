import java.util.ArrayList;

public class HaokaiStack {
    // arrylist
    ArrayList<Integer> stackAsArray=new ArrayList<Integer>();
    
    // and 1 method
    public void push(int decrement) {
        stackAsArray.add(decrement);
    }

    public void ShowStack(ArrayList<Integer> arrayshow) {
        for (int iLoop : arrayshow) {
            System.out.println(iLoop);
        }
    }
}
