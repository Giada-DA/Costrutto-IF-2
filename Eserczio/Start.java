public class Start02 {
    public static void main(String[] args) {
        String mySurname = "Dall'Ara";
        if(mySurname.contains("ni")){
            System.out.println("My surname contains the sequence of letters 'ni'");
        }else {
            System.out.println("My surname doesn't contain the sequence of letters 'ni'");
        }
        //String mySurname.contains("ni")? "My surname contains the sequence of letters 'ni'":"My surname doesn't contain the sequence of letters 'ni'";
    }
}