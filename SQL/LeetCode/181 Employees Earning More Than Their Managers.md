# 181. Employees Earning More Than Their Managers

Date: July 1, 2021
Tags: Leetcode
문제링크: https://leetcode.com/problems/employees-earning-more-than-their-managers/
핵심: self join,  from 테이블 여러개

하나의 테이블에서 일반 직원이 매니저 보다 많은 급여는 받는 결과를 추출하는 것이다.

테이블에는 id, managerId가 존재했고, 매니저는 managerId가 null이다.

처음에는 어떻게 같은 테이블에 있는 정보를 참고하여 값을 낼 수 있을까?에 대한 고민을 하다가 풀지 못하였다.

다른사람의 풀이를 찾아보니, self join이라는 것을 사용하여서 문제를 풀었다.

```sql
select a.Name as Employee from Employee as a inner join Employee as b
on a.ManagerId = b.Id where a.Salary > b.Salary;
```

self join을 참고하여 푼 해답이다.

결과 : 317 ms, faster than 66.26% of MySQL online submissions

하지만, 속도가 그리 좋지 못하였고, solution을 확인해보니 join을 사용하지 않고 답을 구하였다.

```sql
select * from Employee as a, Employee as b;
```

![181%20Employees%20Earning%20More%20Than%20Their%20Managers.png](./img/181%20Employees%20Earning%20More%20Than%20Their%20Managers.png)

이 처럼 from절에 2개의 테이블을 그냥 나열하니, 모든 경우의 수를 만들어주었다. **생각해보니 id를 찾고 managerId가 같은 항목을 찾는 join보다 모든 경우의 수를 만드는것이 더 빠를것이라는 생각이 들었다.**

```sql
select a.Name as Employee from Employee as a, Employee as b
where a.ManagerId = b.Id and a.Salary > b.Salary;
```

결과 : 293 ms, faster than 88.13% of MySQL online submissions

### 속도가 향상된 모습이 보인다. leetcode에서 그간 solution이 있는줄 몰랏는데, 문제를 풀고 꼭 속도를 확인해보고 개선하는 작업을 해봐야겠다!