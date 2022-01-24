class Customer{
    int id;
    String customerName;
    long contactNumber; 
    String address;

    Customer(String customerName, long contactNumber, String address)
    {
        this.customerName =customerName;
        this.contactNumber =contactNumber;
        this.address =address;
    }

    void display(){
        System.out.println("Displaying customer record");
        System.out.println("Customer id :"+this.id);
        System.out.println("Customer name :"+this.customerName);
        System.out.println("Customer Number :"+this.contactNumber);
        System.out.println("Customer address :"+this.address);


    }

    public static void main(String[] args){
        Customer c=new Customer("Abhijit",7020203767l,"Hivarkhede");
        c.display();
    }
}