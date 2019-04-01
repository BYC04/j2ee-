

import java.io.Serializable;
import java.io.StringReader;

public class Book implements Serializable {
    private static final long serialVersionUTD=1L;
    private String id;
    private String name;
    public Book(){
    }
    public Book(String id,String name){
        this.id=id;
        this.name=name;
    }
    public String getId(){
        return  id;
    }
    public void setId(String id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}
