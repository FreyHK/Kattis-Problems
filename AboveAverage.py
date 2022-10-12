import sys

c = int(input())
cases = []
avr = []
i = 0

for line in sys.stdin:
    inp = line.split()
    
    n = int(inp[0])

    sum = 0
    grades = []
    for j in range(n):
        a = int(inp[j+1])
        grades.append(a)
        sum += a
    
    cases.append(grades)
    if n == 0:
        avr.append(0)
    else:
        avr.append(sum/n)

    # Stop reading if last line
    if (i >= c-1):
        break
    i+=1

for j in range(len(cases)):

    sumOver = 0
    for grade in cases[j]:
        if (grade > avr[j]):
            sumOver += 1
    
    if len(cases[j]) == 0:
        print('0.000%')
    else:
        a = sumOver/len(cases[j]) * 100
        print(f'{a:.3f}%')
