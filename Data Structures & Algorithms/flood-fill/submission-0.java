class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int orig = image[sr][sc];
        if(orig == color) return image;

        int m = image.length;
        int n = image[0].length;

        Queue<int[]> q = new LinkedList<>();

        q.offer(new int[] {sr, sc});

        image[sr][sc] = color;

        int[][] directions = {{1,0}, {0,1}, {-1,0}, {0,-1}};

        while(!q.isEmpty()){
            int[] cell = q.poll();
            int r = cell[0];
            int c = cell[1];
            for(int[] d : directions){
                int currR = r + d[0];
                int currC = c + d[1];

                if(currR >= 0 && currR < m && currC >= 0 && currC < n && image[currR][currC] == orig){
                    image[currR][currC] = color;
                    q.add(new int[] {currR, currC});
                }
            }
        }

        return image;


    }
}