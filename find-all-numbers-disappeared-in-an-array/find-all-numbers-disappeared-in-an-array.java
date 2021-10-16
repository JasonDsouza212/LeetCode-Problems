class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        return sort(nums);
    }
    public List<Integer> sort(int[] arr){
         List<Integer> list=new ArrayList<Integer>(); 
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]<=arr.length && arr[i]!=arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }else{
                i++;
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]==j+1){
                continue;
            }else{
                list.add(j+1);
            }
        }
        return list;
    }
    }
    
