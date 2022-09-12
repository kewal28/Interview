public class TicTacTao {
    // int[] scoreboard = {-1, -1, 0, -1, 0, -1, 0, -1, -1};
    public int[] scoreboard = {-1, -1, -1, -1, -1, -1, -1, -1, -1};
    // int[] scoreboard = {0, -1, -1, -1, 0, -1, -1, -1, 0};
    int[][] scoreboardMatr = new int[3][3];
    public static void main(String[] args) {
        Boolean check = false;
        TicTacTao obj = new TicTacTao();
        obj.scoreboard[0] = -1;
        obj.scoreboard[1] = 0;
        obj.scoreboard[2] = -1;
        check = obj.checkWinner(0);
        printArr(obj.scoreboardMatr);
        System.out.print(check);
        System.out.println();

        obj.scoreboard[3] = -1;
        obj.scoreboard[4] = 0;
        obj.scoreboard[5] = -1;
        check = obj.checkWinner(0);
        printArr(obj.scoreboardMatr);
        System.out.print(check);
        System.out.println();

        obj.scoreboard[6] = -1;
        obj.scoreboard[7] = 0;
        obj.scoreboard[8] = -1;
        check = obj.checkWinner(0);
        printArr(obj.scoreboardMatr);
        System.out.print(check);
        System.out.println();
    }

    Boolean checkWinner(int user) {
        int sum = 0;
        if(user == 1) {
            sum = 3;
        }
        int count =0;
        Boolean result = false;
        for(int x =0; x<3; x++) {
            for(int i =0; i<3; i++) {
                this.scoreboardMatr[x][i] = this.scoreboard[count];
                count++;
            }
        }
        int resultCount = 0;
        //Check Row
        for(int row=0; row<this.scoreboardMatr.length;row++) {
            for(int col=0; col<this.scoreboardMatr[row].length;col++) {
                resultCount += this.scoreboardMatr[row][col];
            }
            if(resultCount == sum) {
                return true;
            }
        }
        resultCount = 0;
        //Colums
        for(int row=0; row<this.scoreboardMatr.length;row++) {
            result = false;
            for(int col=0; col<this.scoreboardMatr[row].length;col++) {
                resultCount += this.scoreboardMatr[row][col];
            }
            if(resultCount == sum) {
                return true;
            }
        }
        resultCount = 0;
        //Dignal Left To Right
        for(int row=0; row<this.scoreboardMatr.length;row++) {
            result = false;
            resultCount += this.scoreboardMatr[row][row];
            if(resultCount == sum) {
                return true;
            }
        }

        resultCount = 0;
        int col =0;
        //Dignal Right To left
        for(int row=this.scoreboardMatr.length-1; row>0;row--) {
            result = false;
            resultCount += this.scoreboardMatr[col][row];
            col++;
            if(resultCount == 0 || resultCount == 3) {
                return true;
            }
        }
        return result;
    }


    static void printArr(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }



}
