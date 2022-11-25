import java.util.Stack;

public class ParenthesesChecker {
    public static void main(String[] args) {
        System.out.println(parenthesesChecker("{Biscuit}"));
    }

    static boolean parenthesesChecker(String code) {

        Stack<Character> parenthesesStack = new Stack<>();

        for (int i = 0; i < code.length(); i++) {
            /*You want to run through the string and check each character
            if "(", "{" or "[" appear in the string. push them on to the stack.

since you can only peek at the top item of the stack. Think about only pushing the opening brackets...
( ) ( { ) )
a b c d e f
you go through and add each opening bracket to the stack
when you encounter a closing bracket, check 2 things:
if the stack is empty   - that means there isnt a matching opening bracket => false
if the top of the stack doesnt match the closing bracket - then you have a wrong mix of brackets (see d and e in example above) => false
if it's all good, pop() the opening bracket off the stack and keep going
if you reach the end of the string and the stack is empty, good job => true
if it isnt empty - uh oh => false

             */
            char c = code.charAt(i); //this lets you parse through each character in the string
            if (c == '{' || c == '[' || c == '(' || c == '<') {
                parenthesesStack.push(c);
                System.out.println(parenthesesStack);
            } else if ((c == '}' && (parenthesesStack.peek() == '{'))
                    || (c == ']' && (parenthesesStack.peek() == '['))
                    || (c == ')' && (parenthesesStack.peek() == '('))) {

                parenthesesStack.pop();

            }
        }
                return parenthesesStack.isEmpty();

            }

        }

