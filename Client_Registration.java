public class Client_Registration  extends Registration{
    
    @Override
    public void register() {
        super.register();
    }
    @Override
    public void print_Details(){
        System.out.println("-------------");
        System.out.println("Client Details");
        super.print_Details();
    }
    
}
