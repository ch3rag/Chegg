import math
import sys

# Get The File Name From Command Line Args
file_name = sys.argv[1]

# Open File For Reading
with open(file_name) as f:
    # Create A Nested List With The Values Read From The File
    data = [line.rsplit() for line in f]
    # Data Contains String Value. We Need To Parse Them To Float
    data = [[float(value) for value in row] for row in data]

    # Sum Of Each Column
    sums = [0] * len(data[0])
    # Mean Of Each Column
    means = []
    # Stan
    stdeviation = []

    # Compute Sum Of Each Column
    for row in range(len(data)):
        for col in range(len(data[row])):
            sums[col] += data[row][col]
    
    # Compute Mean Of Each Columm
    means = [sums[i]/len(data) for i in range(len(data[0]))]

    # Calulate Standard Deviation
    for col in range(len(data[0])):
        # Calulate Distance From Mean For Each Value In The Column
        distances = [(data[row][col] - means[col]) ** 2 for row in range(len(data))]
        # Compute It's Sum
        sumofdistances = sum(distances)
        # Compute It's Variance 
        var = sumofdistances / (len(distances) - 1)
        # Square Root Variance And Append To List
        stdeviation.append(math.sqrt(var))

    # Display Output
    for i in range(len(sums)):
        print(f'Column {i + 1}: Mean = {means[i]:.4f}, STD = {stdeviation[i]:.4f}')