package arrays;

import java.util.ArrayList;
import java.util.HashMap;

public class TournamentWinner {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> teams = new ArrayList<>();
        ArrayList<String> ar1 = new ArrayList<>();
        ar1.add("A");
        ar1.add("B");
        teams.add(ar1);


        ArrayList<Integer> score = new ArrayList<>();
        score.add(0);
        getWinner(teams,score);
    }

    private static void getWinner(ArrayList<ArrayList<String>> teams, ArrayList<Integer> results) {

            //njnjnj
            HashMap<String,Integer> scoremap = new HashMap<String,Integer>();
            int maxScore = Integer.MIN_VALUE;
            String currentWinner = " ";

            for(int i = 0 ; i < results.size(); i++){
                int winner = 0;
                if (results.get(i) == 0){
                    //away won
                    winner = 1;

                }else{
                    winner = 0;
                }

                String winnerName = teams.get(i).get(winner);
                int score = 0;


                if (scoremap.containsKey(winnerName)){
                     score = scoremap.get(winnerName)+1;
                    scoremap.put(winnerName,score);
                }else{
                    scoremap.put(winnerName,1);
                }
                if (score > maxScore){
                    maxScore = score;
                    currentWinner = winnerName;
                }
            }
        System.out.println( currentWinner);
        }


}
