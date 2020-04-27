package com.kod.testing.forum.statistics;

public class TrackStatistics {
    private int usersNumber;
    private int postsNumber;
    private int commentsNumber;
    private double averageNumberOfPostsPerUser;
    private double averageNumberOfCommentsPerUser;
    private double averageNumberOfCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics){
        this.usersNumber = statistics.usersNames().size();
        this.postsNumber = statistics.postsCount();
        this.commentsNumber = statistics.commentsCount();

        if (usersNumber !=0) {

            this.averageNumberOfPostsPerUser = (double) postsNumber / (double) usersNumber;

            this.averageNumberOfCommentsPerUser = (double) commentsNumber / (double) usersNumber;
        }
        else {
            this.averageNumberOfPostsPerUser = 0;
            this.averageNumberOfCommentsPerPost = 0;
        }
        if(postsNumber !=0){
            this.averageNumberOfCommentsPerPost = (double) commentsNumber / (double) postsNumber;
        }
        else{
            this.averageNumberOfCommentsPerPost = 0;
        }
    }

    public void showStatistics(){
        System.out.println("Statistics for forum Users");
        System.out.println("Number of Users" + getUsersNumber());
        System.out.println("Number of posts" + getPostsNumber());
        System.out.println("Number of comments" + getCommentsNumber());
        System.out.println("Average number of posts per User" + getAverageNumberOfCommentsPerUser());
        System.out.println("Average number of comments per User" + getAverageNumberOfPostsPerUser());
        System.out.println("Average number of comments per post" + getAverageNumberOfCommentsPerPost());
    }

    public int getUsersNumber() {
        return usersNumber;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    public int getCommentsNumber() {
        return commentsNumber;
    }

    public double getAverageNumberOfPostsPerUser() {
        return averageNumberOfPostsPerUser;
    }

    public double getAverageNumberOfCommentsPerUser() {
        return averageNumberOfCommentsPerUser;
    }

    public double getAverageNumberOfCommentsPerPost() {
        return averageNumberOfCommentsPerPost;
    }
}
