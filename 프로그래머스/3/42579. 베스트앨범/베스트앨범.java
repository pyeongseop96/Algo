import java.util.*;

class Pair {
    int plays;
    int no;
    public Pair(int plays, int no){
        this.plays = plays;
        this.no = no;
    }
}

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> genresPlaySum = new HashMap<>();
        Map<String, PriorityQueue<Pair>> PairMap = new HashMap<>();
        for(int i=0; i<genres.length; i++){
            genresPlaySum.put(genres[i], genresPlaySum.getOrDefault(genres[i], 0) + plays[i]);
            PairMap.putIfAbsent(genres[i], new PriorityQueue<Pair>((a,b) -> {
                if(a.plays == b.plays){
                    return a.no - b.no;
                }
                return b.plays - a.plays;
            }));
                              PairMap.get(genres[i]).offer(new Pair(plays[i], i));
        }   
        Map<Integer, String> findMorePlayGenre = new TreeMap<>((a,b) -> b - a);
                              for(var entry : genresPlaySum.entrySet()){
                                  findMorePlayGenre.put(entry.getValue(), entry.getKey());
                              }
        List<Integer> ansList = new ArrayList<>();
                              for(String genre: findMorePlayGenre.values()){
                                  ansList.add(PairMap.get(genre).poll().no);
                                  if(PairMap.get(genre).peek() != null){
                                      ansList.add(PairMap.get(genre).poll().no);
                                  }
                              }
        int[] answer = new int[ansList.size()];
                              for(int i=0; i<ansList.size(); i++){
                                  answer[i] = ansList.get(i);
                              }
        return answer;
    }
}