class Main {
  public static void main(String[] args) {
    System.out.println("Hello stdout");
    System.err.println("Hello stderr");
    System.out.print("Press ENTER to continue: ");
    try{
    System.in.read();
      }
    catch (java.io.IOException ex){
      System.out.println(ex);
    }
    System.out.println("All done");
                                           
    //declare a variable
    //int num1;
    //assign a value
    /*num1 = 42;
    System.out.println("num1: " + num1);

    int num2;
    num2 = 10;
    System.out.println("num2: " + num2);

    int sum;
    sum = num1 + num2;
    System.out.println("sum = " + num1 + " + " + num2 +" = " + sum);

    num1 = 123;
    System.out.println("num1: " + num1);*/
    //num1 = "hello world";
    
    
    
  }
}