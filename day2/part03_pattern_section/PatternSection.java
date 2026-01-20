/*
TO-DO: Call each method below in this order:
         printEdge();
         printDiamondTop();
         printDiamondBottom();
         printEdge();

desired outcome:

    Double Sided Diamond

+=*=*=*=*=*=*+
|...../\.....|	when the row = 0, we print 5 dots (.), one /\, then 5 dots (.)
|..../\/\....|	when the row = 1, we print 4 dots (.), two /\, then 4 dots (.)
|.../\/\/\...|
|../\/\/\/\..|
|./\/\/\/\/\.|
|/\/\/\/\/\/\|
|\/\/\/\/\/\/|	when the row = 0, we print 0 dots, 6 \/, then 0 dots
|.\/\/\/\/\/.|	when the row = 1, we print 1 dots, 5 \/, then 1 dots
|..\/\/\/\/..|
|...\/\/\/...|
|....\/\/....|
|.....\/.....|
+=*=*=*=*=*=*+
	
	Double Sided Diamond
*/


package day2.part03_pattern_section;

public class PatternSection {

    public static final int SIZE = 3;

    // Main
    public static void main(String[] args) {
   // Methods
		printEdge();
        //printDiamondTop();
        //printDiamondBottom();
        printEdge();
    }

    // Method 1
	// Print the edge line that fits the width for SIZE
    // Format: "+" followed by repeating "=*" then "+"
    public static void printEdge() {
        // Start row with Plus Sign (+)
		System.out.print("+");

        // Loop (=*)
        for (int i = 0; i < SIZE * 2; i++) {
            System.out.print("=*");
        }
		// End row with Plus Sign (+)
        System.out.println("+");
    }

    //Method 2
	// Print the top half of the double diamond pattern
    public static void printDiamondTop() {
		// Loop Rows
        for (int row = 0; row < SIZE * 2; row++) {
		// Start Row with Pipe Character ( | )
            System.out.print("|");

            // Dots Decrease as Row Increases
            int dots = (SIZE * 2 - 1) - row;

            // Loop Leading Dots
            for (int i = 0; i < dots; i++) {
                System.out.print(".");
            }

            // Loop Triangle Pairs
				// /\ pairs increase as row increases
            int triangles = row + 1;
            for (int i = 0; i < triangles; i++) {
                System.out.print("/\\");
            }

            // Loop Trailing Dots
            for (int i = 0; i < dots; i++) {
                System.out.print(".");
            }
			// End Row with Pipe Character ( | )
            System.out.println("|");
        }
    }

    // TODO: Print the bottom half (mirror/inverse of the top half).
    // Requirements:
    // - total rows: SIZE * 2
    // - each row starts/ends with '|'
    // - inside, dots increase while "\/" pairs decrease, then dots again
    // - use SIZE in all loop bounds
    
    public static void printDiamondBottom() {
        // loop through total rows in the bottom half of the diamond
        // print a |
        // print the leading dots
            //they should increase with every row
        // print the /\
        // print the trailing dots
        // print the | with new line

        // Bottom half (mirror of top)
    public static void printDiamondBottom() {
        for (int row = SIZE * 2 - 1; row >= 0; row--) {
            System.out.print("|");

            int dots = Math.abs((SIZE - 1) - row);
            int slashes = SIZE - dots;

            // leading dots
            for (int i = 0; i < dots; i++) {
                System.out.print(".");
            }

            // \/ pairs
            for (int i = 0; i < slashes; i++) {
                System.out.print("\\/");
            }

            // trailing dots
            for (int i = 0; i < dots; i++) {
                System.out.print(".");
            }

            System.out.println("|");
            }
        }
    }
    

}
