import easyMath
from sympy import *

a=([[3,5,7],[2,0,8],[9,6,1]])
b=([[3,1],[2,7]])

x=Symbol('x')
y=Symbol('y')

print easyMath.power(10,5)
print easyMath.squareRoot(10)
print easyMath.absoluteValue(-10)
print easyMath.isGoldenRatio(10,5)
print easyMath.Logarithm(10,5)
print easyMath.Permutation(10,5)
print easyMath.Combination(10,5)
print easyMath.getFactorial(10)
print easyMath.isPrime(10)
print easyMath.digitsOfNFactorial(10)
print easyMath.getNumbersOfDigit(10)
print easyMath.transposeMatrix(a)
print easyMath.isSkewSymmetricMatrix(a)
print easyMath.determinantMatrix(a)
print easyMath.PrimeFactors(10)
print easyMath.multiplyMatrix(b,b)
print easyMath.GCD(10,5)
print easyMath.LCM(10,5)
print easyMath.randomMatrix(3,2)
print easyMath.diff1(x**2,x)
