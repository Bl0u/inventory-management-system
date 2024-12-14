package Classes.AdminManagers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerManagerTest {

    @Test
    void summation() {
        CustomerManager cm = new CustomerManager();
        assertTrue(help.summation(3,5) == 8);
    }

}