def smallest_value_without_reminder(min, max):
    smallest_number = None

    counter = max
    while smallest_number is None:
        with_reminders = False
        for i in range(min, max):
            if counter % i != 0:
                with_reminders = True
                break

        if with_reminders:
            counter += 1
            continue

        smallest_number = counter

    return smallest_number