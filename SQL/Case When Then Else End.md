# Case When Then Else End

Date: July 2, 2021
Tags: 프로그래머스
문제링크: https://programmers.co.kr/learn/courses/30/lessons/59409
핵심: Case When Then Else End

SQL을 작성할때, 조건문을 어떻게 처리해야할지 혼동이 오는 경우가 많다.

이번에는 select에서 서브쿼리로 자주 사용하는 Case When Then Else End에 대해서 알아보자

우선 문법은 if else문과 거의 비슷하다.

---

Case

When [조건]

Then [조건이 참일때 처리]

Else [그외에 처리]

End

---

이것말고

Case

When [조건1]

Then [조건1에 대한 처리]

When [조건2]

Then [조건2에 대한 처리]

Else [조건1, 2 모두 해당하지 않을 때에 처리]

End

(if, else if, else 와 흡사하다.)

---

연관 문제

[https://programmers.co.kr/learn/courses/30/lessons/59409](https://programmers.co.kr/learn/courses/30/lessons/59409)

```sql
select animal_id, name, 
(case 
    when(sex_upon_intake like "Neutered%" or sex_upon_intake like "Spayed%") 
    then ("O") 
    else ("X") 
end) as 중성화 
from animal_ins
```