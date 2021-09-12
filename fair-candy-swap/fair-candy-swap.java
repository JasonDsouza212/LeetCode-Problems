class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int[] result=new int[2];
        int sum1=0;
        int sum2=0;
        Set<Integer> setB=new HashSet<Integer>();
        for(int a:aliceSizes){
            sum1+=a;
        }
        for(int b:bobSizes){
            sum2+=b;
            setB.add(b);
        }
        int delta=(sum2-sum1)/2;
        for(int a:aliceSizes){
            if(setB.contains(a+delta)){
                result[0]=a;
                result[1]=a+delta;
                return result;
            }
        }
        return null;
    }
}