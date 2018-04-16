package bookinginfo;

import java.util.ArrayList;
import bookinginfo.bookinginfo;

public interface bookinter {
 void addata(theater_partner.theatergetsetter boo);
 void update(bookinginfo boo,int wd_id);
 void delete(int id);
 bookinginfo get(int eid);
 ArrayList<bookinginfo> get();    
}
