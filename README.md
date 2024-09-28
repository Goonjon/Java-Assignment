# Assignment on JAVA
### Project Summary: In this project, i have perform several programs


### Technologies I have used: 
- JDK 17
- IntelIJ Community Edition

### How to run?
1. Open IntelIJ Community Edition.
2. Create a new project.
3. Open main folder and create classes for each java program.
4. Run the programs to view output.

## Scenario: Here is the 10 students CGPA [3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75]
### Question-1: Find out who achieved the 2nd highest score. (without sorting,use linear searching algorithm)
  Summary: I used a for loop to traverse the array of scores and two variables (max for the highest score and sLargest for the second highest). Inside the loop, I used if-else conditions to update the second highest score whenever a new maximum is found.

### Question-2: Sort the above scores from according to the order of highest CGPA (don’t use Arrays.sort() method, do it programmatically)
  Summary: I used a selection sort algorithm with nested for loops to sort an array of CGPAs in descending order, swapping values when needed. Finally, I printed the sorted CGPAs using another for loop.

### Question-3: Take a CGPA as user input. Now from the given array find if your input CGPA is present using binary search algorithm
  Summary: I used bubble sort to first sort the CGPA array in ascending order, which is required for binary search. Then, I implemented binary search to look for a user-input CGPA, updating search boundaries with left and right pointers, and printed the result if the CGPA was found or not.

### Question-4: Generate random 10 integer numbers in an array and print out all the numbers from the array and also print the max and min number from the array.
  Summary: I generated 10 random integers within a specified range (10 to 200) using Math.random() and stored them in an array. Then, I used a for loop to find the maximum and minimum values by comparing each element, and printed the results.

### Question-5: Write a program that will break down the amount and count notes for any given amount. Here is the notes in the given array:    
notes=[1000,500,200,100,50,20,10,5,2,1] 
Input: 546
Output:
500 1
20 2
5 1
1 1
  
  Summary: I created an array of currency denominations and used a for loop to determine how many times each note fits into a given amount (546), updating the remaining amount using modulus (%) and printing the count for each note.  

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
   
   Summary: I used two nested for loops to print a number pattern: the first loop creates a decreasing sequence from 1 to 5, while the second loop generates an increasing sequence from 2 to 5, with each row printing numbers from 1 to the current row number.

   
  
