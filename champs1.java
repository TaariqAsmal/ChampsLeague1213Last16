/**
 *
 * @author Taariq Asmal
 * Contact: twitter.com/TaariqAsmal
 * taariq.asmal@gmail.com
 * 
 */
public class Champs1 {

    public static void main(String[] args) {
        
        //Array to signify which teams can play against which other team
        int [][] teams = new int [8][9];
        
        //Array to signify which group winners have already been selected
        int [] used = new int[8];

        //at first, no group winners have been selected
        for(int i = 0; i < 8; i++)
            used[i] = 0;
        
        //ignore teams[x][0] for all x. I planned to use it, but it was unneeded in the end
        
        // 0 : Team can not play against this opponent
        // 1 : team can play against this opponent
        //teams[x][1]: PSG
        //teams[x][2]: Schalke 04
        //teams[x][3]: Malaga
        //teams[x][4]: Dortmund
        //teams[x][5]: Juventus        
        //teams[x][6]: Bayern Munich
        //teams[x][7]: Barcelona
        //teams[x][8]: Manchester United
        
        
        // 0 : Team has not been assigned an opponent
        // 1 : Team has been assigned an opponent   
        //used[0]: PSG
        //used[1]: Schalke 04
        //used[2]: Malaga
        //used[3]: Dortmund
        //used[4]: Juventus        
        //used[5]: Bayern Munich
        //used[6]: Barcelona
        //used[7]: Manchester United
        
        
        //Porto
        teams[0][0] = 1;
        teams[0][1] = 0;
        teams[0][2] = 1;
        teams[0][3] = 1;
        teams[0][4] = 1;
        teams[0][5] = 1;
        teams[0][6] = 1;
        teams[0][7] = 1;
        teams[0][8] = 1;
        
        //Arsenal
        teams[1][0] = 2;
        teams[1][1] = 1;
        teams[1][2] = 0;
        teams[1][3] = 1;
        teams[1][4] = 1;
        teams[1][5] = 1;
        teams[1][6] = 1;
        teams[1][7] = 1;
        teams[1][8] = 0;
        
        //AC Milan
        teams[2][0] = 3;
        teams[2][1] = 1;
        teams[2][2] = 1;
        teams[2][3] = 0;
        teams[2][4] = 1;
        teams[2][5] = 0;
        teams[2][6] = 1;
        teams[2][7] = 1;
        teams[2][8] = 1;
        
        //Real Madrid
        teams[3][0] = 4;
        teams[3][1] = 1;
        teams[3][2] = 1;
        teams[3][3] = 0;
        teams[3][4] = 0;
        teams[3][5] = 1;
        teams[3][6] = 1;
        teams[3][7] = 0;
        teams[3][8] = 1;
        
        //Shakter Donetsk
        teams[4][0] = 5;
        teams[4][1] = 1;
        teams[4][2] = 1;
        teams[4][3] = 1;
        teams[4][4] = 1;
        teams[4][5] = 0;
        teams[4][6] = 1;
        teams[4][7] = 1;
        teams[4][8] = 1;
        
        //Valencia
        teams[5][0] = 6;
        teams[5][1] = 1;
        teams[5][2] = 1;
        teams[5][3] = 0;
        teams[5][4] = 1;
        teams[5][5] = 1;
        teams[5][6] = 0;
        teams[5][7] = 0;
        teams[5][8] = 1;
        
        //Celtic
        teams[6][0] = 7;
        teams[6][1] = 1;
        teams[6][2] = 1;
        teams[6][3] = 1;
        teams[6][4] = 1;
        teams[6][5] = 1;
        teams[6][6] = 1;
        teams[6][7] = 0;
        teams[6][8] = 1;
        
        //Galatasary
        teams[7][0] = 8;
        teams[7][1] = 1;
        teams[7][2] = 1;
        teams[7][3] = 1;
        teams[7][4] = 1;
        teams[7][5] = 1;
        teams[7][6] = 1;
        teams[7][7] = 1;
        teams[7][8] = 0;
        
        System.out.println("Total Possible game combinations:");
        
        System.out.println(match(teams, used, 0));
        
        //Output:
        //Total Possible game combinations:
        //5463       
    }
    
    //method uses recursion to determine possible combinations
    public static int match(int [][] teams, int[]used,int team){
        int num = 0;
        
        for(int i = 0; i <8; i++){
            if(teams[team][i+1] == 0 || used[i] == 1)
                continue;
            else{
                used[i] = 1;
                if (team < 7){
                    num = num + match(teams, used, team + 1 );                    
                    used[i] = 0;
                }
                else{
                    used[i] = 0;
                    return 1;
                }
            }
        }
        return num;
    }
    
}
