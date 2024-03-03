public class Main {
    public static void main(String args[]){
        Proxybookparser pbp = new Proxybookparser();
        pbp.no_of_pages();
        pbp.no_of_pages(); // 2nd time no initialisation
    }
}
