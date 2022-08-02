package LiveReviewSessionsWeek03;

public class DynamicSubstring {
    public static void main(String[] args) {
        String searchResultNew = " username:oscar  search result count: 12345 more column : more information ";
        String searchResult = "result count:34521";
        String result = searchResultNew.substring(searchResultNew.indexOf(": 12445 more")+2,searchResultNew.indexOf(" more c"));
        System.out.println("result = " + result);
    }
}
