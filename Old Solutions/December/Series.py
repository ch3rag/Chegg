import pandas as pd

ser = pd.Series([None, 2, None, 4, None])
print(ser.bfill())