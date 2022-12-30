
package project3;

/**
 *
 * @author 200316059 İkram Celal KESKİN
 */
public class Project3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Stack stack = new Stack(3);
 //I can use also use try catch but it is not too big
    stack.push('A', 0);
    stack.push('B', 1);
    stack.push('C', 2);
    stack.push('D', 0);
    stack.push('E', 1);
    stack.push('F', 2);
    stack.push('G', 0);
    stack.push('H', 1);
    stack.push('I', 2);
        
    stack.printStacks();
    System.out.println("--------------------------------------------------");
    stack.pop(0);
    stack.pop(1);
    stack.pop(2);
    stack.printStacks();
    System.out.println("--------------------------------------------------");

    System.out.println("Peek stack 1: " + stack.peek(1));
    System.out.println("--------------------------------------------------");
    stack.printStacks();
 
  }
}

