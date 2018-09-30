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
  
  Note : Two major differences compared to solution given in interview
    - Count map is not adding value as we can remove a line even if a word occurs once
    - Instead of picking next word having max occurences from original map, first cleaning up the map to find next word having max occurences in remaining lines
  
*/
class MinWordFinder{
  Map<String,Set<Integer>> wordOccurences = new HashMap<>();

  
  public void findMinWordsSet(String filePath){
  
    InputStreamReader reader = new BufferedInputStreamReader(new FileInputStream(filePath));
      String currentLine = reader.readLine();
      int currentLineNumber = 0;
      while(line != null){
        currentLineNumber++;
        String[] words = line.split(" ");
        for(int i=0; i < words.length;i++){
          if(wordOccurences.contains(words[i])){
            wordOccurences.get(words[i]).add(currentLineNumber);
          }else{
            Set<Integer> lineNumbers = new SortedHashSet<>();
            lineNumbers.add(currentLineNumber);
            wordOccurences.put(words[i],lineNumbers);
          }
        }
      }
      Set<String> minwordsSet = new HashSet<>();
      int totalLines = currentLineNumber;
      int removedPages = 0;

      while(removedPages.size() < totalLines){
        String wordWithMaxOccurences = findWordInMaxLines();
        minWordSet.add(wordWithMaxOccurences);
        removedPages += wordOccurences.get(wordWithMaxOccurences).size());
        filterLineNumbersFromOtherWords( wordOccurences.get(wordWithMaxOccurences));

      }
      return minWordSet;
  }
  
  public void filterLineNumbersFromOtherWords(Set<Integer> linesTobeRemoved){
    for(String word : wordOccurences.keySet()){
      Set<Integer> lineNumbers = wordOccurences.get(word);
      lineNumbers.removeAll(linesToBeRemoved);
      if(lineNumbers.isEmpty()){
        wordOccurences.remove(word);
      }
    }
  }
  
  public String findWordInMaxLines(){
    Set<String> words = wordOccurences.keySet();
    int maxLines = 0;
    String maxOccWord = null;
    for(String word : words){
      if(wordOccurences.get(word).size() > maxLines){
        maxLines = wordOccurences.get(word).size();
        maxOccWord = word;
      }
    }
    return maxOccWord;
  }
  
}
