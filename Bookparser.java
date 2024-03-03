public class Bookparser implements Ibookparser {
    String name;
    public Bookparser(String name){
        this.name = name;
    } // this is a expensive parsing
    public int no_of_pages(){
        return 100;
    }
}
