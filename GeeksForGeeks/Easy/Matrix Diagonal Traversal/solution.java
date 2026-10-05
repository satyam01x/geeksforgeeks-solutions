class Solution {
    static ArrayList<Integer> diagView(int mat[][]) {
        // code here
        
        // for upper diagonal traverse
        
        ArrayList<Integer> list = new ArrayList<>();
        
        int n = mat.length;
        
        for(int stcol = 0; stcol < n; stcol++){
            
            int row = 0;
            int column = stcol;
            
            while( row < n && column >= 0){
            list.add(mat[row] [column]);
            row++;
            column--;
            }
        }
        
        // for rigth diagonal traverse
        
        for(int strow = 1; strow < n; strow++){
            
            int row = strow;
            int column = n-1;
            
            while( row < n && column >= 0){
            list.add(mat[row] [column]);
            row++;
            column--;
            }
        }
        
        return list;
    }
}
