# Input The Number Of Peoples
numPeoples = int(input('How many peope are sharing pizza? '))

# Input Number Of Pizzas Ordered
numPizzas = int(input('How many pizzas will be ordered? '))

# Input Number of People Opting For Only 2 Slices
limitTwo = int(input('How many will limit themselves to two slices? '))

# Calculate Number Of Slices
numSlices = numPizzas * 10

# Slices Left After People Eating 2 Slices Took Share
numSlices -= limitTwo * 2

# Smaller Share
smallShare = numSlices // (numPeoples - limitTwo)

# Extra Slices
extraSlices = numSlices % smallShare

# Large Share
largeShare = smallShare + 1

# People Getting Small Share
smallSharePeoples = numPeoples - limitTwo - extraSlices

# People Getting Large Share
largeSharePeoples = numPeoples - limitTwo - smallSharePeoples

# Display Result
print(f'You will divide {numPizzas * 10} slices -- ', end = '')

# Generate A List of Infomation About Pizza Distribution Info
result = []

# Info About People Getting Only Two Slices
if limitTwo > 0:
    result.append(f'{limitTwo} will have 2')

# Info About People Getting Small Share
if smallSharePeoples > 0:
    result.append(f'{smallSharePeoples} will have {smallShare}')

# Info About People Getting Large Share
if largeSharePeoples > 0:
    result.append(f'{largeSharePeoples} will have {largeShare}')

# Join Info With Comma And Display
print(', '.join(result))
print()
