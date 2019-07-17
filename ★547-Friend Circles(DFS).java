class Solution {
    public int findCircleNum(int[][] M) {
        int[] visited = new int[M.length];
        int count = 0;
        for(int i = 0; i < M.length; i++){
            if(visited[i] == 0){
                count++;
                dfs(i, visited, M);
            }
        }
        return count;
    }
    
    public void dfs(int i, int[] visited, int[][] M){
        visited[i] = 1;
        for(int j = 0; j < visited.length; j++){
            if(M[i][j] == 1 && i != j && visited[j] == 0){
                dfs(j, visited, M);
            }
        }
    }
}