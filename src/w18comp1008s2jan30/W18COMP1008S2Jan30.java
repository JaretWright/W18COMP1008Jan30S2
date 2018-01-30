package w18comp1008s2jan30;

import java.util.ArrayList;

/**
 *
 * @author JWright
 */
public class W18COMP1008S2Jan30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(100);
        grades.add(78);
        grades.add(99);
        System.out.printf("Our ArrayList holds: %s%n", grades);
        
        System.out.printf("The average grade is %.1f%% %n", 
                                                getAverage(grades));
        
        ArrayList stuff = new ArrayList();
        stuff.add("Chair");
        stuff.add(99.9);
        stuff.add(new Card("Ace","Hearts"));
        
        for (Object item:stuff)
            System.out.printf("Item: %s     class: %s%n", 
                            item.toString(), item.getClass());
        
        Integer lastGrade = grades.remove(grades.size()-1);
        System.out.printf("Our ArrayList holds: %s%n", grades);
        
    }
    
    public static double getAverage(ArrayList<Integer> arrayList)
    {
        double sum=0;
        for (Integer item:arrayList)
            sum += item;
        
        return sum/arrayList.size();
    }
    
}
