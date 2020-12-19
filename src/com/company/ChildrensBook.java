package com.company;

public class ChildrensBook extends Book{

    private String recommendedAgeInfo;

    public ChildrensBook(String title, String author, int price, long ID,  String recommendedAgeInfo) throws IncorrectProductIdException {
        super(title, author, ID, price);
        this.recommendedAgeInfo = recommendedAgeInfo;
    }


    public String getRecommendedAgeInfo() {
        return recommendedAgeInfo;
    }

    public void setRecommendedAgeInfo(String recommendedAgeInfo) {
        this.recommendedAgeInfo = recommendedAgeInfo;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.printf("Age Recommendation: %20s\n",recommendedAgeInfo);

    }
}
