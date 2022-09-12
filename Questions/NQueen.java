public class NQueen {
    public static boolean nQueen() {
        int chessBoard[][] = { { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 } };
        chessBoard = nQueenUtil(chessBoard, 0);
        // if (!) {
        //     System.out.print("Solution does not exist");
        //     return false;
        // }

        printArr(chessBoard);
        return true;
    }

    private static int[][] nQueenUtil(int[][] arr, int col){   
        if(arr.length < col) {
            return arr;
        } 
        for(int row= 0;row< arr.length-1; row++) {
            if(isSaveMove(arr, row, col)) {
                arr[row][col]  = 1;
                System.out.println();
                nQueenUtil(arr, col+1);
                arr[row][col]  = 0;
            }
        }
        return arr;
    }

    


    private static boolean isSaveMove(int[][] arr, int row, int col) {
        // System.out.println();
        // System.out.println("row"+row+"col"+col);
        // System.out.println();
        //Hor
        for(int x= 0;x< arr.length;x++) {
            if(arr[row][x] == 1) {
                return false;
            }
        }
        //Vertical
        for(int x= 0;x< arr.length;x++) {
            if(arr[x][col] == 1) {
                return false;
            }
        }
        //Upper Left
        int r = row;
        for(int c=col;c>=0 && r>=0;c--, r--) {
            if(arr[r][c] == 1) {
                return false;
            }
        }
        //Upper Right
        r = row;
        for(int c=col;c<arr.length && r>=0;c++, r--) {
            if(arr[r][c] == 1) {
                return false;
            }
        }
        //Lower Left
        r = row;
        for(int c=col; c>=0 && r<arr.length; r++, c--) {
            if(arr[r][c] == 1) {
                return false;
            }
        }
        //Lower Right
        r = row;
        for(int c=col; c<arr.length && r<arr.length;c++, r++) {
            if(arr[r][c] == 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        nQueen();
    }

    static void printArr(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }


}
