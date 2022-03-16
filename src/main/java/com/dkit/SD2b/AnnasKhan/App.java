package main.java.com.dkit.SD2b.AnnasKhan;

import java.util.*;

/**
 * OOP CA3
 * @author Annas Khan
 */
public class App 
{
    private static List<Student> studentList = new ArrayList<>();

    public static void main( String[] args )
    {
        // Question 1
        question1PartA();
        question1PartB();
        question1PartC();
        question1PartD();

        // Question 2
        List<Employee> employeeList = new ArrayList<>();
        question2PartA(employeeList);

        Set<String> uniqueNamesSet = new HashSet<>();
        question2PartB(employeeList, uniqueNamesSet);

        Map<String, Integer> nameAndCountMap = new HashMap<>();
        question2PartC(employeeList, nameAndCountMap);

        Queue<Employee> waitingList = new LinkedList<>();
        question2PartD(employeeList, waitingList);


        //Question 3
        List<String> oneHundredStrings = new ArrayList<>();
        populateOneHundredStrings(oneHundredStrings);

        question3PartA(oneHundredStrings);

        System.out.println("Printing out the list oneHundredStrings after removing duplicates: ");
        System.out.println(oneHundredStrings);

        question3PartB();

        // Question 4
        compareTwoStudents();

        question4PartA();
        question4PartB();
        question4PartC();

    }

    private static void question1PartA()
    {
        // Part (a)
        studentList.add(new Student(123, "Annas", 19));
        studentList.add(new Student(124, "Stephen", 32));
        studentList.add(new Student(125, "Niall", 20));
        studentList.add(new Student(126, "Nathan", 20));
    }

    private static void question1PartB()
    {
        // Part (b)
        System.out.println("\nQuestion 1 Part B:\n");
        Collections.sort(studentList);
        System.out.println("Student list after sorting students by their name:");
        displayStudentList();
        System.out.println("*******************************************\n");
    }

    private static void question1PartC()
    {
        // Part (c)
        System.out.println("\nQuestion 1 Part C:\n");
        Collections.sort(studentList, new StudentAgeComparator());
        System.out.println("Student list after sorting students by their age:");
        displayStudentList();
        System.out.println("*******************************************\n");
    }

    private static void question1PartD()
    {
        System.out.println("\nQuestion 1 Part D:\n");
        // Part (d)

        // The time complexity of adding students to an ArrayList is O(1), except when the list has to be resized.
        // As this resizing rarely happens, we still consider the time complexity to be O(1).
        // The space complexity of this operation would be O(n), where n is the number of students to be added.

        // The time complexity of Java's Collections.sort() algorithm (which uses merge sort) is O(nlog(n)).
        // The space complexity of merge sort is O(n), so it depends linearly on the number of elements in the list.

        System.out.println(" The time complexity of adding students to an ArrayList is O(1), except when the list has to be resized.\n" +
                "         As this resizing rarely happens, we still consider the time complexity to be O(1).\n" +
                "         The space complexity of this operation would be O(n), where n is the number of students to be added.\n" +
                "\n" +
                "         The time complexity of Java's Collections.sort() algorithm (which uses merge sort) is O(nlog(n)).\n" +
                "         The space complexity of merge sort is O(n), so it depends linearly on the number of elements in the list.");

    }

    private static void question2PartA(List<Employee> employeeList)
    {
        // Part (a)
        // The List interface is best suited for this question, as all we need to do is store the employees,
        // and generate a random index (between 0 and the size of the list), which can be used to access the winning employee.
        System.out.println("\nQuestion 2 Part A:\n");
        employeeList.add(new Employee("joe","roa"));
        employeeList.add(new Employee("annas","khan"));
        employeeList.add(new Employee("john","Shongwe"));
        employeeList.add(new Employee("jim","O'Reilly"));
        employeeList.add(new Employee("kyle","mcdonel"));

        pickLuckyWinner(employeeList);
    }

    private static void question2PartB(List<Employee> employeeList, Set<String> uniqueNamesSet)
    {
        // Part (b)

        System.out.println("\nQuestion 2 Part B:\n");

        for(Employee employee : employeeList)
        {
            uniqueNamesSet.add(employee.getFirstName());
        }

        printUniqueNames(uniqueNamesSet);

    }

    private static void question2PartC(List<Employee> employeeList, Map<String, Integer> nameAndCountMap)
    {
        // Part (c)

        System.out.println("\nQuestion 2 Part C:\n");

        for(Employee employee : employeeList)
        {
            String firstName = employee.getFirstName();

            if(nameAndCountMap.containsKey(firstName))
            {
                nameAndCountMap.put(firstName, nameAndCountMap.get(firstName) + 1);
            }
            else
            {
                nameAndCountMap.put(firstName, 1);
            }
        }

        printNameAndCount(nameAndCountMap);

    }

    private static void question2PartD(List<Employee> employeeList, Queue<Employee> waitingList)
    {
        // Part (d)

        System.out.println("\nQuestion 2 Part D:\n");


        waitingList.addAll(employeeList);

        Employee nextOnWaitingList = getNextOnWaitingList(waitingList);

        int waitingListSize = waitingList.size();

        for(int i = 0; i < waitingListSize; i++)
        {
            System.out.println("The employee that is next on the waiting list is: " + nextOnWaitingList);
        }

    }

    private static void question3PartA(List<String> strings)
    {
        Set<String> uniqueStrings = new HashSet<>();

        for(int i = 0; i < strings.size(); i++)
        {
            if(!uniqueStrings.add(strings.get(i)))
            {
                strings.remove(i);
                i--;
            }

        }

    }

    private static void question3PartB()
    {
        System.out.println("\nQuestion 3 Part B: ");

        System.out.println("We keep a Set that holds the unique strings and compares them to the original list. We loop through the list,  \n" +
                          "removing elements from the list if the current element in the original list matches any of the unique strings inn the Set..\n" +
                "\n" +
                "         This solution has an O(n) time complexity, where n is the number of entries in the list.\n" +
                "         Because we only iterate through the List once, it is O(n).\n" +
                "         Because we need extra memory to establish a Set and add entries from the list to it, this approach has an O(n) space complexity.");

    }

    private static void question4PartA()
    {
        // Part (a)
//

        System.out.println("\nQuestion 4 Part A:\n");
        System.out.println("As with the equals and hashCode methods from the Object class, this function returns false.\n\n" +
                "         Depending on their memory addresses, compare two objects As a result, the equals() function will only take into account\n\n" +
                "         If the two students' memory addresses are the same, they are equal.");

    }

    private static void question4PartB()
    {
        // Part(b)

        System.out.println("\nQuestion 4 Part B:\n");
        System.out.println(" The hashCode() method from the object class hashes objects based on their memory address.\n" +
                "         So, their hashCodes are also different because their memory addresses are different.");
    }

    private static void question4PartC()
    {
        // Part (c)
        // We override the equals and hashCode methods in the Student class to compare two Student objects by their names.
        System.out.println("\nQuestion 4 Part C:\n");
        System.out.println("Result after overriding equals and hashCode: ");
        compareTwoStudents();
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

    private static void displayStudentList()
    {
        for(Student student : studentList)
        {
            System.out.println(student);
        }
    }

    private static void pickLuckyWinner(List<Employee> employeeList)
    {
        Random rand = new Random();
        int winnerIndex = rand.nextInt(employeeList.size());

        System.out.println("Printing out details of the winning employee: ");
        System.out.println(employeeList.get(winnerIndex));
    }

    private static void printUniqueNames(Set<String> uniqueNames)
    {
        System.out.println("Displaying the set of unique first names:");
        for(String name : uniqueNames)
        {
            System.out.println(name);
        }
    }

    private static void printNameAndCount(Map<String, Integer> nameAndCount)
    {
        System.out.println("Printing the first names along with the number of employees having the same first name: ");
        for(String name : nameAndCount.keySet())
        {
            System.out.println(name + ": " + nameAndCount.get(name));
        }
    }

    private static Employee getNextOnWaitingList(Queue<Employee> waitingList)
    {
        Employee nextEmployee = waitingList.poll();

        if(nextEmployee == null)
        {
            System.out.println("There are no more employees in the queue.");
            return null;
        }

        return nextEmployee;
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
