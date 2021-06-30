# Union find (유니온 파인드)

유니온 파인드는 독립된 노드를 하나의 뭉치로 만드는 Union과 각 노드에 연결된 노드중 가장 낮은 노드값을 해당 노드에 넣어주어서 같은 뭉치인지 확인하는 find 로 이루어져있다.

주로 노드를 연결하여 가장 많은 뭉치를 가지는 수를 구하는 문제가 많다! 

(최상 부모노드가 같으면 같은 뭉치!)

```java
public class UnionFind {
	
	private static void makeset(int[] p) {
		for (int i = 1; i < p.length; i++) {
				p[i] = i;
				System.out.print(p[i]+" ");
		}
		System.out.println();
	}
	//x의 부모를 찾아서 return
	private static int getParent(int[] p, int x) {
		//부모 제일 꼭대기에 있는 경우
		if(p[x] == x) {
			return x;
		}
		//아닌경우는 재귀를 통해 탐색 (올라갔다가 내려오면서 값을 정정해줘야 시간이 줄어듬!!)
		return p[x] = getParent(p, p[x]);
	}

	//입력된 정점의 부모를 찾아 연결해 준다. (부모가 작은값에 달아주기)
	private static void unionParent(int[] p,int x, int y) {
		int a = getParent(p, x);
		int b = getParent(p, y);
		
		if (a != b) {
      if(a < b) {
				p[b] = a;
			}
			else {
				p[a] = b;
			}
		}
	}
	
	private static boolean isSameParent(int[] p, int x, int y) {
		if(p[x] == p[y]) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		//부모의 값
		int[] p = new int[11];
		makeset(p);
		unionParent(p, 1, 2);
		unionParent(p, 2, 3);
		unionParent(p, 4, 3);
		unionParent(p, 5, 6);
		unionParent(p, 6, 7);
		unionParent(p, 7, 8);
		
		for (int i = 1; i < p.length; i++) {
			System.out.print(p[i]+ " ");
		}
		System.out.println();
		
		System.out.println(isSameParent(p, 2, 5));
	}

}
```