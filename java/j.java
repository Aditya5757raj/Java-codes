interface Test {
    int square(int num);
}

class Arithmetic implements Test {
    public int square(int num) {
        return num * num;
    }
}

class ToTest {
    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic(); 
        int result = arithmetic.square(5);
        System.out.println("Square of 5 is: " + result);
    }
}
