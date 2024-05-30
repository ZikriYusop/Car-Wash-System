 

public class Carwash{
    private String bookID;
    private String bookName;
    private String phone;
    private String carType;
    private String serviceType;
    
    public Carwash(String ID,String Name,String phoneNo,String Type,String sType){
        bookID=ID;
        bookName=Name;
        phone=phoneNo;
        carType=Type;
        serviceType=sType;
        
    }
    public void setID(String ID){
        bookID=ID;
    }
    public void setName(String Name){
        bookName=Name;
    }
    public void setPhoneNo(String phoneNo){
        phone=phoneNo;
    }
    public void setType(String Type){
        carType=Type;
    }
    public void setSType(String sType){
        serviceType=serviceType;
    }
    public String getID(){
        return bookID;
    }
    public String getBookName(){
        return bookName;
    }
    public String getPhone(){
        return phone;
    }
    public String getCarType(){
        return carType;
    }
    public String getServiceType(){
        return serviceType;
    }
    public String toString()
    {
        return ("\nBookID: " + bookID + "\nBookName: " + bookName + "\nPhoneNum: " + phone + "\nCarType: " + carType+ "\nSrviceType: " + serviceType);
    }
    
}