package utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

    public boolean retry(ITestResult result) {
        int count = 0;
        int retryCount = 1;
        while (count <retryCount) {
            count++;
            return true;
        }

        return false;
    }
}
