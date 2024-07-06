### Last digit of a large number

Define a function that takes in two non-negative integers 𝑎 and 𝑏 and returns the last decimal digit of 𝑎<sup>b</sup>. 
Note that 𝑎 and 𝑏 may be very large!

For example, the last decimal digit of 9<sup>7</sup> is 9, since 9<sup>7</sup> = 4782969. The last decimal digit of (2<sup>200</sup>)<sup>2<sup>300</sup></sup>, 
which has over 10<sup>92</sup> decimal digits, is 6. Also, please take 0<sup>0</sup> to be 1.

You may assume that the input will always be valid.

#### Examples

```
lastDigit(new BigInteger("4"), new BigInteger("1")) // returns 4
lastDigit(new BigInteger("4"), new BigInteger("2")) // returns 6
lastDigit(new BigInteger("9"), new BigInteger("7")) // returns 9
lastDigit(new BigInteger("10"), new BigInteger("10000000000")) // returns 0
```

Link to the task: https://www.codewars.com/kata/5511b2f550906349a70004e1/java