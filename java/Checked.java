import java.io.*;

class Checked2 {
    public static void main(String args[]) {
        FileReader fr = null;
        try {
            fr = new FileReader("D:/file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        }
        try {
            int i = 0;
            if (fr != null) {
                while ((i = fr.read()) != -1) {
                    System.out.print((char) i);
                }
                fr.close();
            }
        } catch (IOException e) {
            System.out.println("IOException occurred");
        }
    }
}
