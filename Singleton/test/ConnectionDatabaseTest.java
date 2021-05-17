
import com.mysql.jdbc.Connection;
import database.ConnectionDatabase;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author josue
 */
public class ConnectionDatabaseTest {
    
    @Test
    public void testCorrectoConnection(){
        Connection connection = ConnectionDatabase.getConnectionDatabase();
        Assert.assertNotNull(connection);
    }
    
}
