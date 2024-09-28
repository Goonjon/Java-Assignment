# Assignment on JAVA
### Project Summary: In this project, I implemented various Java programs covering tasks like linear and binary search, manual sorting, random number generation, and array processing. The programs include solutions for finding the second highest CGPA, counting characters, breaking down currency amounts, and calculating discounts. Key concepts like string manipulation, data extraction, and pattern printing were also applied, showcasing efficient use of arrays and data structures in solving real-world problems.


### Technologies I have used: 
- JDK 17
- IntelIJ Community Edition

### How to run?
1. Open IntelliJ IDEA Community Edition.
2. Create a new Java project.
3. Inside the src folder, create a separate class for each Java program.
4. Run each class individually to view the output.

## Scenario: Here is the 10 students CGPA [3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75]
### Question-1: Find out who achieved the 2nd highest score. (without sorting,use linear searching algorithm)
  Solution: I used a for loop to traverse the array of scores and two variables (max for the highest score and sLargest for the second highest). Inside the loop, I used if-else conditions to update the second highest score whenever a new maximum is found.

### Question-2: Sort the above scores from according to the order of highest CGPA (don’t use Arrays.sort() method, do it programmatically)
  Solution: I used a selection sort algorithm with nested for loops to sort an array of CGPAs in descending order, swapping values when needed. Finally, I printed the sorted CGPAs using another for loop.

### Question-3: Take a CGPA as user input. Now from the given array find if your input CGPA is present using binary search algorithm
  Solution: I used bubble sort to first sort the CGPA array in ascending order, which is required for binary search. Then, I implemented binary search to look for a user-input CGPA, updating search boundaries with left and right pointers, and printed the result if the CGPA was found or not.

### Question-4: Generate random 10 integer numbers in an array and print out all the numbers from the array and also print the max and min number from the array.
  Solution: I generated 10 random integers within a specified range (10 to 200) using Math.random() and stored them in an array. Then, I used a for loop to find the maximum and minimum values by comparing each element, and printed the results.

### Question-5: Write a program that will break down the amount and count notes for any given amount. Here is the notes in the given array:    
notes=[1000,500,200,100,50,20,10,5,2,1] 
Input: 546
Output:
500 1
20 2
5 1
1 1
  
  Solution: I created an array of currency denominations and used a for loop to determine how many times each note fits into a given amount (546), updating the remaining amount using modulus (%) and printing the count for each note.  

### Question-6: Write a program that will give following output: 
12345    
1234    
123  
12  
1
12   
123 
1234
12345
   
   Solution: I used two nested for loops to print a number pattern: the first loop creates a decreasing sequence from 1 to 5, while the second loop generates an increasing sequence from 2 to 5, with each row printing numbers from 1 to the current row number.

### Question-7: Take input as height of 10 babies in cm. Now find out the 2 lowest height of babies. (Don’t use Arrays.sort() method)
  Solution: I used a Scanner to input the heights of 10 babies into an array. Then, I used two for loops: the first finds the lowest height, and the second finds the second lowest by comparing values greater than the lowest. Finally, I printed both heights.

### Question-8: Count number of words, number of characters without spaces, number of vowels and consonant from the given string: 
Input: I am a SQA Engineer
Output: 
Words: 5
Chars: 15
Vowel: 8
Consonant: 7

  Solution: I processed a string by converting it to lowercase and using a for loop to count vowels, consonants, and total characters (excluding spaces). I also used a HashSet to store unique vowels, and split() to count words. Finally, I printed the results.

### Question-9: Find the number of occurrences of characters in a String 
String: I live in Dhaka
Output:
i 3
l 1
v 1
e 1
n 1
d 1
h 1
a 2
k 1

  Solution: I used a LinkedHashMap to store and count the occurrences of each letter in a string by iterating over its characters and checking if they are alphabetic. Finally, I printed the count of each letter while maintaining the insertion order.

### Question-10: Print the numbers which are not duplicate from the given array. 
numbers=[1, 1, 2, 3, 1, 2, 4, 5, 6, 5, 4, 7]
Output: 
3, 6, 7

  Solution: I used two LinkedHashSet collections to first track unique numbers and identify duplicates in an array. After iterating through the array, I removed the duplicates from the unique set and printed only the non-repeating numbers.

### Question-11: Remove Vowels from a String 
Input: I am a SQA Engineer
Output: m sq ngnr   

  Solution: I used a StringBuilder to build a new string by iterating through each character of the input, excluding vowels. Afterward, I removed extra spaces and printed the result.

### Question-12: A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. If I buy the laptop and 1 piece mouse, what will be my total cost after giving 15% discount? [Extract the digits from the paragraph and calculate the price] 

  Solution: I extracted the numeric values from a string using replaceAll to remove non-digits, then parsed the prices of a laptop and a mouse. After calculating the total cost, I applied a 15% discount and printed the final amount.
   
  
