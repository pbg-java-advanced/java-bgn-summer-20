public class ex13 {
    public static void main(String[] args) {

        int printNewLine = 0;
        int indexallCards = 0;
        String[] allCards = new String[52];
        String[] colors = new String[]{"diamond", "spade", "heart", "club"};
        String[] typeCard = new String[]{"2","3","4","5","6","7","8","9","10","J","Q","K","A"};

        // fill allCards array
        for(int indexColor = 0; indexColor < colors.length; indexColor++){
            for(int indexType = 0; indexType < typeCard.length; indexType++, indexallCards++){
            allCards[indexallCards] = "" + colors[indexColor] + " '"+  typeCard[indexType] + "'";
            }
        }

        //print what inside allCards array
        System.out.println("All cards are: ");
        for(int printIndex = 0; printIndex < allCards.length; printIndex++){
            System.out.println(allCards[printIndex]);
        }

    }
}
