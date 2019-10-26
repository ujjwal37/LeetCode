class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        
        int color  = image[sr][sc];
        if(color != newColor) Dfs(image , sr ,sc ,color, newColor);
        
        return image;
    }
    
    public  void Dfs(int[][] image , int r , int c ,int color, int newColor){
        
        if(image[r][c] == color){
            image[r][c] = newColor;
            if(r >= 1) Dfs(image , r-1 , c , color , newColor);
            if(c >= 1) Dfs(image , r , c-1,color , newColor);
            if(r+1 < image.length) Dfs(image , r+1 , c , color , newColor);
            if(c+1  < image[0].length) Dfs(image , r , c+1 ,color , newColor);
        } 
    }
}