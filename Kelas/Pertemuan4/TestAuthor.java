public class TestAuthor{
    public static void main(String[] args) {
        Author dotti = new Author("Dotti","dotti@yahoo.com",'m');
        System.out.println(dotti); 

        //Test Setter and Getter
        dotti.setEmail("dotti@yahoo.com");
        System.out.println(dotti);  
        System.out.println(" name is : " + dotti.getName());
        System.out.println(" Gender is : " + dotti.getGender());
        System.out.println(" Email is : " + dotti.getEmail());
    }
}