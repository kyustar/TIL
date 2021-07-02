# 184. Department Highest Salary

Date: July 2, 2021
Tags: Leetcode
문제링크: https://leetcode.com/problems/department-highest-salary/
핵심: in 조건 복수 가능

이제는 문제를 텍스트로 설명하기가 어려워 졌다.

중요한 부분은 각 부서별 최고의 연봉을 받는 사람들을 출력하는 것이다

ex)

IT - 90000 - 병규

IT - 90000 - 진우

HR - 50000 - 경태

이렇다면 IT 부서의 최고연봉 90000과 같은 병규, 진우를 모두 출력해야하고, HR 부서의 최고 연봉 50000인 경태까지 출력해야한다.

그래서 처음 생각한 코드는 이렇다.

```sql
select d.Name as Department, e.Name as Employee, e.Salary 
from Department as d left join Employee as e on d.Id = e.DepartmentId
where e.salary in (select max(salary) from Employee group by DepartmentId);
```

각 부서별 최고 연봉과 비교하여 같은 연봉을 받는사람들 출력!!

하지만, 여기에는 문제가 있다.

ex)

IT - 60000 - 병규

IT - 50000 - 진우

HR - 50000 - 경태

우선 IT 최고 연봉과 일치하는 병규가 출력된다.

그리고 HR 최고 연봉과 일치하는 경태.... 그런데 진우까지 출력된다.

---

### 왜??

### → 한마디로 각 부서별 최고연봉을 받는 것과 같은 연봉을 받는 사람을 부서와 관계없이 모두 출력하게 된 것이다...

---

그러면 어떻게 해결해야하는가??  

**→ 부서와 연봉이 모두 일치하는지를 확인해줘야한다!!**

오늘 또 알게 된 사실... IN을 사용하여 복수의 조건을 확인 할 수 있다!

아래가 그에 대한 답이다.

```sql
select d.Name as Department, e.Name as Employee, e.Salary 
from Department as d left join Employee as e on d.Id = e.DepartmentId
where (e.DepartmentId, e.salary) in 
(select DepartmentId, max(salary) from Employee group by DepartmentId);
```

이론으로 알기보다 이렇게 문제에 마딱 드려야 알 수 있는 부분이 참 많은것 같다. 어떻게 문법이 활용되는지 문제를 풀며 알게 되는것이 많다. 꾸준히 풀어봐야겠다.