// DebugFour3.Java - Iakov Taranenko - 2/23/2021

/* 

Programming Exercise 4-3

The file provided in the code editor to the right contains syntax and/or logic errors. In each case, determine and fix the problem, remove all syntax and coding errors, and run the program to ensure it works properly.

*/

public class DebugFour3 {
    public static void main(String[] args) {
        int width = 12;
        int length = 10;
        int height = 8;

        DebugBox box1 = new DebugBox();
        DebugBox box2 = new DebugBox(width, length, height);

        System.out.println("The dimensions of the first box are");
        box1.showData();

        System.out.print("  The volume of the first box is ");
        showVolume(box1);

        System.out.println("The dimensions of the second box are");
        box2.showData();

        System.out.print("  The volume of the second box is ");
        showVolume(box2);
    }

    public static void showVolume(DebugBox aBox) {
        double vol = aBox.getVolume();
        System.out.println(vol);
    }
}