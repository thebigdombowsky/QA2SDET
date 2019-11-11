package com.sdet;

        public class Week5 {


            public static void main(String[] args) {

                quack();
                reverse("Engineer Your Career!");
                compare();
            }

            private static void quack(){
                int counter = 1;
                for (int i = 1; i <= 40; i++) {
                    System.out.println(i);
                    if(counter++ % 3 == 0){
                        System.out.println("Quack");
                    }
                }
            }

            private static void reverse(String input) {
                StringBuilder sb = new StringBuilder(input);
                System.out.println("string = " + sb);
                System.out.println("reverse = " + sb.reverse());
            }

            private static void compare(){

                int x = 91;
                int y = 75;

                if (x > y) {
                    System.out.println("x is bigger than y by " + (x - y));
                }
                else if (x < y) {
                    System.out.println("x is smaller than y by " + (y - x));
                }
                else {
                    System.out.println("x and y are the same");
                }

            }


        }