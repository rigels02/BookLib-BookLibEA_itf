package service;

import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author raitis
 */
@Remote
public interface IBooksBeanRemote {

    List<BookDTO> r_findAll();
    
    BookDTO  r_findById(long id);
    
    void r_create(BookDTO book);
    
    void r_edit(BookDTO book);
    
    void r_remove(BookDTO book);    
}
