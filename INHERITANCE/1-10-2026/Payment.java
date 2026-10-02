class Payment{
    int amount;
    void makePayment(){
        System.out.println("Making a payment of 400");
    }

    }
class UPIPayment extends Payment{
    @Override
    

    void makePayment(){
        
        System.out.println("Making Upi payment of 500");
        super.makePayment();
    }

        public static void main(String args[]){
            UPIPayment u1=new UPIPayment();
            u1.makePayment();
        }

    }

