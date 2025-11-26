import java.util.*;
class G{
    public static void main(String[] args) {
        Formatter foramtter=new Formatter();
        foramtter=new Formatter();

        foramtter.format("%20.04f",124.1342);
        System.out.println(foramtter);

        foramtter=new Formatter();
        foramtter.format("%-20.04f",127.22556);
        System.out.println(foramtter);
    }
}