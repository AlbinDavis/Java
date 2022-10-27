package problems.programs;

import java.util.Stack;

public class BasicCalculatorII {
    public static void main(String[] args) {
        String s = "2*3*4";
        char op = 0;
        Stack<Integer> stack = new Stack<>();
        StringBuilder dummy = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                if (Character.isDigit(s.charAt(i))) {
                    dummy.append(s.charAt(i));
                } else {
                    if (s.charAt(i) == '/' || s.charAt(i) == '*') {
                        if (op != 0) {
                            if (op == '/') {
                                stack.push(stack.pop() / Integer.parseInt(dummy.toString()));
                                dummy.setLength(0);
                                op=s.charAt(i);
                            }
                            else {
                                stack.push(stack.pop() * Integer.parseInt(dummy.toString()));
                                dummy.setLength(0);
                                op=s.charAt(i);
                            }
                        }else{
                        stack.push(Integer.valueOf(dummy.toString()));
                        dummy.setLength(0);
                        op = s.charAt(i);}
                    } else {
                        if (op != 0) {
                            if (op == '/') {
                                stack.push(stack.pop() / Integer.parseInt(dummy.toString()));
                                dummy.setLength(0);
                                dummy.append(s.charAt(i));
                            } else {
                                stack.push(stack.pop() * Integer.parseInt(dummy.toString()));
                                dummy.setLength(0);
                                dummy.append(s.charAt(i));
                            }
                            op = 0;
                        } else {
                            stack.push(Integer.parseInt(dummy.toString()));
                            dummy.setLength(0);
                            dummy.append(s.charAt(i));
                        }
                    }
                }
            }
        }
        if (dummy.length() > 0) {
            if (op != 0) {
                if (op == '/')
                    stack.push(stack.pop() / Integer.parseInt(dummy.toString()));

                else
                    stack.push(stack.pop() * Integer.parseInt(dummy.toString()));
            } else {
                stack.push(Integer.valueOf(dummy.toString()));
            }
        }
        int sum=stack.stream().mapToInt(i -> i).sum();
        System.out.println(sum);
    }
}
