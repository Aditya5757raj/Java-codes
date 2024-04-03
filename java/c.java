interface A {
    void meth1();
    void meth2();
}

class MyClass implements A {
    public void meth1() {
        System.out.println("Inside meth1 method in MyClass");
    }
    
    public void meth2() {
        System.out.println("Inside meth2 method in MyClass");
    }
}

class Main {
    public static void main(String[] args) {
        MyClass myObj = new MyClass();
        myObj.meth1();
        myObj.meth2();
    }
}
