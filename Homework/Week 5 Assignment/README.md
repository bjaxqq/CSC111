# Week 5 Assignment

11. Given a class Pet as started in the following example, add two constructors – one to create pets with a name, the other to create pets with a name and an age.
    ```
    class Pet {
        private String name;
        private int age;
        // add constructors here
    ```
12. Suppose that you have the following class:
    ```
    class Second {
        private int x;
        public int z;
    
        public int sum() {
            return x + y + z;
        } // end sum
        
        private void reset (int a, int b, int c) {
            x = a; y = b; c = z;
        } // end reset
        
        public boolean check (float x) {
            return x<0;
        } // end check;
    } // end second
    ```
Given the following declaration,
    ```
    Second myClass = new Second();
    ```

Indicate for each statement (which might appear in testing code) if it is legal or illegal (will cause and error).
- myClass.x = 5;
- myClass.z = 5;
- myClass.sum(x);
- int ans = myClass.sum();
- myClass.reset(1, 2, 3);
- boolean x = myClass.check(11.2);

13. Given the following class Complex, complete the following questions:
    ```
    class Complex {
        private int real;
        private int imaginary;
        
        public Complex (int r, int i) {
            real = r;
            imaginary = i;
        } // end constructor
        
        public String toString {
            return real + “ + “ + imaginary + “i”;
        } //end toString
    } // end class Complex.
    ```
- Write a statement that creates a complex number 3 + 2i called c1.
- Write a statement that creates a complex number 4 – 5i called c2.

15. What is the output of the following statements? Assume each group is independent. If the result is an empty string, state so.
- String str = “Hello World!”;
str.substring(6, 10);
- String str = “Hello World!”;
str.substring(0, 1);