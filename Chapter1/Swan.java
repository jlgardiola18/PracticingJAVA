package Chapter1;
    // Creating Objects - Reading & Writing Objects Fields
public class Swan {
    int numberEggs; // instance variable
    public static void main(String[] args) {
        Swan mother = new Swan();
        mother.numberEggs = 1; // set variable
        System.out.println(mother.numberEggs); //read variable
    
        // Instance Initializer Blocks
    
        { System.out.println("Feathers");}

    }
    { System.out.println("Snowy");}
}
