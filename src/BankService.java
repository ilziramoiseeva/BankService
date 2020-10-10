public class BankService {
    double deposit(double percent,int sum){
        double deposit=sum*percent/100;
        return deposit;
    }
    int cashback(int regularCategoryCost,int increasedCategoryCost,int specialCategoryCost){
      int regularPercent=1;
      int increasedPercent=5;
      int specialPercent=30;
      int maxCashback=3000;
      int regularCashback=regularCategoryCost*regularPercent/100;
      int increasedCashback=increasedCategoryCost*increasedPercent/100;
      int specialCashback=specialCategoryCost*specialPercent/100;
      int cashback=regularCashback+increasedCashback+specialCashback;
      if(cashback>maxCashback){
          cashback=maxCashback;
      }
      return cashback;
    }

}
