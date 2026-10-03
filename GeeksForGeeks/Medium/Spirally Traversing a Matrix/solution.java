class Solution {
    public ArrayList<Integer> spirallyTraverse(int[][] mat) {

        ArrayList<Integer> ans = new ArrayList<>();

        int startrow = 0;
        int endrow = mat.length - 1;
        int startcol = 0;
        int endcol = mat[0].length - 1;

        while (startrow <= endrow && startcol <= endcol) {

            // Left -> Right
            for (int j = startcol; j <= endcol; j++) {
                ans.add(mat[startrow][j]);
            }
            startrow++;

            // Top -> Bottom
            for (int i = startrow; i <= endrow; i++) {
                ans.add(mat[i][endcol]);
            }
            endcol--;

            // Right -> Left
            if (startrow <= endrow) {
                for (int j = endcol; j >= startcol; j--) {
                    ans.add(mat[endrow][j]);
                }
                endrow--;
            }

            // Bottom -> Top
            if (startcol <= endcol) {
                for (int i = endrow; i >= startrow; i--) {
                    ans.add(mat[i][startcol]);
                }
                startcol++;
            }
        }

        return ans;
    }
}