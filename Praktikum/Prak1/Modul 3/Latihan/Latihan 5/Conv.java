public class Conv{
    public static void main(String args[]){
        Conv c = new Conv();
        String s = new String("ello");
        c.amethod(s);
    }

    public void amethod(String s){
        char c = 'H';
        String cString = Character.toString(c);
        cString += s;
        System.out.println(cString);
    }
}