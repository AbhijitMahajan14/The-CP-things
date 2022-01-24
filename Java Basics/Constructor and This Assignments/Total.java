class Total{

   int orderId;
   String OrderedFood;
   double totalPrice;
   String status;


   public Total(int orderId, String OrderedFood, double totalPrice,String status)
   {
       this.orderId = orderId;
       this.OrderedFood = OrderedFood;
       this.totalPrice = totalPrice;
       this.status = status;
   }

    int totalPrice()
   {
     
    int unitPrice =(int)(this.totalPrice-(5/100));
    return unitPrice;
   }



    public static void main(String[] args)
    {
        Total t=new Total(101,"pizza",100,"ordered");
       
        System.out.println( totalPrice());



    }
}