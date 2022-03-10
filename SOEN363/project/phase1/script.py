import pandas as pd
from os import listdir

path = './results'
files = listdir('./execution')

for file in files:
    path = './results/' + '-'.join(file.split('-', 2)[:2])
    df = pd.read_csv(f'./execution/{file}')
    execution_time = df.iloc[len(df) - 1].values[0]

    with open(f'{path}/{file}', 'a') as f:
        f.write(execution_time)
