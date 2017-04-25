import clojure.lang.Obj

/**
 * Created by akhil on 21/4/17.
 */
class Question15 {
    public static void main(String[] args) {
        Stacks stack = new Stacks();
        Scanner scanner = new Scanner(System.in)
        String s = "y";
        while (s == "y") {
            println "choose the operation"
            println "1. for PUSH"
            println "2. for POP"
            println "3. for TOP"
            println "4. for Display"
            int ch = scanner.nextInt();
            scanner.nextLine();
            if (ch == 1) {
                println "Enter the value to enter"
                Object o = scanner.nextLine();
                stack.push(o);
            } else {
                ch == 2 ? print(stack.pop()) : ch == 3 ? print(stack.top()) :ch==4?stack.display(): print("Enter 1 2 or 3")
            }
            println("Do you want to do more operation press y and n")
            s = scanner.next();
        }
    }
}

class Stacks {
    List list = []

    void push(Object o) {
        list.push(o)
    }

    Object pop() {
        return list.pop()
    }

    Object top() {
        return list.last()
    }

    void display() {
        println list
    }
}

