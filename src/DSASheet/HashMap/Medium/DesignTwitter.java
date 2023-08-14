package DSASheet.HashMap.Medium;

import java.util.*;

public class DesignTwitter {
    public static void main(String[] args) {
        System.out.println("Design Twitter");
    }

    class Twitter {

        HashMap<Integer, Set<Integer>> followings;
        HashMap<Integer, List<int[]>> tweets;
        int count;
        public Twitter() {
            this.followings = new HashMap<>();
            this.tweets = new HashMap<>();
            this.count = 0;
        }

        public void postTweet(int userId, int tweetId) {
            if(!tweets.containsKey(userId)){
                tweets.put(userId,new ArrayList<>());
            }
            tweets.get(userId).add(new int[] {count,tweetId});
            this.count+=1;
        }

        public List<Integer> getNewsFeed(int userId) {
            List<Integer> leatestTweets = new ArrayList<>();
            PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[0] - a[0]);
            followings.get(userId).add(userId);
            for(int followeeId : followings.get(userId)){
                if(tweets.containsKey(followeeId)){
                    int index = tweets.get(followeeId).size() - 1;
                    int[] tweet =  tweets.get(followeeId).get(index);
                    pq.add(new int[] {tweet[0],tweet[1],followeeId,index - 1});
                }
            }

            while(!pq.isEmpty() && leatestTweets.size() < 10){
                int[] topTweet = pq.remove();
                leatestTweets.add(topTweet[1]);
                if(topTweet[3] >= 0){
                    int[] tweet =  tweets.get(topTweet[2]).get(topTweet[3]);
                    pq.add(new int[] {tweet[0],tweet[1],topTweet[2],topTweet[3]});
                }
            }
            return leatestTweets;
        }

        public void follow(int followerId, int followeeId) {
            if(!followings.containsKey(followerId)){
                followings.put(followerId,new HashSet<>());
            }
            followings.get(followerId).add(followeeId);
        }

        public void unfollow(int followerId, int followeeId) {
            if(followings.containsKey(followerId)){
                followings.get(followerId).remove(followeeId);
            }
        }
    }
}
