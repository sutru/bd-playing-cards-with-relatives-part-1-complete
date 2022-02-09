package com.frank;

import java.util.ArrayList;
import java.util.List;

public class UsePlayingCards {
// This is our application program which will instantiate object and use thier methods to manipulate them
// We know this is the application program because it has the main() method
	public static void main(String[] args) {

		AmericanPlayingCard aUSACard = new AmericanPlayingCard(AmericanPlayingCard.CardValue.ONE, AmericanPlayingCard.CardSuit.HEART);
		System.out.println("aUSACard is :");
		aUSACard.showCard();  // runs the AmericanPlayingCard showCard()

		AmericanPlayingCard aUSACard2 = new AmericanPlayingCard(AmericanPlayingCard.CardValue.KING, AmericanPlayingCard.CardSuit.SPADE);
		System.out.println("aUSACard2 is :");
		aUSACard2.showCard();  // runs the AmericanPlayingCard showCard()

		ItalianPlayingCard italianPlayingCard = new ItalianPlayingCard(ItalianPlayingCard.CardValue.CAVALLO, ItalianPlayingCard.CardSuit.COINS);
		System.out.println("italian: ");
		italianPlayingCard.showCard();
		SwissPlayingCard swissPlayingCard = new SwissPlayingCard(SwissPlayingCard.CardValue.FIVE, SwissPlayingCard.CardSuit.ACORNS);
		System.out.println("swiss: ");
		swissPlayingCard.showCard();

		System.out.println("-".repeat(50) + "\n Polymorphism \n" + "-".repeat(50));

		System.out.println("italian: ");
		PlayingCard card;
		card = italianPlayingCard;
		card.showCard();

		System.out.println("swiss: ");
		card = aUSACard;
		card.showCard();

		List<PlayingCard> cards = new ArrayList<>();
		cards.add(card);
		cards.add(italianPlayingCard);
		cards.add(swissPlayingCard);
		cards.add(aUSACard);
		cards.add(aUSACard2);
		for (PlayingCard playingCard: cards) {
			playingCard.showCard();
		}
	}  // End of main()

}  // End of class that holds main()
