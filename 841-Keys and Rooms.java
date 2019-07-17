class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int len = rooms.size();
        int[] visited = new int[len];
        visited[0] = 1;
        dfs(rooms, visited, 0);
        
        for(int j = 0; j < rooms.size(); j++){
            if(visited[j] == 0)
                return false;
        }
        return true;
    }
    
    public void dfs(List<List<Integer>> rooms, int[] visited, int i){
            for(int k = 0; k < rooms.get(i).size(); k++){
                int key = rooms.get(i).get(k);
                if(visited[key] == 0){
                    visited[key] = 1;
                    dfs(rooms, visited, key);
                }

            }
    }
}