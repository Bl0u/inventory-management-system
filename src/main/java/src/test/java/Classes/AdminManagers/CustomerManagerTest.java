package Classes.AdminManagers;

import Classes.Users.User;
import Classes.AdminManagers.CustomerManager;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CustomerManagerTest {


    @Test
    public void testCustomerManager() throws Exception {

        
        // Set up input that will be provided to the Scanner in the summation method
        String input = "test input";  // This will be the string that `nextLine()` will return
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);  // Redirect System.in to mock input

        // Capture the output printed to System.out
//        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//        PrintStream printStream = new PrintStream(outputStream);
//        System.setOut(printStream);  // Redirect System.out to capture output

        // Call the method to test
        int result = CustomerManager.summation(2, 5);  // Call summation with a and b as 2 and 5

        // Get the captured output
        //String output = outputStream.toString().trim();

        // Print the captured output to the console for debugging
        //System.out.println("Captured Output: " + output);

        // Assert that the output contains expected strings
//        assertTrue(output.contains("hello"));
//        assertTrue(output.contains("NEGGA"));

        // Verify the result of the summation method
        assertEquals(7, result);

        // Reset System.out to its original state
        System.setOut(System.out);
    }

    @Test
    public void testHandleCustomerManagement() throws Exception {
        // Simulate user input: "peter" for name, "user" for email
        String input = "peter\nuser\n";  // Input for name and email
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);  // Redirect System.in to mock input

//        // Capture the output printed to System.out
//        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//        PrintStream printStream = new PrintStream(outputStream);
//        System.setOut(printStream);  // Redirect System.out to capture output

        // Create an actual CustomerManager instance
        CustomerManager cm = new CustomerManager();

        // Spy on the real instance of CustomerManager to mock addCustomer behavior
        CustomerManager spyCm = Mockito.spy(cm);
        Mockito.doReturn(false).when(spyCm).addCustomer("user");  // Mock addCustomer to return true

        // Call the method under test
        spyCm.handleCustomerManagement(1);  // Call handleCustomerManagement with choice 1 (add customer)

        // Get the captured output
        //String output = outputStream.toString().trim();

        // Validate that the correct success message was printed
        //assertTrue(output.contains("Customer added successfully."), "Expected success message was not printed.");

        // Reset System.out to its original state
        //System.setOut(System.out);
    }

    @Test
    public void testHandleCustomerManagement2() throws Exception {
        // Simulate user input: "peter" for name, "user" for email
        String input = "peter\nuser\n";  // Input for name and email
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);  // Redirect System.in to mock input

        // Capture the output printed to System.out
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);  // Redirect System.out to capture output

        // Create an actual CustomerManager instance
        CustomerManager cm = new CustomerManager();

        // Spy on the real instance of CustomerManager to mock addCustomer behavior
        CustomerManager spyCm = Mockito.spy(cm);
        Mockito.doReturn(false).when(spyCm).addCustomer("user");  // Mock addCustomer to return false (customer not added)

        // Call the method under test
        spyCm.handleCustomerManagement(1);  // Call handleCustomerManagement with choice 1 (add customer)

        // Get the captured output
        String output = outputStream.toString().trim();
        System.out.println(output);  // Print captured output to the console for debugging

        // Validate that the correct failure message was printed
        assertTrue(output.contains("Failed to add customer."), "Expected failure message was not printed.");

        // Reset System.out to its original state
        System.setOut(System.out);
    }
}
