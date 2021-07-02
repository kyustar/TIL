# datetime을 order by 하면 어떤 결과가 나올까?

Date: July 2, 2021
Tags: 프로그래머스
핵심: datetime order by

숫자에 대한 오름차순으로 정렬하는지? 아니면 날짜가 가까운순으로 정렬하는지? 늘 헷깔린다.

정렬 원리를 찾아보고 잊지 않도록 해야겠다.

```sql
select animal_id, name, datetime from animal_ins order by name, datetime;
```

이름이 같을시에 오름차순으로 Datetime을 정렬하도록 만들었다. 그에 대한 결과가 아래다.

[결과](https://www.notion.so/c11a7ccce8a44cd09d59d8221e36e67a)

—> **datetime을 오름차순으로 정렬하면, 숫자 자체를 오름차순으로 정렬한다고 생각하면 되겠다.**

(생각해보면 datetime에 대한 연산이 가능하다는건 숫자로 인식하고 있다는게 맞는것 같다.)