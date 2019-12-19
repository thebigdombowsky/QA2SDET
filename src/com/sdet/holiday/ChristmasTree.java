package com.sdet.holiday;

public class ChristmasTree
{
    public static void main(String[] args)
    {
        printTrees(4,5);
    }

    public static void printTrees(int seg, int ht)
    {
        for(int i = 1; i <= seg; i++)
        {
            int topStar;
            int firstStar = (i * 2 - 1);
            for(int j = 1; j <= ht; j++)
            {
                for(int spaces = 1; spaces <= (ht - j); spaces++)
                {
                    System.out.print(" ");
                }

                for(topStar = 1; topStar <= firstStar; topStar++)
                {
                    System.out.print("*");
                }
                firstStar += 2;
                System.out.println();
            }
        }
    }
}