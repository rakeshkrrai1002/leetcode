class Solution {
    public int maximumWealth(int[][] accounts) {
        int wealth = Integer.MIN_VALUE;
        // int wealth = 0;

        for(int i =0; i <accounts.length ; i++){
            int temp =0;
            for(int j=0; j<accounts[i].length ; j++){
                temp += accounts[i][j];
            }
            if (temp > wealth){
                wealth = temp;
            }
        }

        return wealth;


        
    }
}