import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LoginPage {
	@Test
	public void testusername() {
		String username = "Administrator";
		assertTrue(isValidUsername(username));
	}
	private boolean isValidUsername(String username) {
        return username.matches("Administrator");
	}
    public void testValidPassword() {
        String password = "Abcd1234";
        assertTrue(isValidPassword(password));
        
    }
    private boolean isValidPassword(String password) {
        return password.matches("([0-9]).([a-zA-Z]).{8}");   
    }
}
