# TimeTracker
Task 1:
Create a program that continuously displays the elapsed time since the program's 
launch on the screen every second. Additionally, implement a second thread that displays the message "5 seconds have passed" every 5 seconds.
Develop a multithreaded program that outputs a string consisting of numbers from 1 to n, with certain replacements:
Task 1:
If a number is divisible by 3, replace it with "fizz".
If a number is divisible by 5, replace it with "buzz".
If a number is divisible by both 3 and 5, replace it with "fizzbuzz".
The program should use four threads: Thread A calls fizz() to check if the number is divisible by 3 and adds the string "fizz" to the output queue for Thread D. 
Thread B calls buzz() to check if the number is divisible by 5 and adds the string "buzz" to the output queue for Thread D.
Thread C calls fizzbuzz() to check if the number is divisible by both 3 and 5 and adds the string "fizzbuzz" to the output queue for Thread D. 
Thread D calls the number() method to retrieve the next number from the output queue and displays it if there is a number available for output.
