from random import random

# Random Number Generation Using List Comprehension
# Timings For First Race
race_one = [round(random() * 10, 2) for i in range(10)]

# Timings For Second Race
race_two = [round(random() * 10, 2) for i in range(10)]

# Timings For Third Race
race_three = [round(random() * 10, 2) for i in range(10)]

# Timings For Fourth Race
race_four = [round(random() * 10, 2) for i in range(10)]

# Calculate Averages
averages = []
for i in range(10):
	averages.append(round((race_one[i] + race_two[i] + race_three[i] + race_four[i]) / 4, 2))

# Find Min
min = averages[0]
racer = 0
for i in range(1, 10):
	if (min > averages[i]):
		min = averages[i]
		racer = i

print ("Winner Racer #" + str(racer + 1))
print ("Slowest Timing: " + str(min))