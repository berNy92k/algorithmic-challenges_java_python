package euler;

public class Problem005 {

    public long smallestNumberDividedWithoutAnyReminder(final int start, final int end) {
        Long smallestNumber = null;

        long counter = end;
        while (smallestNumber == null) {
            boolean withReminders = false;
            for (int i = start; i < end; i++) {
                if (counter % i != 0) {
                    withReminders = true;
                    break;
                }
            }

            if (withReminders) {
                counter++;
                continue;
            }

            smallestNumber = counter;
        }

        return smallestNumber;
    }
}
