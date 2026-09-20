public class TotalSales {
  int  totalSales(int[]sales){
    int length=sales.length;
    int sum=0;
    for(int i=0;i<length;i++){
        sum=sum+sales[i];

    }
    return sum;

  }
  public static void main(String[] args) {
    TotalSales t1=new TotalSales();
    int sales[]={500,800,300,700,900};
    int totalsales=t1.totalSales(sales);
    System.out.println(totalsales);
  }
    
}
