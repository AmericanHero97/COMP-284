// PhoneNumbers.Java - Iakov Taranenko - 3/23/2021

/* 

Programming Exercise 8-9

A personal phone directory contains room for first names and phone numbers for 30 people. Assign names and phone numbers for the first 10 people. Prompt the user for a name, and if the name is found in the list, display the corresponding phone number. If the name is not found in the list, prompt the user for a phone number, and add the new name and phone number to the list.

Continue to prompt the user for names until the user enters quit. After the arrays are full (containing 30 names), do not allow the user to add new entries.

Use the following names and phone numbers:

Name	Phone #
Gina	(847) 341-0912
Marcia	(847) 341-2392
Rita	(847) 354-0654
Jennifer	(414) 234-0912
Fred	(414) 435-6567
Neil	(608) 123-0904
Judy	(608) 435-0434
Arlene	(608) 123-0312
LaWanda	(920) 787-9813
Deepak	(930) 412-0991
An example of the program is shown below:

Enter name to look up. Type 'quit' to quit.
Gina
Gina's phone number is (847) 341-0912
Enter name to look up. Type 'quit' to quit.
Jorge
Enter phone number for Jorge
555-555-0184
Enter name to look up. Type 'quit' to quit.
quit

*/

import java.util.*;
class PhoneNumbers {
    public static void main(String[] args) {
        Scanner InputService = new Scanner(System.in);
        String inputName, inputNumber;
        boolean foundMatch = false;
        int high = 10;

        String[] names = new String[30];
        names[0] = "Gina";    
        names[1] = "Marcia";
        names[2] = "Rita";    
        names[3] = "Jennifer";
        names[4] = "Fred";    
        names[5] = "Neil";
        names[6] = "Judy";    
        names[7] = "Arlene";
        names[8] = "LaWanda"; 
        names[9] = "Deepak";

        String numbers[] = new String[30];
        numbers[0] = "(847) 341-0912";
        numbers[1] = "(847) 341-2392";
        numbers[2] = "(847) 354-0654";
        numbers[3] = "(414) 234-0912";
        numbers[4] = "(414) 435-6567";
        numbers[5] = "(608) 123-0904";
        numbers[6] = "(608) 435-0434";
        numbers[7] = "(608) 123-0312";
        numbers[8] = "(920) 787-9813";
        numbers[9] = "(930) 412-0991";

        System.out.println("Enter name to look up. Type 'quit' to quit.");
        inputName = InputService.nextLine();

        while ((high < 30) && !(inputName.equals("quit"))) {
            for (int i = 0; i < high; i++)
                if (inputName.equals(names[i])) {
                    System.out.println(names[i] + "'s phone number is " + numbers[i]);
                    i = high;
                    foundMatch = true;
                }
            
            if (!foundMatch) {
                System.out.println("Enter phone number for " + inputName);
                inputNumber = InputService.nextLine();

                names[high] = inputName;
                numbers[high] = inputNumber;
                high++;
            }

            System.out.println("Enter name to look up. Type 'quit' to quit.");
            inputName = InputService.nextLine();
        }
    }
}