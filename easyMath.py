import math
import random
import numpy as np
from sympy import *


GoldenRatio = 1.618

def power(d,e):
    return math.pow(d, e)

def squareRoot( n):
    return math.sqrt(n)

def absoluteValue(n) :
    return math.fabs(n)

def isGoldenRatio( division,  divider):
    res = division / divider;
    if (res == GoldenRatio or res == GoldenRatio - 0.001 or res == GoldenRatio + 0.001):
        return 1
    else:
        return 0

def Logarithm( base, n):
    return math.log(n) / math.log(base)


def Permutation( n,  r):
    sum = 1
    for i in range(0,r):
        sum *= n
        n=n-1
    return sum

def Combination( n,r):
    sum = Permutation(n, r)
    divider = math.factorial(r)
    return sum / divider

def getFactorial(f) :
    return math.factorial(f)
 
def isPrime(n):
    for i in range(2,int(n**0.5)+1):
        if n%i==0:
            return False
    return True

def digitsOfNFactorial( n): 
    if n==0 or n==1:
        return 1
    else:
        math.floor(((n + 0.5) * math.log(n) - n + 0.5 * math.log(2 * math.pi)) / math.log(10)) + 1; 

def getNumbersOfDigit( n):
    if n==0 or n==1:
        return 1
    else:
        return (math.floor(math.log10(n))) + 1



def isSkewSymmetricMatrix(matrix) :
    for i in range(0,len(matrix)):
        for j in range(i+1,len(matrix)):
            if (matrix[i][j] != -matrix[j][i]):
                return 0
    return 1


# a defines a list that is two values such that one value is row lenght and other is column lenght for ones,zeros,full and random
def ones(a):    
    return np.ones(a)

def zeros(a):
    return np.zeros(a)

def full(a,b):
    return np.full(a,b)

def randomMatrix(a,b):
    return [[random.random() for e in range(a)] for e in range(b)]


# a defines an integer value for the lenght of one dimension of square matrix
def identity(a):
    return np.eye(a)


# x and y defines a list value for matrix
def addMatrix(x,y):
    return np.add(x, y)

def subtractMatrix(x,y):
    return np.subtract(x, y)

def multiplyMatrix(x,y):
    return np.dot(x,y)

def transposeMatrix(x):
    return np.transpose(x)

def determinantMatrix(x):
    return np.linalg.det(x)

def inverseMatrix(x):
    return np.linalg.inv(x)


def PrimeFactors(number):
    listOfPrimeFactors=[]
    for i in range(2,number+1):
        if (number % i == 0):
            number /= i
            listOfPrimeFactors.append(i)
            i=i-1
    return listOfPrimeFactors



#GCD returns the greatest common divisor of two numbers recursively.
def GCD(a,b):
    if(b==0):
        return a
    else:
        return GCD(b,a%b)

#Returns least common multiple of two numbers. Uses GCD method of this library.
def LCM(a,b):
    return a * (b / GCD(a, b))





#symbolic mathematic

def expand1(func):
    return expand(func)

def simplify1(func):
    return simplify(func)

def limit1(func,func2,value):
    return limit(func,func2,value)

def diff1(func,dx):
    return diff(func,dx)

def higherdiff1(func,dx,time):
    return diff(func,dx,time)

def integrate1(func,dx):
    return integrate(func,dx)

def defintegrate1(func,dx,upper,lower):
    return integrate(func,(dx,upper,lower))







