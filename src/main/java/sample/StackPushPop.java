package sample;


public class StackPushPop {

    public static void main(String[] args) {

        String input = "1 2 3 4";
        String[] splitedString = input.split("\\s+");

        int[] intArray = new int[10];
        int position = 0;
        int splitLength = splitedString.length;
        for (int j = 0; j < splitLength; j++) {
            String s = splitedString[j];
            int i = Integer.parseInt(s);
            intArray[position] = i;
            position++;
        }

        Stack stack = new StackImpl();
        stack.push(intArray);
        stack.pop();

    }

    interface Stack {
        void push(int[] arr);
        void pop();
    }

    /**
     * This class contains a basic stack implementation which can push an array of integers and pop alternate integers
     * in a last in first out approach
     */
     static class StackImpl implements Stack {

        private int[] arr;

        /**
         * pushes the given array to the stack
         * @param arr the array to be pushed into the stack
         */
        @Override
        public void push(int[] arr) {
            this.arr = arr;
        }

        /**
         * pop the pushed array elements from arr alternatively in a last in first out manner
         * and displays it to the console
         */
        @Override
        public void pop() {
            StringBuilder builder = new StringBuilder();
            for (int i = arr.length - 1; i >= 0; i = i - 2) {
                builder.append(String.format("%s ", arr[i]));
            }
            System.out.println(builder.toString().trim());
        }
    }
}
