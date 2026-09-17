class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        List<HashSet<String>> rows = new LinkedList<>();
        List<HashSet<String>> cols = new LinkedList<>();
        List<HashSet<String>> squares = new LinkedList<>();
        for (int i = 1; i < 10; i++) {
            rows.add(new HashSet<String>());
            cols.add(new HashSet<String>());
            squares.add(new HashSet<String>());
        }
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (!add(board[i][j], rows.get(i)) || !add(board[i][j], cols.get(j))) {
                    return false;
                }
                int square = whichSquare(i, j);
                if (!add(board[i][j], squares.get(square))) {
                    return false;
                }
            }
        }
        return true;

        
    }

    private int whichSquare(int i, int j) {
        int row = i / 3;
        int col = j / 3;
        if (row == 0 && col == 0) {
            return 0;
        } else if (row == 0 && col == 1) {
            return 1;
        } else if (row == 0 && col == 2) {
            return 2;
        } else if (row == 1 && col == 0) {
            return 3;
        } else if (row == 1 && col == 1) {
            return 4;
        } else if (row == 1 && col == 2) {
            return 5;
        } else if (row == 2 && col == 0) {
            return 6;
        } else if (row == 2 && col == 1) {
            return 7;
        } else if (row == 2 && col == 2) {
            return 8;
        }
        return 9;
    }

    private boolean add(char cell, HashSet<String> set) {
        String s = String.valueOf(cell);
        if (!s.matches("[0-9]") && (!s.equals("."))) {
            return false;
        }

        if (s.equals(".")) {
            return true;
        }

        if (set.contains(s)) {
            return false;
        }
        set.add(s);
        return true;
    }
}
