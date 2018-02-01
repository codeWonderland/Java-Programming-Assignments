public class PhraseOMatic {
    public static void main (String[] args) {

        //Defining Wordlist
        String[] wordListOne = {"24/7","multi-Tier","30,000 foot","B-to-B","win-win","front-end","web-based",
                "pervassive","smart","six-sigma","critical-path","dynamic"};
        String[] wordListTwo = {"empowered","sticky","value-added","oriented","centric","distributed",
        "clustered","branded","outside-the-box","positioned","networked","focused","leveraged","aligned","targeted",
        "shared","cooperative","accelerated"};
        String[] wordListThree = {"process","tipping-point","solution","architecture","core competancy","strategy",
        "mindshare","portal","space","vision","paradigm","mission"};

        //Getting size of lists
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        //Generating random numbers for each
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        //Building phrase from lists
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        //Print out phrase
        System.out.println("What we need is a " + phrase);
    }
}
