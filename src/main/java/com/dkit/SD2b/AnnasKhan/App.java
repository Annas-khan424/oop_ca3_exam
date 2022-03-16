package main.java.com.dkit.SD2b.AnnasKhan;

import java.util.ArrayList;
import java.util.List;

/**
 * OOP CA3
 * @author John Loane
 */
public class App 
{
    public static void main( String[] args )
    {
        //Question 1
        questionOnePartA();
        questionOnePartB();
        questionOnePartC();
        questionOnePartD();

        //Question 2
        questionTwoPartA();
        questionTwoPartB();
        questionTwoPartC();
        questionTwoPartD();

        //Question 3
        List<String> oneHundredStrings = new ArrayList<>();
        populateOneHundredStrings(oneHundredStrings);
        questionThreePartA(oneHundredStrings);
        questionThreePartB();

        //Question 4
        compareTwoStudents();
        questionFourPartA();
        questionFourPartB();
        questionFourPartC();
    }

    //The method below relates to Question 4
    private static void compareTwoStudents()
    {
        Student alex1 = new Student(1, "Alex", 22);
        Student alex2 = new Student(1, "Alex", 22);
        System.out.println("alex1 hashcode = " + alex1.hashCode());
        System.out.println("alex2 hashcode = " + alex2.hashCode());
        System.out.println("Checking equality between alex1 and alex2 = " + alex1.equals(alex2));
    }

    //This is just a helper method to populate the list of strings for question 3. You do not need to read it to answer any of the questions in the CA
    private static void populateOneHundredStrings(List<String> oneHundredStrings)
    {
        for(int i=0; i < 100; i++)
        {
            if(i / 10 == 0)
            {
                oneHundredStrings.add("Java");
            }
            else if(i / 10 == 1)
            {
                oneHundredStrings.add("Python");
            }
            else if(i / 10 == 2)
            {
                oneHundredStrings.add("C++");
            }
            else if(i / 10 == 3)
            {
                oneHundredStrings.add("Javascript");
            }
            else if(i / 10 == 4)
            {
                oneHundredStrings.add("Ruby");
            }
            else if(i / 10 == 5)
            {
                oneHundredStrings.add("Golang");
            }
            else if(i / 10 == 6)
            {
                oneHundredStrings.add("C#");
            }
            else if(i / 10 == 7)
            {
                oneHundredStrings.add("C");
            }
            else if(i / 10 == 8)
            {
                oneHundredStrings.add("R");
            }
            else if(i / 10 == 9)
            {
                oneHundredStrings.add("Swift");
            }
        }
    }
}
