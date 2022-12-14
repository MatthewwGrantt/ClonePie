import java.util.ArrayList;

public class ClonePie {
    public static void main(String[] args) throws Exception {
        ArrayList<Pie> pies = new ArrayList<>();
        pies.add(new Pie(10.0, "Apple"));
        pies.add(new Pie(9.5, "Rhubarb"));
        pies.add(new Pie(3.5, "Blueberry"));
        pies.add(new Pie(6.5, "Pecan"));
        pies.add(new Pie(8.0, "Pecan"));
        System.out.println(cloneYummiestPie(pies));
        // output [(10.0 "Apple"), (9.5, "Rhubarb"), ..., (10.0, "Appple")]
        
        // yummiestBestOrder(pies);
        /* if you do yummiestBestOrder instead of cloneYummiestPie, 
        you'll output [(10.0 "Apple"), (9.5, "Rhubarb"),
                (3.5, "Blueberry"), (10.0, "Appple"),
                (6.5, "Pecan"), (6.5, "Pecan")]
         */ 
    }

    // inserting a copy of the yummiest pie at the end of the list 
    static double cloneYummiestPie(ArrayList<Pie> pies) {
        // write your pseudocode here!
        ///Assignment: Find the best pie and clone it
///< 5.3, 10.0, 2.0, 8.5 >
///These are doubles and floats
///Set the original value to the first element in the array
///Starting from left to right, go through (compare) every number to see which one is larger if the next number is larger, and update the largest when a number is bigger than another.
///After you find the best pie, add it to the end of the array
///< 5.3, 10.0, 2.0, 8.5, 10.0 >
///Make the 2 best pies (10.0) evenly spread out (BONUS)
            Pie maxPie = pies.get(0); 
            for (int i = 1; i < pies.size(); i++) {
                if (pies.get(i).yumminess > maxPie.yumminess) {
                    maxPie = pies.get(i);
                }
            }
            pies.add(new Pie(maxPie.yumminess,maxPie.type));
            return maxPie.yumminess;
        }
        // give me 2 examples and their output. 
    

    // inserting the cloned yummiest pie 
    // at an index so that its clone 
    // is evenly spaced away from it. 
    // hint: you can use add(int index, E element)
    static void yummiestBestOrder(ArrayList<Pie> pies) { 
        // write your pseudocode here! 
        // give me 2 examples and their output. 
    }

}

class Pie {
    double yumminess; 
    String type; // Pumpkin, pecan, etc. 

    Pie(double yumminess, String type) {
        this.yumminess = yumminess; 
        this.type = type;
    }
}
    

