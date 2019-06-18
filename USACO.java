import java.io.*;
import java.util.*;

public class USACO{

  public static int bronze(String filename) throws FileNotFoundException{
    File f = new File(filename);
    Scanner s = new Scanner(f);

    int R, C, E, N;
    int solution = 0;
    int[] assign = new int[4];

    for(int i = 0; i < 4; i++){
      assign[i] = Integer.parseInt(s.next());

    }

    R = assign[0];
    C = assign[1];
    E = assign[2];
    N = assign[3];




    return solution;
  }

  //public static int silver(String filename);
}
