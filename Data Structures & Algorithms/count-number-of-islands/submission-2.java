class Solution {
    public int numIslands(char[][] grid) {
        // start at 0,0 then mark all the parts of the island as 0 and move on

        int[][] dirs = {{0,1}, {0,-1}, {1,0}, {-1,0}};

        Queue<int[]> queue  = new LinkedList<>();

        int count = 0;

        int n = grid.length;
        int m = grid[0].length;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){

                if(grid[i][j] == '1'){
                    count++;
                    queue.offer(new int[] {i,j});
                    grid[i][j] = '0';
                    
                    while(!queue.isEmpty()){
                        int[] curr = queue.poll();

                        for(int[] dir : dirs){
                            int newN = curr[0] + dir[0];
                            int newM = curr[1] + dir[1];
                            if(newN < grid.length && newN >= 0 &&
                            newM >= 0 && newM < grid[0].length && grid[newN][newM] == '1'){
                                queue.offer(new int[] {newN,newM});
                                grid[newN][newM] = '0';
                            }
                        }
                    }
                }
            }
        }
        return count;
    }
}
