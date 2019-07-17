class Solution {
public int numIslands(char[][] grid) {
    int count=0;
    for(int i=0;i<grid.length;i++)
        for(int j=0;j<grid[0].length;j++){
            if(grid[i][j]=='1'){
                bfsFill(grid,i,j);
                count++;
            }
        }
    return count;
}
private void bfsFill(char[][] grid,int i, int j){
    grid[i][j] = '0';
    int n = grid.length;
    int m = grid[0].length;
    Queue<Integer> queue = new LinkedList<Integer>();
    int num = i*m+j;
    queue.offer(num);
    while(!queue.isEmpty()){
        num = queue.poll();
        int x = num/m;
        int y = num%m;
        if(x>0&&grid[x-1][y]=='1'){
            grid[x-1][y] = '0';
            queue.offer(m*(x-1)+y);
        }
        if(x<n-1&&grid[x+1][y]=='1'){
            grid[x+1][y] = '0';
            queue.offer(m*(x+1)+y);
        }
        if(y>0&&grid[x][y-1]=='1'){
            grid[x][y-1] = '0';
            queue.offer(m*x+y-1);
        }
        if(y<m-1&&grid[x][y+1]=='1'){
            grid[x][y+1] = '0';
            queue.offer(m*x+y+1);
        }
    }
    }
}