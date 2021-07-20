# 유클리드 호제법

유클리드 호제법은 나눗셈만 반복해서 최대공약수(GCD)를 구할 수 있다.

두 개의 자연수 a와 b(단 a>b) 

r = a % b 일때 GCD(a, b) = GCD(b, r) 

r이 0이면 그때 b가 최대공약수이다.

## 최대공약수(GCD) 코드

반복문

```java
public int gcd(int a, int b){
    while(true){
        int r = a%b;
        if(r==0) return b;
		
        a = b;
        b = r;
    }
}
```

재귀

```java
public int gcd(int a, int b){
    if(b == 0)return a;
    else return gcd(b,a%b);
}
```

## 최소공배수(LCM) 코드

```java

public int lcm(int a, int b){
    return a * b / GCD(a,b);
}
```