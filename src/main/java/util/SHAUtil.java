package util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHAUtil {
	public static String sha(String senha) throws NoSuchAlgorithmException {
		MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
		messageDigest.update(senha.getBytes());
		return new BigInteger(1, messageDigest.digest()).toString(16); 
	}
}