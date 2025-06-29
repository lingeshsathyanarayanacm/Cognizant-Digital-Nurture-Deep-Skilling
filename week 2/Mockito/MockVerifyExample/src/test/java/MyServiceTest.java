import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testAllVerifications() {
        ExternalApi mockApi = mock(ExternalApi.class);
        MyService service = new MyService(mockApi);
        service.fetchData();
        service.doNothing();
        verify(mockApi, times(1)).getData();
        verify(mockApi, never()).deleteData();
        verify(mockApi, atLeastOnce()).getData();
    }
}
