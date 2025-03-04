package Thread;

import org.junit.jupiter.api.Test;
import org.springframework.mock.web.MockHttpServletRequest;

import static org.junit.jupiter.api.Assertions.*;

public class MockRequestTest {

  @Test
  public void testMockHttpServletRequest() {
    // Create a mock request
    MockHttpServletRequest request = new MockHttpServletRequest();
    request.setMethod("POST");
    request.setRequestURI("/test");
    request.setParameter("name", "Alice");

    // Assertions
    assertEquals("POST", request.getMethod());
    assertEquals("/test", request.getRequestURI());
    assertEquals("Alice", request.getParameter("name"));
  }
}
