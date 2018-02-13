package poc;

public class Counter {
	private static int retryCount = 0;
	private static int maxRetries = 0;
	public static void main(String[] args) {
		retryCount++;
		System.out.println("Attempts Rem: " + hasAttemptRemaining());

		String str = "{\"msisdn\":\"8792240373\"}";
		System.out.println(str.hashCode());

		System.out.println("5%4: " + 4%5);

//		System.out.printf("5%4 %s", "akash");
//		System.out.printf("%s 5+7 %d", 10);
	}
	
	private static boolean hasAttemptRemaining() {
		return retryCount <= maxRetries;
	}

}
