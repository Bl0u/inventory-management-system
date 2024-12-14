package Classes.AdminManagers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SupplierManagerTest {

    void summation() {
        var help = new SupplierManager();
        assertTrue(help.summation(3,5) == 8);
    }
}