/*
 * this is buy and sell stock problem where we have to find the maximum profit that can be achieved by buying and selling a 
 * stock on different days.
 * 
 * for this we take the minimum price of stock and calculate profit for each day and keep track of the maximum profit that can be achieved.
 * 
 * timecomplexity is o(n) and space complexity is o(1)
 */
public class BuyandSellStocks {
    public static void buyandsell(int arr[]){
        int minprice=arr[0];
        int maxprofit=0;

        for(int i=0 ;i<arr.length;i++){

            if(arr[i]<minprice){
                minprice=arr[i];
            }
            int profit = arr[i]-minprice;

            if(profit>maxprofit){
                maxprofit=profit;
            }
        }
        System.out.println("The maximum profit that can be achieved is: " + maxprofit); 
    }
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        buyandsell(arr);
    }
}
