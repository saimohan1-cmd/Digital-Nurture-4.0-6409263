import org.junit.Test;
import org.mockito.Mockito;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
public class MyServiceTest { 
	    @Test 
	    public void testExternalApi() { 
	        ExternalAPI mockApi = Mockito.mock(ExternalAPI.class); 
	        when(mockApi.getData()).thenReturn("Mock Data"); 
	        MyService service = new MyService(mockApi); 
	        String result = service.fetchData(); 
	        assertEquals("Mock Data", result); 
	    } 
} 


