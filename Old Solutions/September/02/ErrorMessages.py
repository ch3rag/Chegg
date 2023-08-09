import traceback
import numpy as np

try:
    data = np.loadtxt('forestfires.csv')
except ValueError:
    traceback.print_exc()
    