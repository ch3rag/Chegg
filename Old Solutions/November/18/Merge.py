dict1 = {'Ten': 10, 'Twenty': 20, 'Thirty': 30}
dict2 = {'Thirty': 30, 'Forty': 40, 'Fifty': 50}

# There Are Many Ways To Do It

# 1. The Old Way
# Create A Copy Of First Dictionary
dict3 = dict1.copy()
# Update New Dictionary With Second Dictionary
dict3.update(dict2)

print(dict3)


# 2. In Newer Versions Of Python (>= 3.5) You Can Do
dict4 = {**dict1, **dict2}

print(dict4)
