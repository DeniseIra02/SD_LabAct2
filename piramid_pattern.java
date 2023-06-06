//4. Java code that will output the pattern below

public class piramid_pattern {
    public static void main(String[] args) {
        //n for rows and m for columns 
        int n, m, row = 5;

        System.out.println("---------------------------------------------");
        
        //Process
        //Implement for loops to make the pyramid pattern
        for(n = 0; n < row; n++) { //loop for rows
            for(m = row - n; m > 1; m--) { //loop for space
                System.out.print(" "); //print space
            }
            
            for(m = 0; m <= n; m++) {// loop for columns
                System.out.print("* "); //print star
            }

            System.out.println();
        }

        System.out.println("---------------------------------------------");
    }
}
