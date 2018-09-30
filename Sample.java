/*
  1. Read file contents via buffered reader
  2. For each line
  3.  For each word in line
        Put into word occurences map word is the key and set of line numbers is the value. Note here word occuring more than once in same line still counts one being set and they are sorted array
  4. Find the word occuring in max lines 
  5. Remove the word from map and to curr min word set
  6. Add line numbers to removedLines array holding all lines which are already have a match with curr min word set
  7. If count of removed lines is equal to total lines, we found min words set
  8. Go through all remaining words
      for each word
        filter line numbers list by removing the lines which are just found by the last word added to set. Here we make use of the fact that both lists are sorted
  9. Repeat from step-4
  
  
*/
class MinWordFinder{
  

}
