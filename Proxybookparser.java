public class Proxybookparser implements Ibookparser{
    private Ibookparser bp ; 
    // private Bookparser bp; both possible
    public int no_of_pages(){
        if(bp == null){
            System.err.println("initialisation");
            bp = new Bookparser("abc");
        }
        return bp.no_of_pages();
    }

}