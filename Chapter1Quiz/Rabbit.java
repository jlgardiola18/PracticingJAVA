package Chapter1Quiz;

public class Rabbit {
    public static void main(String[] args) {
        Rabbit one = new Rabbit();  //3
        Rabbit two = new Rabbit();  //4
        Rabbit three = one;         //5
        one = null;                 //6
        Rabbit four = one;          //7
        three = null;               //8
        two = null;                 //9
        two = new Rabbit();         //10
        System.gc();
} }
        
