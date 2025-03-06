package Thread;

import org.junit.runner.RunWith;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.emptyOrNullString;

@RunWith(SpringRunner.class)
@WebMvcTest(ConfirmationController.class)
public class ConfirmationControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @Test
  public void testGetConfirmationNumber() throws Exception {
    // Perform request and capture response
    MvcResult result = mockMvc.perform(get("/api/confirmation"))
      .andExpect(status().isOk())
      .andExpect(content().string(not(emptyOrNullString())))
      .andReturn();

    // Extract and print the confirmation number
    String response = result.getResponse().getContentAsString();
    System.out.println("Received Confirmation Number: " + response);
  }
}
