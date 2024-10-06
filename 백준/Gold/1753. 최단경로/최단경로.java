import java.util.*;
import java.io.*;

class Main{
	
	static class Node implements Comparable<Node>{
		int end;
		int value;
		Node(int end, int value){
			this.end = end;
			this.value = value;
		}
		
		@Override
		public int compareTo(Node n) {
			return this.value - n.value;
		}
	}
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int V = Integer.parseInt(st.nextToken());//정점
		int E = Integer.parseInt(st.nextToken());//노드
		int K = Integer.parseInt(br.readLine());//출발
		int INF = 999999;
		
		List<Node>[] nodeArr = new ArrayList[V+1];
		for(int i=0; i<=V; i++) {
			nodeArr[i] = new ArrayList<>();
		}
		int[] dist = new int[V+1];//1에서V까지
		
		for(int i=1; i<=V; i++) {
			dist[i] = INF;
		}
		dist[K] = 0;
		
		for(int i=1; i<=E; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int value = Integer.parseInt(st.nextToken());
			Node n = new Node(end, value);
			nodeArr[start].add(n);
		}
		
		PriorityQueue<Node> pq = new PriorityQueue<>();
		int tmp = K;//현재 찾는 위치
		for(Node n : nodeArr[K]) {
			pq.add(n);
		}
		
		boolean[] isVisited = new boolean[V+1];
		isVisited[K] = true;
		
		while(!pq.isEmpty()) {
			Node n = pq.poll();
			if(n.value < dist[n.end]) {
				dist[n.end] = n.value;
			}
			
			if(isVisited[n.end]==false) {

				for(Node nn : nodeArr[n.end]) {
					nn.value += dist[n.end];
					pq.add(nn);
				}
				
				isVisited[n.end] = true;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=V; i++) {
			if(dist[i]==INF) {
				sb.append("INF").append('\n');
			}
			else {
				sb.append(dist[i]).append('\n');
			}
		}
		
		System.out.println(sb);
	}
}