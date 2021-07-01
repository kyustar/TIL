# 176. Second Highest Salary

Date: July 1, 2021
Tags: Leetcode
문제링크: https://leetcode.com/problems/second-highest-salary/
핵심: 서브쿼리

문제가 2번째로 큰 급여를 출력하는 문제였다. 그래서 limit 1,1을 이용하여 2번째를 출력했는데, 2번째가 없는 경우 null을 return 해야하는 조건에 어긋났다.

```sql
select salary as SecondHighestSalary from employee where salary limit 1,1;
```

그래서 서브쿼리를 이용하여 최대를 뽑은 뒤 그것보다 작은수 중에서 최대를 뽑는 형태로 문제를 풀었다.

```sql
select max(salary) as SecondHighestSalary from employee
where salary < (select max(salary) from employee)
```

아직까지 막혔을때 해결할만한 능력이 갖춰지지 않은것 같다. 많은 문제를 풀며, 빈 부분을 채워야겠다.