import java.util.Arrays;
import java.util.ListIterator;
import java.util.Stack;

/**
 * This program is used to create and add integers in
 * sorted order to a stack list. It will ultimately 
 * print the stack list for the user to see. 
 * This is updated from a linked list.
 * 
 * @author Giovanni D'Angelo
 * @version 2.0
 * @since   Week 5 of CSC6301
 */
public class DangeloGMod5PA {
    /**
     * Main function to run program.
     * Will create an array to test the stack list
     * sorting and adding. Will call on method to add
     * in a new number. Will print out final stack list.
     * Updated from a linked list.
     * 
     * @param args Default variable for main - not used.
     * @since Week 5 of CSC6301
     */
    public static void main(String[] args){
        //Base list of integers to be used in stack list.
        int[] baseList = {78, 34, 12, 93, 14, 44};
        //Created stack list to manage.
        Stack<Integer> slist = new Stack<Integer>();

        //Iterate through the length of baseList.
        for(int i = 0; i < baseList.length; i++){
            //Call method to add integer into stack list.
            addInt(slist, baseList[i]);
        }

        //Print out original list and final ordered stack list.
        System.out.println("Original list: " + Arrays.toString(baseList));
        System.out.println("Final stack list: " + slist);
    }

    /**
     * Method to add integers to stack list in order. 
     * Will use ListIterator to manage stack list.
     * Updated from a linked list. 
     * 
     * @param tempList stack list used to input integers.
     * @param n Number to be added to the stack list.
     * @since Week 5 of CSC6301
     */
    public static void addInt(Stack<Integer> tempList, int n){
        //Set up iterator for stack list.
        ListIterator<Integer> it = tempList.listIterator();
        
        //If nothing exists in stack list add n.
        if(! it.hasNext()){
            it.add(n);
        }
        //Continue to iterate stack list until end.
        while(it.hasNext()){
            //Set p to be the element in stack list.
            int p = it.next();

            //Once element is larger than new number,
            //you will put in n to previous spot.
            if(p > n){
                it.previous();
                it.add(n);
                break;
            //If iteration hits the end of the stack list,
            //you will place n at the end of list.
            }else if(! it.hasNext()){
                it.add(n);
                break;
            }
        }
    }
}
