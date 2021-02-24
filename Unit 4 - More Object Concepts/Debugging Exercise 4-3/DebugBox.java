// DebugBox.Java - Iakov Taranenko - 2/23/2021

/* 

Programming Exercise 4-3

The file provided in the code editor to the right contains syntax and/or logic errors. In each case, determine and fix the problem, remove all syntax and coding errors, and run the program to ensure it works properly.

*/

public class DebugBox {
    private int width;
    private int length;
    private int height;

    public  DebugBox() {
        length = 1;
        width = 1;
        height = 1;
    }

    public  DebugBox(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public void showData() {
        System.out.println("Width: "  + width + "  Length: " + length + "  Height: "+ height);
    }

    public double getVolume()  { 
        double vol = length * width * height;
        return vol;
    }
}