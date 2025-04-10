import java.util.*;

public class WordList
{
  private ArrayList <String> myList;

  public WordList() { myList = new ArrayList<String>(); }
  public void add(String word) { myList.add(word); }
  public String toString() { return myList.toString(); }

  public int numWordsOfLength(int len)
  {
    /* to be implemented in part (a) */
    int cnt = 0;
    for (String ent : myList) {
      if (ent.length() == len) cnt++;
    }
    return cnt;
  }

  public void removeWordsOfLength(int len)
  {
    /* to be implemented in part (b) */
    for (int i = myList.size() - 1; i >= 0; i--) {
      if (myList.get(i).length() == len)
        myList.remove(i);
    }
  }
}
