package Day17;

public class Address {
    /* Attributes:
        buildingNumber, street, city, state, zipCode

    Actions
            setInfo: sets all the instances
            toString: returns the address
                        EX:
                            7925 Jones Branch Dr
                            McLean Va, 22012
*/

   //String city ,Street,state;

    public void setInfo(int buildingNumber, int zipCode,String city,String state,String street){

        buildingNumber=206;
        state="Illinois";
        city ="Chicago";
        street ="5533 N Winthrop";
        zipCode=60640;
    }

    public static void main(String[] args) {
        Address ad= new Address();
        ad.setInfo(306,60640,"Chicago","Illinois","5533 N Winthrop");

    }


}
