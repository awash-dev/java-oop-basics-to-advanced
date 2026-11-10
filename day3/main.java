package day3;

public class main {
    public static void main(String[] args) {
        // conditional statements

        int a = 2;
        int b = 10;

        // if conditions including (<, >, <=, >=, ==, !=)

        if (a > b) {
            System.out.println("a is greater than b"); // it argument is false because a is not greater than b
        } else if (a < b) {
            System.out.println("a is less than b"); // it argument is true because a is less than b
        }
      
        ashenafi cs = new ashenafi();
        cs.checkEquality();

        csStudent cs1 = new csStudent();
        cs1.sample();
    }
}

// let create sub functions with ==, !=
class ashenafi {
    public void checkEquality() {
        int a = 2;
        int b = 10;

        // if conditions including (<, >, <=, >=, ==, !=)

        if (a == b) {
            System.out.println("a is equal to b");
        } else if (a != b) {
            System.out.println("a is not equal to b");
        }
    }
}

class csStudent{

    public void sample() {
        int a = 2;
        int b = 10;

        // if conditions including (<, >, <=, >=, ==, !=)

       if (a>=b) {
            System.out.println("a is greater than or equal to b");
        } else if (a<=b) {
            System.out.println("a is less than or equal to b");
        }
    }
}