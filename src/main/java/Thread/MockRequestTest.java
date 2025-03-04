package Thread;

import org.junit.jupiter.api.Test;
import org.springframework.mock.web.MockHttpServletRequest;

import static org.junit.jupiter.api.Assertions.*;

public class MockRequestTest {

  @Test
  public void testMockHttpServletRequest() {


    @Mock
    private Submit mockSubmit; // Mocking Submit class

    @InjectMocks
    private SubmitService submitService; // The class containing `submit()` method

    @BeforeEach
    void setUp() {
      MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testSubmitMethod() {
      // Mocking dependencies
      String uniqueConfirmationNumber = UUID.randomUUID().toString(); // Generate a unique confirmation number

      when(mockSubmit.transmitRequestToQueue(any(), any(), any(), any()))
        .thenReturn(uniqueConfirmationNumber); // Ensure unique confirmation number

      // Execute the method
      submitService.submit();

      // Verify interactions
      verify(mockSubmit, times(1)).transmitRequestToQueue(any(), any(), any(), any());
    }
}
