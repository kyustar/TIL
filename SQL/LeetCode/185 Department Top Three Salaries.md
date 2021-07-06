# 185. Department Top Three Salaries

Date: July 6, 2021
Tags: Leetcode
문제링크: https://leetcode.com/problems/department-top-three-salaries/
핵심: join, self join

문제를 푸는데 전혀 감이 잡히지 않았다.

어려웠던 부분 (부서별 최고급여 3개를 뽑아야한다.)

- 동점이 나왔을 경우, 사람 3명이 아닌 3 종류의 급여를 기준으로 이름을 출력한다.
- 만약 부서별 급여 종류가 2개 일때는 2개만 출력

```sql
select d.Name as Department, e1.Name as Employee, e1.Salary
from Employee as e1 left join Department as d on e1.DepartmentId = d.Id
where 3 > 
(
    select count(distinct(e2.Salary))
    from Employee as e2 
    where e2.Salary > e1.Salary
        and e1.DepartmentId = e2.DepartmentId
)
```

self join으로 부서가 같고, 중복없이 급여의 수가 3개 이하인 것으로 범위를 줄여버렸다.

'자기보다 큰 값이 3개이하' 이부분이 가장 핵심 포인트인 것 같다.

떠오르지 않았지만, 이해라도 하도록 내일 한번 더 봐야겠다.