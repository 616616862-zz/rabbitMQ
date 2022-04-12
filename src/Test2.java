import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        Queue<Integer> list=new ArrayDeque<>();
        System.out.println("第二次修改");
        System.out.println("第三次修改");

    }
    public static boolean isValid(String s) {
        Deque<Character> stack=new ArrayDeque();
        for(char c:s.toCharArray()){
            if(c=='('||c=='['||c=='{') stack.push(c);
            else if(c==')'){if(stack.isEmpty()||stack.pop()!='(') return false;}
            else if(c==']'){if(stack.isEmpty()||stack.pop()!='[') return false;}
            else if(c=='}'){if(stack.isEmpty()||stack.pop()!='{') return false;}
        }
        return stack.isEmpty();
    }
}
