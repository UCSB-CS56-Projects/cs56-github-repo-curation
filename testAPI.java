import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub; 
 
import java.util.Collection; 
 
 
public class testAPI { 
    public static void main(String[] args) throws Exception { 
        Collection<GHRepository> lst = GitHub.connect().getUser("kohsuke").getRepositories().values(); 
        for (GHRepository r : lst) { 
            System.out.println(r.getName()); 
        } 
        System.out.println(lst.size()); 
    } 
}
