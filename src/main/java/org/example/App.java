package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Hello world!
 */
public class App {
    public static int SumOrderNumber()
    {
        int total=0;
        int i=0;
        while (i<=100)
        {
            total+=i;
            i+=2;
        }
        return total;
    }

    public static boolean CheckSNT(int n)
    {
        boolean result=true;
        for(int i=2; i<= n/2; i++)
        {
            if(n%i==0)
            {
                result=false;
                break;
            }
        }
        return result;
    }

    public static List<Integer> FilterSNT()
    {
        List<Integer> lstFoundSNT = new ArrayList<>();
        for(int i=1; i<=100; i++)
        {
            if(CheckSNT(i))
            {
                lstFoundSNT.add(i);
            }
        }
        return lstFoundSNT;
    }

    public static int[] getFibinacyList()
    {
        int[] fiboNumber= new int[10];
        fiboNumber[0] = 1;
        fiboNumber[1] = 2;
        int index=2;
        while (index<10)
        {
            fiboNumber[index] = fiboNumber[index-1]+ fiboNumber[index-2];
            index++;
        }
        return fiboNumber;
    }

    public static int GetResult(String formula)
    {
        int total = 0;
        char sign = ' ';
        int i=0;
        while (i<formula.length())
        {
            if(formula.charAt(i)=='+' || formula.charAt(i)=='-')
            {
                sign = formula.charAt(i);
                i++;
            }
            else
            {
                if(sign== ' ')
                {
                    total = GetNumber(formula, 0);
                    i = i+ String.valueOf(GetNumber(formula, 0)).length();
                }
                else
                {
                    if(sign == '-')
                    {
                        total-= GetNumber(formula, i);
                        i = i+ String.valueOf(GetNumber(formula, i)).length();
                    }
                    else
                    {
                        total += GetNumber(formula, i);
                        i = i+ String.valueOf(GetNumber(formula, i)).length();
                    }
                }
            }
        }
        return total;
    }

    public static int GetNumber(String formular, int start)
    {
        String number="";
        for(int i= start; i< formular.length(); i++)
        {
            if(formular.charAt(i)!='+' && formular.charAt(i)!='-')
            {
                number+= formular.charAt(i);
            }
            else
            {
                break;
            }
        }

        return Integer.parseInt(number);
    }

    public int GetSummaryOrderNumber(int[] array)
    {
        return 0;
    }


}
