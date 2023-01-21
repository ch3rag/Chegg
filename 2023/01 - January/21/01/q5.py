from tma02_stats import median
from tma02_stats import mean
from tma02_stats import corr_coef

""" You can use one of two approaches
1)  add suitable code below and then run this file
2)  run this file first then do the calculation in the
    python interactive shell.
"""

# Billions of hours given in volunteering 2005 - 2014 (ONS)
volunteeringHours = [2.28, 2.28, 2.27, 2.19, 2.11, 2.05, 2.05, 2.12, 2.09, 1.97]
volunteeringHours = [2.28, 2.28, 2.27, 2.19, 2.11, 2.05, 2.05, 2.12, 2.09, 1.97]

# Median age of population 2005 - 2014 (ONS)
populationAge = [38.7, 38.9, 39.0, 39.1, 39.3, 39.5, 39.6, 39.7, 39.9, 40.0]
populationAge = [38.7, 38.9, 39.0, 39.1, 39.3, 39.5, 39.6, 39.7, 39.9, 40.0]

# Part - A
#  Finding Median And Mean Of volunteeringHours
meanVH = mean(volunteeringHours)
medianVH = median(volunteeringHours)

# Print The Result
print('Median of volunteeringHours:', medianVH, 'billon hours')
print('Median of volunteeringHours (rounded to 2 decimals):', round(medianVH, 2), 'billon hours')

print()

print('Mean of volunteeringHours:', meanVH, 'billon hours')
print('Mean of volunteeringHours (rounded to 2 decimals):', round(meanVH, 2), 'billon hours')

print()

# Part - B
# Finding Correlation Coefficient B/W volunteeringHours And populationAge
corrCoef = corr_coef(volunteeringHours, populationAge)

# Print Result
print('Correlation Coefficient B/W volunteeringHours & populationAge:', corrCoef)
print('Correlation Coefficient B/W volunteeringHours & populationAge:', round(corrCoef, 2))
print('This is a Very High Negative Correlation')