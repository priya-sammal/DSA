class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int gassum=0 , costsum=0;
        for(int g : gas){gassum+=g;}
        for(int c : cost){ costsum+=c;}

        if(gassum<costsum){
            return -1;
        }
        int tot=0;
        int res=0;

        for(int i=0;i<n;i++){
            tot=tot+gas[i]-cost[i];

            if(tot<0){
                tot=0;
                res=i+1;
            }
        }
        return res;
    }
}
