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


    int[][] board = new int[R][C];

    for(int i = 0; i < R; i++){
      for(int j = 0; j < C; j++){
        board[i][j] = Integer.parseInt(s.next());
      }
    }


    int counter = 0;

    while(counter < N){

      int row = Integer.parseInt(s.next()) - 1;
      int col = Integer.parseInt(s.next()) - 1;
      int stomp = Integer.parseInt(s.next());

      int maximum = 0;

      for(int r = row; r < row + 3; r++){
        for(int c = col; c < col + 3; c++){
          if(board[r][c] > maximum){
            maximum = board[r][c];
          }
        }
      }

      for(int r = row; r < row + 3; r++){
        for(int c = col; c < col + 3; c++){
          int d = maximum - board[r][c];

          if(d < stomp){
            board[r][c] = maximum - stomp;
          }
        }
      }
      counter++;
    }

    for(int r = 0; r < R; r++){
      for(int c = 0; c < C; c++){
        int current = board[r][c];

        if(E - current > 0){
          solution += E - current;
        }
      }
    }

    solution = solution * 72 * 72;
    return solution;
  }

  //public static int silver(String filename);
}
