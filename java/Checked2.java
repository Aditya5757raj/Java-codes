import java.io.*;

class Checked2 {
    public static void main(String args[]) {
        FileReader fr = null;
        FileWriter fw = null;

        try {
            File file = new File("C:/Users/adity/OneDrive/Desktop/file.txt");
            fw = new FileWriter(file);
            fw.write("hello");
            fw.close();
        } catch (IOException e) {
            System.out.println("IOException occurred while writing to the file");
        }

        try {
            fr = new FileReader("C:/Users/adity/OneDrive/Desktop/file.txt");
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
            System.out.println("IOException occurred while reading the file");
        }
    }
}
