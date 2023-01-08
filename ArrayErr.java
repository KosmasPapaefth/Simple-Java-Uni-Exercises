//Papaefthymiou Kosmas
public class ArrayErr {

    public static void main(String args[]) {
        int sample[] = new int[10];
        int i;
        for (i = 0; i < 100; i = i + 1) {
            sample[i] = i;
        } //end of for
    } // end of main
}// end of class
/*This program produces error becauce we delcared that the array will have 10 integers inside it and 
in for loop we are trying to import 100 integers. */
